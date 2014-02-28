/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.AdminDAO;
import tunipharma.dao.DaoReclamation;
import tunipharma.entities.Admin;
import tunipharma.entities.Reclamation;

/**
 *
 * @author omar
 */
public class TestModifAdmin {
    public static void main(String[] args) {
        Admin administrateur = new Admin();
        AdminDAO daoAdmin = new AdminDAO();
            administrateur=daoAdmin.findAdminById(1);

        administrateur.setLogin("mana");
//        administrateur.setPassword("mana");
//        administrateur.setNom("mana");
//        administrateur.setPrenom("mana");
//        administrateur.setAdresse("mana");
        daoAdmin.updateAdministrateur(administrateur);
       
     
      
        }
}
