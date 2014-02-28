/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import tunipharma.entities.Reclamation;
import tunipharma.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import tunipharma.entities.Evenement;

public class DaoReclamation {
    
    
        public java.util.List<Reclamation> DisplayAllReclamations() {


        java.util.List<Reclamation> listedepots = new ArrayList<Reclamation>();

      String requete = "select * from reclamation";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Reclamation reclamation = new Reclamation();
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setMsgReclamation(resultat.getString(2));
                reclamation.setDateReclamation(resultat.getDate(3));
                reclamation.setFkidPatient(resultat.getInt(4));
                reclamation.setHeureReclamation(resultat.getTime(5));
                listedepots.add(reclamation);
            }
                        System.out.println("reclamation affiche");

            return listedepots;
            
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }
         public Reclamation findReclamationById(int idReclamation){
    Reclamation reclamation = new Reclamation();
     String requete = "select * from evenements where idEvent =?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, idReclamation);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setMsgReclamation(resultat.getString(2));
                reclamation.setDateReclamation(resultat.getDate(3));
                reclamation.setFkidPatient(resultat.getInt(4));
                reclamation.setHeureReclamation(resultat.getTime(5));

            }
            return reclamation;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de la note "+ex.getMessage());
            return null;
        }
    }            

             
          public void deleteReclamation(int id) {
        String requete = "delete from reclamation where idReclamation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("reclamation supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

       public void insertReclamations(Reclamation reclamation){

        String requete = "insert into reclamation (msgReclamation,dateReclamation,fkidPatient,heureReclamation) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, reclamation.getMsgReclamation());
            ps.setDate(2, reclamation.getDateReclamation());
            ps.setInt(3, reclamation.getFkidPatient());
            ps.setTime(4, reclamation.getHeureReclamation());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès de la reclamation ");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
                    public java.util.List<Reclamation> DisplayAllReclamationByIdPatient(int idPatient){ 

        java.util.List<Reclamation> listeEvenements = new ArrayList<Reclamation>();

        String requete = "select * from reclamation where ( fkidPatient = '" + idPatient + "' )";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Reclamation reclamation =new Reclamation();
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setMsgReclamation(resultat.getString(2));
                reclamation.setDateReclamation(resultat.getDate(3));
                reclamation.setFkidPatient(resultat.getInt(4));
                reclamation.setHeureReclamation(resultat.getTime(5));

                listeEvenements.add(reclamation);
            }
            return listeEvenements;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
        
                    public void updateReclamations(Reclamation rec){
        String requete = "update reclamation set msgReclamation=?,dateReclamation=?,heureReclamation=? where idReclamation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, rec.getMsgReclamation());
            ps.setDate(2, rec.getDateReclamation());
            ps.setTime(3, rec.getHeureReclamation());      
            ps.setInt(4, rec.getIdReclamation());

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès de la reclamation");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
          
}
