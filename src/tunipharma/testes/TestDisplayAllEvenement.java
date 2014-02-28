/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.ReclamationDAO;
import tunipharma.dao.EvenementDAO;
import tunipharma.dao.PharmacienDAO;
import tunipharma.entities.Evenement;
import tunipharma.entities.Pharmacien;
import tunipharma.entities.Reclamation;

/**
 *
 * @author omar
 */
public class TestDisplayAllEvenement {
             public static void main(String[] args) {                              
    Evenement evenement = new Evenement();
    EvenementDAO evenementDAO =new EvenementDAO();
    List<Evenement> evenements = new ArrayList<Evenement>();
    evenements=evenementDAO.DisplayAllEvenement();
    for (int i = 0; i < evenements.size(); i++) {
    System.out.println(evenements.get(i).toString()); 
      }  
    } 
             
}
