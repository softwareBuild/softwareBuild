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
import tunipharma.entities.Region;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class RegionService {
    
     public List<Region> DisplayAllRegionGouver (int idGouve){
      //  Region region = new Region();
        List<Region> listeRegions = new ArrayList<Region>();

        String requete = "select * from region where idG= " + idGouve;
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Region region  =new Region();
                region.setIdG(resultat.getInt(1));
                region.setLibREgion(resultat.getString(2));
                listeRegions.add(region);
            }
            return listeRegions;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
 
    public Region findRegionById(int id){
    Region region = new Region();
     String requete = "select * from region where idRegion=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                region.setIdG(resultat.getInt(1));
                region.setLibREgion(resultat.getString(2));
               
            }
            return region;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
    
}
