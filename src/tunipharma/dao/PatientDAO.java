/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Patient;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class PatientDAO { 
        
    public void insertPatient(Patient p){

        String requete = "insert into patient (login,password,nom,prenom,adresse) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getLogin());
            ps.setString(2, p.getPassword());
            ps.setString(3, p.getNom() );
            ps.setString(4, p.getPrenom() );
            ps.setString(5, p.getAdresse() );
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    public void updatePatient(Patient p){
        String requete = "update Patient set login=?,password=?,nom=?,prenom=?,adresse=? where idPatient=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getLogin());
            ps.setString(2, p.getPassword());
            ps.setString(3, p.getNom() );
            ps.setString(4, p.getPrenom() );
            ps.setString(5, p.getAdresse());
            ps.setInt(6, p.getIdPatient());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deletePatient(int id){
        String requete = "delete from patient where idPatient=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Patient supprimée");
        } catch (SQLException ex) {
          System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

    public List<Patient> DisplayAllPatient (){

        List<Patient> listePatients = new ArrayList<Patient>();

        String requete = "select * from patient";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Patient patient =new Patient();
                
                patient.setIdPatient(resultat.getInt(1));
                patient.setLogin(resultat.getString(2));
                patient.setPassword(resultat.getString(3));
                patient.setNom(resultat.getString(4));
                patient.setPrenom(resultat.getString(5));
                patient.setAdresse(resultat.getString(6));

                listePatients.add(patient);
            }
            return listePatients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
    
    
    
    
    public Patient findPatientById(int id){
    Patient patient = new Patient();
     String requete = "select * from patient where idPatient=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                patient.setIdPatient(resultat.getInt(1));
                patient.setLogin(resultat.getString(2));
                patient.setPassword(resultat.getString(3));
                patient.setNom(resultat.getString(4));
                patient.setPrenom(resultat.getString(5));
                patient.setAdresse(resultat.getString(6));
            }
            return patient;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

    public Patient findPatientByAdresse(String adr){
    Patient patient = new Patient();
     String requete = "select * from patient where idPatient = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, adr);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                patient.setIdPatient(resultat.getInt(1));
                System.out.println("testttttttt"+ patient.getNom());
                patient.setNom(resultat.getString(2));
                System.out.println(resultat.getString(2));
            }
            return patient;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

    public List<Patient> DisplayAllPatientByAdresse(String adr){ 

        List<Patient> listePatients = new ArrayList<Patient>();

        String requete = "select * from patient where ( adresse = '" + adr + "' )";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Patient patient =new Patient();
                patient.setIdPatient(resultat.getInt(1));
                patient.setLogin(resultat.getString(2));
                patient.setPassword(resultat.getString(3));
                patient.setNom(resultat.getString(4));
                patient.setPrenom(resultat.getString(5));
                patient.setAdresse(resultat.getString(6));

                listePatients.add(patient);
            }
            return listePatients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
}
