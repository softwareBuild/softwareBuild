/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tunipharma.util.MyConnection;

/**
 *
 * @author OUSSAMA
 */
public class AuthentificationDAO {
    
    
    public boolean connexion(String login , String password){
        
        String requete = "select * from patient where login='"+login+"' and password='"+password+"'";
        String requete1 = "select * from pharmacien where login='"+login+"' and password='"+password+"'";
        String requete2 = "select * from administrateur where login='"+login+"' and password='"+password+"'";
        
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            int i=0;
            while (resultat.next())
            {i++;}
            if (i==1)
            {System.out.println("Patient connecté ");
            return true;}

            PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(requete1);
            ResultSet resultat1 = ps1.executeQuery();
            int i1=0;
            while (resultat1.next())
            {i1++;}
            if (i1==1)
            {System.out.println("Pharmacien connecté ");
            return true;}

            PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(requete2);
            ResultSet resultat2 = ps.executeQuery();
            int i2=0;
            while (resultat2.next())
            {i2++;}
            if (i2==1)
            {System.out.println("Administrateur connecté ");
            return true;}

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la connexion "+ex.getMessage());
            return false;
    
}
        return false;
    }
}