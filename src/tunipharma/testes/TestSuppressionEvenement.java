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
public class TestSuppressionEvenement {
     public static void main(String[] args) {
         Evenement evene = new Evenement();
         EvenementDAO evenDAO = new EvenementDAO();
         evenDAO.deleteEvenement("1");
         
         
     
        }
}
