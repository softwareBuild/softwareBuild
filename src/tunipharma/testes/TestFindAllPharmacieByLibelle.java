/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.PharmacieDAO;
import tunipharma.entities.Pharmacie;

/**
 *
 * @author wael.boumaiza
 */
public class TestFindAllPharmacieByLibelle {
    
    public static void main(String[] args) { 
    
    Pharmacie pharmacie  = new Pharmacie();
    PharmacieDAO pharmacieDAO = new PharmacieDAO();
    List<Pharmacie> pharmacies = new ArrayList<Pharmacie>();
    pharmacies = pharmacieDAO.DisplayAllPharmacieByLibelle("Mou");
    for (int i = 0; i < pharmacies.size(); i++) 
    {
        System.out.println(pharmacies.get(i).toString()); 
    }
 }
    
}
