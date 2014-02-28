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
import javax.swing.JOptionPane;
import tunipharma.entities.Actualites;
import tunipharma.util.MyConnection;

/**
 *
 * @author OUSSAMA
 */
public class ActualiteDAO {
    
    public boolean insertactualite(Actualites ac){

         String requete = "insert into actualite values ('"+ac.getIdActualite()+"','"+ac.getLibelleActualite()+"','"+ac.getImageActualite()+"','"+ac.getDateActualite()+"','"+ac.getHeureActualite()+"','"+ac.getFkidPharmacien()+"')";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,ac.getIdActualite());
            ps.setString(2, ac.getLibelleActualite());
            ps.setString(3,ac.getImageActualite());
            ps.setString(4,ac.getDateActualite().toString());
            ps.setString(5,ac.getHeureActualite());
            ps.setInt(6,ac.getFkidPharmacien());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
            return false;
        }
    }
    
    public boolean deleteActualite(int id) throws SQLException{
        
        String requete = "DELETE FROM `actualite` WHERE idactualite='"+id+"'";
        try {
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            System.out.println("erreur lors du suppression de actualite "+id+ex.getMessage());
            return false;
        }
        return true;
    }
    
    public void updateactualite(Actualites ac){
     
        String requete = "update actualite set libelleActualite='"+ac.getLibelleActualite()+"' imageActualite='"+ac.getImageActualite()+"' dateActualite='"+ac.getDateActualite()+"' heureActualite='"+ac.getHeureActualite()+"'fkidPharmacien='"+ac.getFkidPharmacien()+"'   where idActualite='"+ac.getIdActualite()+"'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(2, ac.getLibelleActualite() );
            ps.setString(3, ac.getImageActualite());
            ps.setString(4, ac.getDateActualite().toString());
            ps.setString(5, ac.getHeureActualite().toString());
            ps.setInt(6, ac.getFkidPharmacien());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Mise a jour effectué avec succées ");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour actualite "+ex.getMessage());
        }

    }
      
    public List<Actualites> DisplayAllActualites (){


        List<Actualites> listeactualites = new ArrayList<Actualites>();

        String requete = "select * from actualite";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Actualites act =new Actualites();
                act.setIdActualite(resultat.getInt(1));
                act.setLibelleActualite(resultat.getString(2));
                act.setImageActualite(resultat.getString(3));
                act.setDateActualite(resultat.getDate(4));
                act.setHeureActualite(resultat.getString(5));
                act.setFkidPharmacien(resultat.getInt(6));

                listeactualites.add(act);
            }
            return listeactualites;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des actualites "+ex.getMessage());
            return null;
        }
    }
     
}