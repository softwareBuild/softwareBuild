/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.AdminDAO;
import tunipharma.entities.Admin;

/**
 *
 * @author omar
 */
public class TestFindAdminById {
    public static void main(String[] args) {
    Admin admin = new Admin();
    AdminDAO adminDAO = new AdminDAO();
    admin = adminDAO.findAdminById(1);
    System.out.println(admin);
       }
}
