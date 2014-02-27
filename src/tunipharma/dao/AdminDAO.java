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
import tunipharma.entities.Admin;
import tunipharma.entities.Reclamation;
import tunipharma.util.MyConnection;

/**
 *
 * @author omar
 */
public class AdminDAO {
       public void updateAdministrateur(Admin ad) {
        String requete = "update administrateur set idAdministrateur=?,login=?,pseudo=?,password=?,nom=?,prenom=?,adresse=? where idAdministrateur=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, ad.getIdAdministrateur());
            ps.setString(2, ad.getLogin());
            ps.setString(3, ad.getPseudo());
            ps.setString(4, ad.getPassword());
            ps.setString(5, ad.getNom());
            ps.setString(6, ad.getPrenom());
            ps.setString(7, ad.getAdresse());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }
               public java.util.List<Admin> DisplayInfoAdmin() {


        java.util.List<Admin> admins = new ArrayList<Admin>();

      String requete = "select * from administrateur";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Admin admin = new Admin();
                admin.setLogin(resultat.getString(1));
                admin.setPassword(resultat.getString(2));
                
                admins.add(admin);
            }
                        System.out.println("info admin  affiche");

            return admins;
            
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }

     
}
