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
import tunipharma.entities.Gouvernrat;
import tunipharma.entities.Patient;
import tunipharma.entities.Region;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class GouvernratDAO {
    
  public void insertGrouverment(Gouvernrat grouverment){

        String requete = "insert into Grouverment () values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            /*
            ps.setString(1, p.getLogin());
            ps.setString(2, p.getPassword());
            ps.setString(3, p.getNom() );
            ps.setString(4, p.getPrenom() );
            ps.setString(5, p.getAdresse() );
            
            */
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
  
  public List<Gouvernrat> DisplayAllGrouverment (){

        List<Gouvernrat> listeGrouverments = new ArrayList<Gouvernrat>();

        String requete = "select * from gouvernorat";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Gouvernrat grouverment =new Gouvernrat();
                
                grouverment.setIdG(resultat.getInt(1));
                grouverment.setLibG(resultat.getString(2));
                listeGrouverments.add(grouverment);
            }
            return listeGrouverments;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
   
   
   
   
   
    public List<Gouvernrat> DisplayAllRegionGouver (int idGouve){
        Gouvernrat grouverment = new Gouvernrat();
        List<Gouvernrat> listeGrouverments = new ArrayList<Gouvernrat>();

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
    
    public Gouvernrat findGrouvermentById(int id){
    Gouvernrat grouverment = new Gouvernrat();
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
    
    public Gouvernrat findGrouvermentByLib(String lib){
    Gouvernrat grouverment = new Gouvernrat();
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
