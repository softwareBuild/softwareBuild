/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.EvenementDAO;
import tunipharma.entities.Evenement;
import tunipharma.services.EvenmentService;

/**
 *
 * @author omar
 */
public class TestFindEvenementByLibelle {
        public static void main(String[] args) { 
    
    Evenement evenement  = new Evenement();
    EvenementDAO evenementDAO = new EvenementDAO();
    EvenmentService evenmentService = new EvenmentService();
    
    List<Evenement> evenements = new ArrayList<Evenement>();
    evenements = evenmentService.DisplayAllEvenementByLibelle("2");
    for (int i = 0; i < evenements.size(); i++) 
    {
        System.out.println(evenements.get(i).toString()); 
    }
 }
}
