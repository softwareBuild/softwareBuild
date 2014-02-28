package tunipharma.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tunipharma.entities.Commentaires;
import tunipharma.util.MyConnection;

/**
 *
 * @author OUSSAMA
 */
public class CommentaireDAO {

    public void insertcommentaires(Commentaires co){

         String requete = "insert into commentaire values ('"+co.getIdCommentaire()+"','"+co.getLibelleCommentaire()+"','"+co.getFkidActualite()+"','"+co.getFkidPatient()+"','"+co.getDateCommentaire()+"','"+co.getHeureCommentaire()+"')";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,co.getIdCommentaire());
            ps.setString(2, co.getLibelleCommentaire());
            ps.setInt(3,co.getFkidActualite());
            ps.setInt(4,co.getFkidPatient());
            ps.setString(5,co.getDateCommentaire().toString());
            ps.setString(6,co.getHeureCommentaire());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }    
    
    public void updatecommentaires(Commentaires co){
        String requete = "update commentaire set libelleCommentaire='"+co.getLibelleCommentaire()+"' fkidActualite='"+co.getFkidActualite()+"' fkidPatient='"+co.getFkidPatient()+"' dateCommentaire='"+co.getDateCommentaire()+"'heureCommentaire='"+co.getHeureCommentaire()+"'   where idActualite='"+co.getIdCommentaire()+"'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(2, co.getLibelleCommentaire() );
            ps.setInt(3, co.getFkidActualite());
            ps.setInt(4, co.getFkidPatient());
            ps.setString(5, co.getDateCommentaire().toString());
            ps.setString(6, co.getHeureCommentaire());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Mise a jour effectué avec succées ");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour commentaire "+ex.getMessage());
        }

    }    
    
    public boolean deleteCommentaire(int id) throws SQLException{
        
        String requete = "DELETE FROM `commentaire` WHERE idcommentaire='"+id+"'";
        try {
           PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            System.out.println("erreur lors du suppression de commentaire "+id+ex.getMessage());
            return false;
        }
        return true;
    }    
    
    public List<Commentaires> DisplayAllCommentaires() throws SQLException{
        
        List<Commentaires> listeact = new ArrayList<Commentaires>();

        String requete = "select * from commentaire order by datecommentaire,heurecommentaire asc";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Commentaires n =new Commentaires();
                n.setIdCommentaire(resultat.getInt(1));
                n.setLibelleCommentaire(resultat.getString(2));
                n.setFkidActualite(resultat.getInt(3));
                n.setFkidPatient(resultat.getInt(4));
                n.setDateCommentaire(resultat.getDate(5));
                n.setHeureCommentaire(resultat.getString(6));
                
                listeact.add(n);
            }
            return listeact;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des commentaires "+ex.getMessage());
            return null;
        }
    }
        
}
    



