/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.DaoReclamation;
import tunipharma.entities.Reclamation;

/**
 *
 * @author omar
 */
public class TestSuppressionReclamation {
    public static void main(String[] args) {
        Reclamation reclamation = new Reclamation();
        DaoReclamation daoRecllamation = new DaoReclamation();
       daoRecllamation.deleteReclamation(1);
        }
}
