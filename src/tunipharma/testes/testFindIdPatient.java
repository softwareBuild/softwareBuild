/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.PatientDAO;
import tunipharma.entities.Patient;

/**
 *
 * @author wael.boumaiza
 */
public class testFindIdPatient {
  public static void main(String[] args) { 
    
    Patient patient = new Patient();
    PatientDAO patientDAO = new PatientDAO();
    patient = patientDAO.findPatientById(3);
    System.out.println(patient);
    
    }  
}
