/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.ReclamationDAO;
import tunipharma.entities.Reclamation;
import tunipharma.services.ReclamationService;

/**
 *
 * @author omar
 */
public class TestFindReclamationById {
    public static void main(String[] args) { 
    
    Reclamation reclamation = new Reclamation();
    ReclamationDAO reclamationDAO = new ReclamationDAO();
    ReclamationService reclamationService = new ReclamationService();
    reclamation = reclamationService.findReclamationById(1);
        System.out.println(reclamation);
    
    }
}
