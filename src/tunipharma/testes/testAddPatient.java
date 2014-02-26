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
public class testAddPatient {
     public static void main(String[] args) {
        Patient p = new Patient();
        PatientDAO patientDAO = new PatientDAO();
        p.setLogin("sahar");
        p.setPassword("0000");
        p.setNom("boumaiza"); 
        p.setPrenom("wael");
        p.setAdresse("La Manouba");
        patientDAO.insertPatient(p);
    }
}
