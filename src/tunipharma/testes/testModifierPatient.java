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
public class testModifierPatient {
    public static void main(String[] args) {
        Patient p = new Patient();
        PatientDAO pDAO = new PatientDAO();
        p = pDAO.findPatientById(1);
        p.setNom("salem");
        pDAO.updatePatient(p);
        
    }
}
