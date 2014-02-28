/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import tunipharma.util.MyConnection;

/**
 *
 * @author OUSSAMA
 */
public class Inscrire{
    
     public boolean inscrire(String nom, String prenom,String login , String password ,String adresse,String type) throws SQLException{
        if(this.chercheruser(login)==true)
        {
        JOptionPane.showMessageDialog(null,"Attention!Le nom d'utilisateur existe déja");
        return false;
        }
        else{
        try {
            Statement state =  MyConnection.getInstance().createStatement();
                switch (type) {
                    case "pharmacien":
                        
            Statement state1 =  MyConnection.getInstance().createStatement();
                        String requete0 = "insert into pharmacie values ('pharmacie"+login+"',  '', 0,  '',  '',  '',0,  '',  '')";
                        state1.execute(requete0);
                        String requete = "insert into pharmacien values (null,'"+login+"','"+password+"','"+nom+"','"+prenom+"','"+adresse+"','pharmacie"+login+"')";
                        state.execute(requete);
                        break;
                    case "patient":
                        String requete1 = "insert into patient values (null,'"+login+"','"+password+"','"+nom+"','"+prenom+"','"+adresse+"')";
                        state.execute(requete1);
                        break;
                    default:
                        String requete2 = "insert into administrateur values (null,'"+login+"','"+password+"','"+nom+"','"+prenom+"','"+adresse+"')";
                        state.execute(requete2);
                        break;
                }
                        
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'inscription "+ex.getMessage());
            return false;
    
}
        return true;
    }}
    
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
            