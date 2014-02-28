/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.PatientDAO;
import tunipharma.dao.PharmacieDAO;
import tunipharma.entities.Pharmacie;


/**
 *
 * @author wael.boumaiza
 */
public class TestFindPharmacieByTypePhamrcie {
        public static void main(String[] args) { 
    
            Pharmacie pharmacie  = new Pharmacie();
    PharmacieDAO pharmacieDAO = new PharmacieDAO();
    List<Pharmacie> pharmacies = new ArrayList<Pharmacie>();
    pharmacies = pharmacieDAO.DisplayAllPharmacieNuit("NUIT",0);
    for (int i = 0; i < pharmacies.size(); i++) 
    {
        System.out.println(pharmacies.get(i).toString()); 
    }
   
 }
}
