/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.PatientDAO;
import tunipharma.entities.Patient;
import tunipharma.services.PatientService;

/**
 *
 * @author wael.boumaiza
 */
public class TestFindPatientById {
  public static void main(String[] args) { 
    
    Patient patient = new Patient();
    PatientDAO patientDAO = new PatientDAO();
    PatientService patientService = new PatientService();
    patient = patientService.findPatientById(3);
    System.out.println(patient);
    
    }  
}
