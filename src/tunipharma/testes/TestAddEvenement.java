/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.sql.Date;
import tunipharma.dao.EvenementDAO;
import tunipharma.entities.Evenement;
import tunipharma.entities.Patient;


/**
 *
 * @author omar
 */
public class TestAddEvenement {
    public static void main(String[] args) {
    Evenement evenement = new Evenement();
    EvenementDAO evenementDAO = new EvenementDAO();
    
    evenement.setLibEvent("rr");
    Date d=new Date(2014-1900,1,12);    // Date d = new Date( année -1900 , mois apartir du 0 : 0=>janvier , jour)
    evenement.setDateEvent(d);
    evenement.setHeureEvent(new java.sql.Time(10, 10, 10));
    evenement.setLieuEvent("tt");
    evenement.setFklibellePharmacie("eee");
    evenementDAO.insertEvenements(evenement);
            }
}
