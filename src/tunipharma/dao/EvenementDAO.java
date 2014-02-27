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
import tunipharma.entities.Evenement;
import tunipharma.entities.Patient;
import tunipharma.entities.Pharmacien;
import tunipharma.util.MyConnection;

/**
 *
 * @author omar
 */
public class EvenementDAO {
    public void insertEvenements(Evenement e){

        String requete = "insert into evenements (idEvent,libEvent,dateEvent,heureEvent,lieuEvent,fklibellePharmacie) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, e.getIdEvent());
            ps.setString(2, e.getLibEvent());
            ps.setDate(3, e.getDateEvent());
            ps.setTime(4, e.getHeureEvent());
            ps.setString(5, e.getLieuEvent());
            ps.setString(6, e.getFklibellePharmacie());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès d'evenements ");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
        
        public void updateEvenements(Evenement e){
        String requete = "update evenements set idEvent =?,libEvent=?,dateEvent=?,heureEvent=?,lieuEvent=?,fklibellePharmacie =? where phLibelle=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
           ps.setInt(1, e.getIdEvent());
            ps.setString(2, e.getLibEvent());
            ps.setDate(3, e.getDateEvent());
            ps.setTime(4, e.getHeureEvent());
            ps.setString(5, e.getLieuEvent());
            ps.setString(6, e.getFklibellePharmacie());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès de l'evenement");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
           
         public void deleteEvenement( String  FklibellePharmacie){
        String requete = "delete from evenements  where fklibellePharmacie=?" ;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, FklibellePharmacie);
            ps.executeUpdate();
            System.out.println("evenement supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
       
    }
        public List<Evenement> DisplayAllEvenement (){

        List<Evenement> listeEvenements = new ArrayList<Evenement>();

        String requete = "select * from evenements";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Evenement evenement =new Evenement();
                
                evenement.setIdEvent(resultat.getInt(1));
                evenement.setLibEvent(resultat.getString(2));
                evenement.setDateEvent(resultat.getDate(3));
                evenement.setHeureEvent(resultat.getTime(4));
                evenement.setLieuEvent(resultat.getString(5));
                evenement.setFklibellePharmacie(resultat.getString(6));

                listeEvenements.add(evenement);
            }
            return listeEvenements;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
             public List<Evenement> DisplayAllEvenementByLibelle(String libelle){ 

        List<Evenement> listeEvenements = new ArrayList<Evenement>();

        String requete = "select * from evenements where ( fklibellePharmacie = '" + libelle + "' )";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Evenement evenement =new Evenement();
                evenement.setIdEvent(resultat.getInt(1));
                evenement.setLibEvent(resultat.getString(2));
                evenement.setDateEvent(resultat.getDate(3));
                evenement.setHeureEvent(resultat.getTime(4));
                evenement.setLieuEvent(resultat.getString(5));
                evenement.setLibEvent(resultat.getString(6));

                listeEvenements.add(evenement);
            }
            return listeEvenements;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }


}
