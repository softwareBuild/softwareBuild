/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.ReclamationDAO;
//import tunipharma.dao.PharmacieDAO;
import tunipharma.entities.Pharmacie;
import tunipharma.entities.Reclamation;

/**
 *
 * @author omar
 */
public class TestFindlReclamationByIdPatient {
        public static void main(String[] args) { 
    
    Reclamation reclamation  = new Reclamation();
    ReclamationDAO reclamationDAO = new ReclamationDAO();
    List<Reclamation> reclamations = new ArrayList<Reclamation>();
    reclamations = reclamationDAO.DisplayAllReclamationByIdPatient(1);
    for (int i = 0; i < reclamations.size(); i++) 
    {
        System.out.println(reclamations.get(i).toString()); 
    }
 }

}
