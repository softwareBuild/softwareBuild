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
public class NewsLettre {
    
    int idNewslettre ;
    String libelleNewslettre ;
    String emailNewslettre ;
    Date dateNewslettre ;
    int fkidAdministrateur ;
    String heureNewslettre ;

    public int getIdNewslettre() {
        return idNewslettre;
    }

    public String getEmailNewslettre() {
        return emailNewslettre;
    }

    public Date getDateNewslettre() {
        return dateNewslettre;
    }

    public int getFkidAdministrateur() {
        return fkidAdministrateur;
    }

    public String getHeureNewslettre() {
        return heureNewslettre;
    }

    public void setIdNewslettre(int idNewslettre) {
        this.idNewslettre = idNewslettre;
    }

    public void setEmailNewslettre(String emailNewslettre) {
        this.emailNewslettre = emailNewslettre;
    }

    public void setDateNewslettre(Date dateNewslettre) {
        this.dateNewslettre = dateNewslettre;
    }

    public void setFkidAdministrateur(int fkidAdministrateur) {
        this.fkidAdministrateur = fkidAdministrateur;
    }

    public void setHeureNewslettre(String heureCommentaire) {
        this.heureNewslettre = heureCommentaire;
    }
    
    public String getLibelleNewslettre() {
        return libelleNewslettre;
    }    
    
    public void setLibelleNewslettre(String libelleNewslettre) {
        this.libelleNewslettre = libelleNewslettre;
    }
            
    
}
