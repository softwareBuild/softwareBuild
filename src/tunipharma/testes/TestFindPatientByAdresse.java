/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.PatientDAO;
import tunipharma.entities.Patient;
import tunipharma.services.PatientService;

/**
 *
 * @author wael.boumaiza
 */
public class TestFindPatientByAdresse {
 
    public static void main(String[] args) { 
    
    Patient patient = new Patient();
    PatientDAO patientDAO = new PatientDAO();
    PatientService patientService = new PatientService();
    List<Patient> patients = new ArrayList<Patient>();
    patients = patientService.DisplayAllPatientByAdresse("La Manouba");
       
      for (int i = 0; i < patients.size(); i++) {
         System.out.println(patients.get(i).toString()); 
      }
 }
    
}
