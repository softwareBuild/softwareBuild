/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author omar
 */
public class Reclamation {
   private int idReclamation;
   private String msgReclamation;
   private java.sql.Date dateReclamation;
private java.sql.Time heureReclamation;
private int fkidPatient;


    public Time getHeureReclamation() {
        return heureReclamation;
    }

    public void setHeureReclamation(Time heureReclamation) {
        this.heureReclamation = heureReclamation;
    }

    public int getIdReclamation() {
        return idReclamation;
    }

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }

    public String getMsgReclamation() {
        return msgReclamation;
    }

    public void setMsgReclamation(String msgReclamation) {
        this.msgReclamation = msgReclamation;
    }

    public Date getDateReclamation() {
        return dateReclamation;
    }

    public void setDateReclamation(Date dateReclamation) {
        this.dateReclamation = dateReclamation;
    }

    public int getFkidPatient() {
        return fkidPatient;
    }

    public void setFkidPatient(int fkidPatient) {
        this.fkidPatient = fkidPatient;
    }

  

    @Override
    public String toString() {
        return "Reclamation{" + "idReclamation=" + idReclamation + ", msgReclamation=" + msgReclamation + ", dateReclamation=" + dateReclamation + ", fkidPatient=" + fkidPatient + ", heureReclamation=" + heureReclamation + '}';
    }
   
}
