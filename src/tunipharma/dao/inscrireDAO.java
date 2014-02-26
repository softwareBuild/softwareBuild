/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tunipharma.util.MyConnection;

/**
 *
 * @author OUSSAMA
 */
public class inscrireDAO {
    
     public boolean inscrire(String nom, String prenom,String login , String password ,String pseudo ,String adresse){
        String requete = "insert into pharmacien values (null,'"+login+"','"+password+"','"+nom+"','"+prenom+"','"+adresse+"','')";
        String requete1 = "insert into patient values (null,'"+login+"','"+password+"','"+nom+"','"+prenom+"','"+adresse+"')";
        String requete2 = "insert into administrateur values (null,'"+login+"','"+password+"','"+nom+"','"+prenom+"','"+adresse+"')";
        try {
            Statement state =  MyConnection.getInstance().createStatement();
            
            
            state.execute(requete);
            state.execute(requete1);
            state.execute(requete2);
                        
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'inscription "+ex.getMessage());
            return false;
    
}
        return true;
    }
    


            public boolean chercheruser(String login) throws SQLException{
            String requete90 = "select * from patient where login='"+login+"'";
            PreparedStatement ps90 = MyConnection.getInstance().prepareStatement(requete90);
            ResultSet resultat90 = ps90.executeQuery();
            boolean i90=false;
            while (resultat90.next())
            {i90=true;}
            String requete91 = "select * from pharmacien where login='"+login+"'";
            PreparedStatement ps91 = MyConnection.getInstance().prepareStatement(requete91);
            ResultSet resultat91 = ps91.executeQuery();
            while (resultat91.next())
            {i90=true;}
            String requete92 = "select * from administrateur where login='"+login+"'";
            PreparedStatement ps92 = MyConnection.getInstance().prepareStatement(requete92);
            ResultSet resultat92 = ps92.executeQuery();
            while (resultat92.next())
            {i90=true;}
            return i90;
  }
            
}
            