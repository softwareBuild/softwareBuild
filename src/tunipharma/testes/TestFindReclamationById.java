/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.ReclamationDAO;
import tunipharma.entities.Reclamation;

/**
 *
 * @author omar
 */
public class TestFindReclamationById {
    public static void main(String[] args) { 
    
    Reclamation reclamation = new Reclamation();
    ReclamationDAO reclamationDAO = new ReclamationDAO();
    reclamation = reclamationDAO.findReclamationById(1);
        System.out.println(reclamation);
    
    }
}
