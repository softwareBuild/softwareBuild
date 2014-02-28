/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

/**
 *
 * @author ali
 */


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.PharmacieService;
import tunipharma.util.MyConnection;

public class PharmacieServiceDAO {
    
    
    public void insertService(PharmacieService p){

        String requete = "insert into pharmacieservice (idService,libelleService,fkidPharmacie) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, p.getIdService());
            ps.setString(2, p.getLibelleService());
            ps.setInt(3, p.getFkidPharmacie());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    
    
    public void updateService(PharmacieService p){
        String requete = "update pharmacieservice set libelleService=? where idService=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getLibelleService());
            ps.setInt(2, p.getIdService());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    
    
    public void deleteService(int id){
        String requete = "delete from pharmacieservice where idService='"+id+"'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            //ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Service supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    
    public PharmacieService findServiceById(int id){
    PharmacieService service = new PharmacieService();
     String requete = "select * from pharmacieservice where idService=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                service.setIdService(resultat.getInt(1));
                service.setLibelleService(resultat.getString(2));
            }
            return service;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du service "+ex.getMessage());
            return null;
        }
    }
    
    public PharmacieService findServiceByLibellle(String nom){
    PharmacieService service = new PharmacieService();
     String requete = "select * from pharmacieservice where libelleService =?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                service.setIdService(resultat.getInt(1));
                System.out.println("test"+service.getIdService());
                service.setLibelleService(resultat.getString(2));
                System.out.println(resultat.getString(2));
                service.setFkidPharmacie(resultat.getInt(3));
                System.out.println(resultat.getInt(3));
            }
            return service;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du service "+ex.getMessage());
            return null;
        }
    }
    
    public List<PharmacieService> DisplayAllServices (){


        List<PharmacieService> listeServices = new ArrayList<PharmacieService>();

        String requete = "select * from pharmacieservice";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                PharmacieService service =new PharmacieService();
                service.setIdService(resultat.getInt(1));
                service.setLibelleService(resultat.getString(2));

                listeServices.add(service);
            }
            return listeServices;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des service "+ex.getMessage());
            return null;
        }
    }
    
    
}
