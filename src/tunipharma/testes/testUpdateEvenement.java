/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.Format;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import tunipharma.dao.EvenementDAO;
import tunipharma.dao.PatientDAO;
import tunipharma.entities.Evenement;
import tunipharma.entities.Patient;

/**
 *
 * @author omar
 */
public class testUpdateEvenement {
     public static void main(String[] args) throws ParseException {
     Evenement evenement = new Evenement();
    EvenementDAO evenementDAO = new EvenementDAO();
    Date d=new Date(2014-1900,1,12);    // Date d = new Date( année -1900 , mois apartir du 0 : 0=>janvier , jour)

    evenement.setIdEvent(1);
    evenement.setLibEvent("rr"); 
    evenement.setDateEvent(d);
    evenement.setHeureEvent(new java.sql.Time(10, 10, 10));
    evenement.setLieuEvent("tt");
    evenement.setFklibellePharmacie("jj");
    evenementDAO.updateEvenements(evenement);
    
        }
}
