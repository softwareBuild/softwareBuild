/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.PatientDAO;
import tunipharma.dao.PharmacienDAO;
import tunipharma.entities.Patient;
import tunipharma.entities.Pharmacien;



/**
 *
 * @author omar
 */
public class TestDisplayAllPharmaciens {
         public static void main(String[] args) { 
    
    Pharmacien pharmacien = new Pharmacien();
    pharmacien.setPrenomPharmacien("manel");
    PharmacienDAO pharmacienDao =new PharmacienDAO();
    List<Pharmacien> pharmaci = new ArrayList<Pharmacien>();
  // pharmaci= pharmacienDao.

      for (int i = 0; i < pharmaci.size(); i++) {
       System.out.println(pharmaci.get(i).toString()); 

      }
  
    } 
}
