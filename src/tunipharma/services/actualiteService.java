/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tunipharma.entities.Actualites;
import tunipharma.util.MyConnection;

/**
 *
 * @author OUSSAMA
 */
public class actualiteService {
    
    

      public Actualites findActualiteById(int idActualite){
    
          Actualites act =new Actualites();
          String requete = "select * from actualite where idActualite =?";
        
          try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, idActualite);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                act.setIdActualite(resultat.getInt(1));
                act.setLibelleActualite(resultat.getString(2));
                act.setImageActualite(resultat.getString(3));
                act.setDateActualite(resultat.getDate(4));
                act.setHeureActualite(resultat.getString(5));
                act.setFkidPharmacien(resultat.getInt(6));

            }
            return act;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche d'actualite "+ex.getMessage());
            return null;
        }
    } 
    
    
    
}
