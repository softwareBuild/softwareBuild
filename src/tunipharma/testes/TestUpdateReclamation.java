/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.sql.Date;
import tunipharma.dao.ReclamationDAO;
import tunipharma.entities.Reclamation;


/**
 *
 * @author omar
 */
public class TestUpdateReclamation {
         public static void main(String[] args) {
     Reclamation reclamation = new Reclamation();
    ReclamationDAO reclamationDAO = new ReclamationDAO();
    reclamation=reclamationDAO.findReclamationById(2);
    reclamation.setMsgReclamation("hh");
    
//    Date d=new Date(2014-1900,1,12);    // Date d = new Date( année -1900 , mois apartir du 0 : 0=>janvier , jour)
//    reclamation.setDateReclamation(d);         
//    reclamation.setFkidPatient(1);
//    reclamation.setHeureReclamation(new java.sql.Time(10, 10, 10));
    reclamationDAO.updateReclamations(reclamation);
    
    
    
    
    
    
    
        }
}
