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
import tunipharma.entities.Gouvernorat;
import tunipharma.entities.Patient;
import tunipharma.entities.Region;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class RegionDAO {
    
    
    
    public void insertRegion(Region p){

        String requete = "insert into Region (libRegion) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            //ps.setInt(1, p.getIdG());
            ps.setString(1, p.getLibREgion());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    public List<Region> DisplayAllRegion (){


        List<Region> listeRegion = new ArrayList<Region>();

        String requete = "select * from Region";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            //DepotDAO depotDAO = new DepotDAO();
            while(resultat.next()){
                Region region =new Region();
                region.setLibREgion(resultat.getString(1));
                listeRegion.add(region);
            }
            return listeRegion;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
      }
