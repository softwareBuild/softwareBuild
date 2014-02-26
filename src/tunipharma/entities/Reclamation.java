/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

import java.sql.Date;

/**
 *
 * @author omar
 */
public class Reclamation {
   private int idReclamation;
   private String msgReclamation;
   private Date dateReclamation;
   private int fkidPatient;
   private String heureReclamation;

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

    public String getHeureReclamation() {
        return heureReclamation;
    }

    public void setHeureReclamation(String heureReclamation) {
        this.heureReclamation = heureReclamation;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "idReclamation=" + idReclamation + ", msgReclamation=" + msgReclamation + ", dateReclamation=" + dateReclamation + ", fkidPatient=" + fkidPatient + ", heureReclamation=" + heureReclamation + '}';
    }
   
}
