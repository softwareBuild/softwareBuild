/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.EvenementDAO;
import tunipharma.entities.Evenement;

/**
 *
 * @author omar
 */
public class DisplayAllEvenementByLibelle {
        public static void main(String[] args) { 
    
    Evenement evenement  = new Evenement();
    EvenementDAO evenementDAO = new EvenementDAO();
    List<Evenement> evenements = new ArrayList<Evenement>();
    evenements = evenementDAO.DisplayAllEvenementByLibelle("2");
    for (int i = 0; i < evenements.size(); i++) 
    {
        System.out.println(evenements.get(i).toString()); 
    }
 }
}
