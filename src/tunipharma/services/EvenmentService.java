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
import tunipharma.entities.Evenement;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class EvenmentService {
    public List<Evenement> DisplayAllEvenementByLibelle(String libelle){ 

        List<Evenement> listeEvenements = new ArrayList<Evenement>();

        String requete = "select * from evenements where ( fklibellePharmacie = '" + libelle + "' )";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Evenement evenement =new Evenement();
                evenement.setIdEvent(resultat.getInt(1));
                evenement.setLibEvent(resultat.getString(2));
                evenement.setDateEvent(resultat.getDate(3));
                evenement.setHeureEvent(resultat.getTime(4));
                evenement.setLieuEvent(resultat.getString(5));
                evenement.setLibEvent(resultat.getString(6));

                listeEvenements.add(evenement);
            }
            return listeEvenements;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }

    public Evenement findEvenementById(int idEvenement){
    Evenement event = new Evenement();
     String requete = "select * from evenements where idEvent =?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, idEvenement);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                event.setIdEvent(resultat.getInt(1));
                event.setLibEvent(resultat.getString(2));
                event.setDateEvent(resultat.getDate(3));
                event.setHeureEvent(resultat.getTime(4));
                event.setLieuEvent(resultat.getString(5));
                event.setFklibellePharmacie(resultat.getString(6));

            }
            return event;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de la note "+ex.getMessage());
            return null;
        }
    }   
}
