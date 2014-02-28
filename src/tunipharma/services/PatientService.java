/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.services;

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
public class PatientService {
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
