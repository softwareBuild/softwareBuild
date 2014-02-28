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

import tunipharma.entities.Pharmacie;
import tunipharma.entities.Pharmacien;
import tunipharma.util.MyConnection;

/**
 *
 * @author sahar
 */
public class PharmacieDao {
    
     public void insertPharmacie(Pharmacie f){


        String requete = "insert into pharmacie (phLibelle,phRaisonSocial,phMatriculeFiscale,phRegistre,phAdresse,typePharmacie,garde) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, f.getPhLibelle());
            ps.setString(2, f.getPhRaisonSocial());
            ps.setInt(3, f.getPhMatriculeFiscale());
            ps.setString(4, f.getPhRegistre());
            ps.setString(5, f.getPhAdresse());
            ps.setString(6, f.getTypePharmacie());
            ps.setInt(6, f.getGarde());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     
     public void updatePharmacien(Pharmacie f){
        String requete = "update pharmacie set phLibelle=?,phRaisonSocial=?,phMatriculeFiscale=?,phRegistre=?,phAdresse=?,typePharmacie=?,garde=? where phMatriculeFiscale=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
           ps.setString(1, f.getPhLibelle());
            ps.setString(2, f.getPhRaisonSocial());
            ps.setInt(3, f.getPhMatriculeFiscale());
            ps.setString(4, f.getPhRegistre());
            ps.setString(5, f.getPhAdresse());
            ps.setString(6, f.getTypePharmacie());
            ps.setInt(7, f.getGarde());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
     
     public void deletePharmacien( Pharmacie f ,String phMatriculeFiscale){
        String requete = "delete from pharmacie  where phMatriculeFiscale=?" ;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(3,f.getPhMatriculeFiscale());
            ps.executeUpdate();
            System.out.println("Pharmacie supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
     
     public Pharmacie findPharmacieById(int phMatriculeFiscale){
    Pharmacie  f = new Pharmacie();
     String requete = "select * from pharmacie  where phMatriculeFiscale=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(3, phMatriculeFiscale);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                f.setPhMatriculeFiscale(resultat.getInt(3));
           
            }
            return f;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de la pharmaciie "+ex.getMessage());
            return null;
        }
    }

     public List<Pharmacie> DisplayAllPharmacie(){

        List<Pharmacie> listePharmacies = new ArrayList<Pharmacie>();

        String requete = "select * from Pharmacie";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Pharmacie pharmacie =new Pharmacie();
                pharmacie.setPhLibelle(resultat.getString(1));
                pharmacie.setPhRaisonSocial(resultat.getString(2));
                pharmacie.setPhMatriculeFiscale(resultat.getInt(3));
                pharmacie.setPhRegistre(resultat.getString(4));
                pharmacie.setPhAdresse(resultat.getString(5));
                pharmacie.setTypePharmacie(resultat.getString(6));
                pharmacie.setGarde(resultat.getInt(7));
                listePharmacies.add(pharmacie);
            }
            return listePharmacies;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
     
      public List<Pharmacie> DisplayAllPharmacieByLibelle(String lib){

        List<Pharmacie> listePharmacies = new ArrayList<Pharmacie>();

        //String requete = "select * from Pharmacie where phLibelle Like'%" + lib + "%'" ;
        String requete = "select * from Pharmacie where phLibelle = '" + lib +"'" ;
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Pharmacie pharmacie =new Pharmacie();
                pharmacie.setPhLibelle(resultat.getString(1));
                pharmacie.setPhRaisonSocial(resultat.getString(2));
                pharmacie.setPhMatriculeFiscale(resultat.getInt(3));
                pharmacie.setPhRegistre(resultat.getString(4));
                pharmacie.setPhAdresse(resultat.getString(5));
                pharmacie.setTypePharmacie(resultat.getString(6));
                pharmacie.setGarde(resultat.getInt(7));
                listePharmacies.add(pharmacie);
            }
            return listePharmacies;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
      
      public List<Pharmacie> DisplayAllPharmacieGarde(int garde){

        List<Pharmacie> listePharmacies = new ArrayList<Pharmacie>();

        String requete = "select * from Pharmacie where garde=" + String.valueOf(garde);
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Pharmacie pharmacie =new Pharmacie();
                pharmacie.setPhLibelle(resultat.getString(1));
                pharmacie.setPhRaisonSocial(resultat.getString(2));
                pharmacie.setPhMatriculeFiscale(resultat.getInt(3));
                pharmacie.setPhRegistre(resultat.getString(4));
                pharmacie.setPhAdresse(resultat.getString(5));
                pharmacie.setTypePharmacie(resultat.getString(6));
                pharmacie.setGarde(resultat.getInt(7));
                listePharmacies.add(pharmacie);
            }
            return listePharmacies;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
      
      public List<Pharmacie> DisplayAllPharmacieNuit(String type, int a){

        List<Pharmacie> listePharmacies = new ArrayList<Pharmacie>();

        String requete = "select * from Pharmacie where typePharmacie='" + type+"'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Pharmacie pharmacie =new Pharmacie();
                pharmacie.setPhLibelle(resultat.getString(1));
                pharmacie.setPhRaisonSocial(resultat.getString(2));
                pharmacie.setPhMatriculeFiscale(resultat.getInt(3));
                pharmacie.setPhRegistre(resultat.getString(4));
                pharmacie.setPhAdresse(resultat.getString(5));
                pharmacie.setTypePharmacie(resultat.getString(6));
                pharmacie.setGarde(resultat.getInt(7));
                listePharmacies.add(pharmacie);
            }
            return listePharmacies;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
      
      public List<Pharmacie> DisplayAllByAdresse(String adresse, int a,int b){

        List<Pharmacie> listePharmacies = new ArrayList<Pharmacie>();

        String requete = "select * from Pharmacie where phAdresse='" + adresse +"'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Pharmacie pharmacie =new Pharmacie();
                pharmacie.setPhLibelle(resultat.getString(1));
                pharmacie.setPhRaisonSocial(resultat.getString(2));
                pharmacie.setPhMatriculeFiscale(resultat.getInt(3));
                pharmacie.setPhRegistre(resultat.getString(4));
                pharmacie.setPhAdresse(resultat.getString(5));
                pharmacie.setTypePharmacie(resultat.getString(6));
                pharmacie.setGarde(resultat.getInt(7));
                listePharmacies.add(pharmacie);
            }
            return listePharmacies;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
      
        public List<Pharmacie> DisplayAllPharmcieByRegion(String region, int a,int b,int c){

        List<Pharmacie> listePharmacies = new ArrayList<Pharmacie>();

        String requete = "select * from Pharmacie where RegionPh='" + region +"'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Pharmacie pharmacie =new Pharmacie();
                pharmacie.setPhLibelle(resultat.getString(1));
                pharmacie.setPhRaisonSocial(resultat.getString(2));
                pharmacie.setPhMatriculeFiscale(resultat.getInt(3));
                pharmacie.setPhRegistre(resultat.getString(4));
                pharmacie.setPhAdresse(resultat.getString(5));
                pharmacie.setTypePharmacie(resultat.getString(6));
                pharmacie.setGarde(resultat.getInt(7));
                listePharmacies.add(pharmacie);
            }
            return listePharmacies;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
      
     
}
