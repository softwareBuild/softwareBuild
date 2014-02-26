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
                reclamation.setHeureReclamation(resultat.getString(5));
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

    
        
        
        
        
}
