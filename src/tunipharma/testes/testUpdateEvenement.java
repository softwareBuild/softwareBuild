/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;


import tunipharma.dao.EvenementDAO;
import tunipharma.entities.Evenement;

/**
 *
 * @author omar
 */
public class testUpdateEvenement {
     public static void main(String[] args) {
    Evenement evenement = new Evenement();
    EvenementDAO evenementDAO = new EvenementDAO();
    evenement=evenementDAO.findEvenementById(2);
    evenement.setLibEvent("rr");
    evenementDAO.updateEvenements(evenement);    
    
    
        }
}