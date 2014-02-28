/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Pharmacie;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class PharmacieService {
    
    //Display
    
    //Find
    public List<Pharmacie> DisplayAllPharmcieByRegion(String region){

        List<Pharmacie> listePharmacies = new ArrayList<Pharmacie>();

        String requete = "select * from Pharmacie where RegionPh='" + region +"'";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Pharmacie pharmacie =new Pharmacie();
                pharmacie.setPhLibelle(resultat.getString(1));
                pharmacie.setPhRaisonSocial(resultat.getString(2));
                pharmacie.setPhMatriculeFiscale(resultat.getInt(3));
                pharmacie.setPhRegistre(resultat.getString(4));
                pharmacie.setPhAdresse(resultat.getString(5));
                pharmacie.setTypePharmacie(resultat.getString(6));
                pharmacie.setGarde(resultat.getInt(7));
                listePharmacies.add(pharmacie);
            }
            return listePharmacies;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
    
}
