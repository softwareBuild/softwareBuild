/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.sql.Date;
import tunipharma.dao.DaoReclamation;
import tunipharma.dao.RegionDAO;
import tunipharma.entities.Reclamation;
import tunipharma.entities.Region;

/**
 *
 * @author omar
 */
public class TestInsertReclamations {
      public static void main(String[] args) {
        Reclamation reclamation = new Reclamation();
        DaoReclamation reclamationDAO = new DaoReclamation();
        Date d=new Date(2014-1900,1,12);
        reclamation.setDateReclamation(d);
        reclamation.setFkidPatient(1);
        reclamation.setHeureReclamation(new java.sql.Time(10, 10, 10));
        reclamation.setMsgReclamation("rr");
        reclamationDAO.insertReclamations(reclamation);
    }
    
}
