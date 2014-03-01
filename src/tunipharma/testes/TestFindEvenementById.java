/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.EvenementDAO;
import tunipharma.entities.Evenement;
import tunipharma.services.EvenmentService;

/**
 *
 * @author omar
 */
public class TestFindEvenementById {
       public static void main(String[] args) {
    Evenement evenement = new Evenement();
    EvenementDAO evenementDAO = new EvenementDAO();
    EvenmentService evenmentService = new EvenmentService();
    
    evenement = evenmentService.findEvenementById(2);
    System.out.println(evenement);
       }
}
