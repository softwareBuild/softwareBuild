/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.AdminDAO;
import tunipharma.entities.Admin;

/**
 *
 * @author omar
 */
public class TestDisplayInfoAdmin {
    public static void main(String[] args) {
        Admin admin = new Admin();
        AdminDAO adminDAO = new AdminDAO();
        List<Admin> admins = new ArrayList<Admin>();
        admins=adminDAO.DisplayInfoAdmin();
      for (int i = 0; i < admins.size(); i++) {
         System.out.println(admins.get(i).toString()); 
      }   
        }
}
