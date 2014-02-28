/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.ReclamationDAO;
import tunipharma.entities.Reclamation;

/**
 *
 * @author omar
 */
public class TestDeleteReclamation {
    public static void main(String[] args) {
        Reclamation reclamation = new Reclamation();
        ReclamationDAO daoRecllamation = new ReclamationDAO();
       daoRecllamation.deleteReclamation(1);
        }
}
