/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Gouvernorat;
import tunipharma.entities.Region;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class GouvernoratService {
    
    public List<Gouvernorat> DisplayAllRegionGouver (int idGouve){
        Gouvernorat grouverment = new Gouvernorat();
        List<Gouvernorat> listeGrouverments = new ArrayList<Gouvernorat>();

        String requete = "select * from region where idG= " + idGouve;
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Region region  =new Region();
                region.setIdG(resultat.getInt(1));
                region.setLibREgion(resultat.getString(2));
                listeGrouverments.add(grouverment);
            }
            return listeGrouverments;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
    
    public Gouvernorat findGrouvermentById(int id){
    Gouvernorat grouverment = new Gouvernorat();
     String requete = "select * from gouvernorat where idG=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                grouverment.setIdG(resultat.getInt(1));
                grouverment.setLibG(resultat.getString(2));
                
            }
            return grouverment;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
    
    public Gouvernorat findGrouvermentByLib(String lib){
    Gouvernorat grouverment = new Gouvernorat();
     String requete = "select * from gouvernorat where libG=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, lib);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                grouverment.setIdG(resultat.getInt(1));
                grouverment.setLibG(resultat.getString(2));
                
            }
            return grouverment;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
    
}
