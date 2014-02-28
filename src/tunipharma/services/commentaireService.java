/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tunipharma.entities.Commentaires;
import tunipharma.util.MyConnection;

/**
 *
 * @author OUSSAMA
 */
public class commentaireService {
    
    
    
      public Commentaires findCommentaireById(int idCommentaire){
    
          Commentaires comm =new Commentaires();
          String requete = "select * from commentair where idCommentaire=?";
        
          try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, idCommentaire);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                comm.setIdCommentaire(resultat.getInt(1));
                comm.setLibelleCommentaire(resultat.getString(2));
                comm.setFkidActualite(resultat.getInt(3));
                comm.setFkidPatient(resultat.getInt(4));
                comm.setDateCommentaire(resultat.getDate(5));
                comm.setHeureCommentaire(resultat.getString(6));

            }
            return comm;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de commentaire "+ex.getMessage());
            return null;
        }
    } 
    
    
}
