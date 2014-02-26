/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.DaoReclamation;
import tunipharma.entities.Reclamation;

/**
 *
 * @author omar
 */
public class findReclamationById {
    public static void main(String[] args) { 
    
    Reclamation reclamation = new Reclamation();
    DaoReclamation reclamationDAO = new DaoReclamation();
    reclamation = reclamationDAO.findReclamationById(1);
        System.out.println(reclamation);
    
    }
}
