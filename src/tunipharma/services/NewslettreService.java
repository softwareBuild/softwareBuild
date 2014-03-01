/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tunipharma.entities.Newslettres;
import tunipharma.util.MyConnection;

/**
 *
 * @author OUSSAMA
 */
public class NewslettreService {
    
    
      public Newslettres findNewslettreById(int idNewslettre){
    Newslettres news = new Newslettres();
     String requete = "select * from newslettre where idNewslettre =?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, idNewslettre);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                news.setIdNewslettre(resultat.getInt(1));
                news.setLibelleNewslettre(resultat.getString(2));
                news.setEmailNewslettre(resultat.getString(3));
                news.setDateNewslettre(resultat.getDate(4));
                news.setHeureNewslettre(resultat.getString(5));
                news.setFkidAdministrateur(resultat.getInt(6));

            }
            return news;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de newslettre "+ex.getMessage());
            return null;
        }
    } 

    
    
 
    
}
