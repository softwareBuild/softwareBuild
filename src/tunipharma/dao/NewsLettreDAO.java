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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import tunipharma.entities.NewsLettre;
import tunipharma.entities.NewsLettre;
import tunipharma.util.MyConnection;

/**
 *
 * @author OUSSAMA
 */
public class NewsLettreDAO {
    
    public void insertNewslettre(NewsLettre nt){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into newslettre values ('"+nt.getIdNewslettre()+"','"+nt.getLibelleNewslettre()+"','"+nt.getEmailNewslettre()+"','"+nt.getDateNewslettre()+"','"+nt.getFkidAdministrateur()+"','"+nt.getHeureNewslettre()+"')";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,nt.getIdNewslettre());
            ps.setString(2, nt.getLibelleNewslettre());
            ps.setString(3,nt.getEmailNewslettre());
            ps.setString(4,nt.getDateNewslettre().toString());
            ps.setInt(5,nt.getFkidAdministrateur());
            ps.setString(6,nt.getHeureNewslettre());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void updatenewslettre(NewsLettre nl){
        String requete = "update newslettre set libelleNewslettre='"+nl.getLibelleNewslettre()+"' emailNewslettre='"+nl.getEmailNewslettre()+"' dateNewslettre='"+nl.getDateNewslettre()+"' fkidAdministrateur='"+nl.getFkidAdministrateur()+"'heureNewslettre='"+nl.getHeureNewslettre()+"'   where idnewslettre='"+nl.getIdNewslettre()+"'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(2, nl.getLibelleNewslettre());
            ps.setString(3, nl.getEmailNewslettre());
            ps.setString(4, nl.getDateNewslettre().toString());
            ps.setInt(5, nl.getFkidAdministrateur());
            ps.setString(6, nl.getHeureNewslettre());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Mise a jour effectué avec succées ");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    
    public boolean supprimernewslettre(int id) throws SQLException{
        
        String requete = "DELETE FROM `newslettre` WHERE idnewslettre='"+id+"'";
        try {
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du suppression de newslettre "+ex.getMessage());
            return false;
        }
        return true;
    }
      
    public List<NewsLettre> recuprernewslettre() throws SQLException{
        
        List<NewsLettre> listenews = new ArrayList<NewsLettre>();

        String requete = "select * from newslettre order by datenewslettre asc";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                NewsLettre n =new NewsLettre();
                n.setIdNewslettre(resultat.getInt(1));
                n.setLibelleNewslettre(resultat.getString(2));
                n.setEmailNewslettre(resultat.getString(3));
                n.setDateNewslettre(resultat.getDate(4));
                n.setFkidAdministrateur(resultat.getInt(5));
                n.setHeureNewslettre(resultat.getString(6));
                

                listenews.add(n);
            }
            
            return listenews;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des newslettres "+ex.getMessage());
            return null;
        }
    }
        
}
    
