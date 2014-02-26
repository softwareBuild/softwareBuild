/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.PatientDAO;
import tunipharma.entities.Patient;

/**
 *
 * @author wael.boumaiza
 */
public class testDisplayAllPatientByAdresse {
 
    public static void main(String[] args) { 
    
    Patient patient = new Patient();
    PatientDAO patientDAO = new PatientDAO();
    List<Patient> patients = new ArrayList<Patient>();
    patients = patientDAO.DisplayAllPatientByAdresse("La Manouba");
       
      for (int i = 0; i < patients.size(); i++) {
         System.out.println(patients.get(i).toString()); 
      }
 }
    
}
