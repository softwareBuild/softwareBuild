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
import tunipharma.entities.Reclamation;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class ReclamationService {
    
       public Reclamation findReclamationById(int idReclamation){
    Reclamation reclamation = new Reclamation();
     String requete = "select * from evenements where idEvent =?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, idReclamation);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setMsgReclamation(resultat.getString(2));
                reclamation.setDateReclamation(resultat.getDate(3));
                reclamation.setFkidPatient(resultat.getInt(4));
                reclamation.setHeureReclamation(resultat.getTime(5));

            }
            return reclamation;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de la note "+ex.getMessage());
            return null;
        }
    }            

       public java.util.List<Reclamation> DisplayAllReclamationByIdPatient(int idPatient){ 

        java.util.List<Reclamation> listeEvenements = new ArrayList<Reclamation>();

        String requete = "select * from reclamation where ( fkidPatient = '" + idPatient + "' )";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Reclamation reclamation =new Reclamation();
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setMsgReclamation(resultat.getString(2));
                reclamation.setDateReclamation(resultat.getDate(3));
                reclamation.setFkidPatient(resultat.getInt(4));
                reclamation.setHeureReclamation(resultat.getTime(5));

                listeEvenements.add(reclamation);
            }
            return listeEvenements;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ps "+ex.getMessage());
            return null;
        }
    }
         
}
