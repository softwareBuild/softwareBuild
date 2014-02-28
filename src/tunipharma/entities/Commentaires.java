/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

import java.sql.Date;

/**
 *
 * @author OUSSAMA
 */
public class Commentaires {

    int idCommentaire ;
    String libelleCommentaire ;
    int fkidActualite ;
    int fkidPatient ;
    Date dateCommentaire ;
    String heureCommentaire ;

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public String getLibelleCommentaire() {
        return libelleCommentaire;
    }

    public int getFkidActualite() {
        return fkidActualite;
    }

    public int getFkidPatient() {
        return fkidPatient;
    }

    public Date getDateCommentaire() {
        return dateCommentaire;
    }

    public String getHeureCommentaire() {
        return heureCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public void setLibelleCommentaire(String libelleCommentaire) {
        this.libelleCommentaire = libelleCommentaire;
    }

    public void setFkidActualite(int fkidActualite) {
        this.fkidActualite = fkidActualite;
    }

    public void setFkidPatient(int fkidPatient) {
        this.fkidPatient = fkidPatient;
    }

    public void setDateCommentaire(Date dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }

    public void setHeureCommentaire(String heureCommentaire) {
        this.heureCommentaire = heureCommentaire;
    }
    

}

