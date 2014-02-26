/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import tunipharma.entities.Admin;
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
     
}
