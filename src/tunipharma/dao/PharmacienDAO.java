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
import tunipharma.entities.Patient;

import tunipharma.entities.Pharmacien;
import tunipharma.util.MyConnection;

/**
 *
 * @author sahar
 */
public class PharmacienDAO {
    
        public void insertPharmacien(Pharmacien f){

        String requete = "insert into pharmacien (IdPharmacien,nomPharmacien,PrenomPharmacien,NumTelPharmacien,AddressePharmacien,PseudoPharmacien) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, f.getIdPharmacien());
            ps.setString(2, f.getNomPharmacien());
            ps.setString(3, f.getPrenomPharmacien());
            ps.setInt(4, f.getNumTelPharmacien());
            ps.setString(5, f.getAddressePharmacien());
            ps.setString(6, f.getPseudoPharmacien());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
        
        public void updatePharmacien(Pharmacien f){
        String requete = "update pharmacien set idPharmacien =?,NomPharmacien=?,PrenomPharmacien=?,NumTelPharmacien=?,AddressePharmacien=?,PseudoPharmacien =? where idPharmacien=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, f.getIdPharmacien());
            ps.setString(2, f.getNomPharmacien());
            ps.setString(3, f.getPrenomPharmacien());
            ps.setInt(4, f.getNumTelPharmacien());
            ps.setString(5, f.getAddressePharmacien());
            ps.setString(6, f.getPseudoPharmacien());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
          
        public void deletePharmacien( Pharmacien f ,String IdPharmacien){
        String requete = "delete from pharmacien  where id_depot=?" ;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, f.getIdPharmacien());
            ps.executeUpdate();
            System.out.println("Pharmacien supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
      
        
        
        public void deletePharmacien( int IdPharmacien){
        String requete = "delete from pharmacien  where idPharmacien=?" ;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, IdPharmacien);
            ps.executeUpdate();
            System.out.println("Pharmacien supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
       
    }
        
}
