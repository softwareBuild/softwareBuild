/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class ServicePharmcieService {
    
    public tunipharma.entities.PharmacieService findServiceById(int id){
    tunipharma.entities.PharmacieService service = new tunipharma.entities.PharmacieService();
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
    
    public tunipharma.entities.PharmacieService findServiceByLibellle(String nom){
    tunipharma.entities.PharmacieService service = new tunipharma.entities.PharmacieService();
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
}
