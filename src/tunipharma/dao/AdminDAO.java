package tunipharma.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import tunipharma.entities.Admin;
import tunipharma.entities.Reclamation;
import tunipharma.util.MyConnection;

public class AdminDAO {
       
    public void updateAdministrateur(Admin ad) {
        String requete = "update administrateur set login=?,password=?,nom=?,prenom=?,adresse=? where idAdministrateur=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ad.getLogin());
            ps.setString(2, ad.getPassword());
            ps.setString(3, ad.getNom());
            ps.setString(4, ad.getPrenom());
            ps.setString(5, ad.getAdresse());
            ps.setInt(6, ad.getIdAdministrateur());

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }
    
    //zayedddd
    public java.util.List<Admin> DisplayInfoAdmin() {


        java.util.List<Admin> admins = new ArrayList<Admin>();

      String requete = "select * from administrateur";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Admin admin = new Admin();
                admin.setLogin(resultat.getString(1));
                admin.setPassword(resultat.getString(2));
                
                admins.add(admin);
            }
                        System.out.println("info admin  affiche");

            return admins;
            
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }
    
    public Admin findAdminById(int idAdmin){
    Admin admin = new Admin();
     String requete = "select * from administrateur where idAdministrateur =?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, idAdmin);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                admin.setIdAdministrateur(resultat.getInt(1));
                admin.setLogin(resultat.getString(2));
                admin.setPassword(resultat.getString(3));
                admin.setNom(resultat.getString(4));
                admin.setPrenom(resultat.getString(5));
                admin.setAdresse(resultat.getString(6));

            }
            return admin;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de la note "+ex.getMessage());
            return null;
        }
    }  
       
    

     
}
