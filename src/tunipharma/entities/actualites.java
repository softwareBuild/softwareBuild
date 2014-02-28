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
public class actualites {
    
    int idActualite ;
    String libelleActualite ;
    String imageActualite ;
    Date dateActualite ;
    String heureActualite ;
    int fkidPharmacien ;

    public int getIdActualite() {
        return idActualite;
    }

    public String getLibelleActualite() {
        return libelleActualite;
    }

    public String getImageActualite() {
        return imageActualite;
    }

    public Date getDateActualite() {
        return dateActualite;
    }

    public String getHeureActualite() {
        return heureActualite;
    }

    public int getFkidPharmacien() {
        return fkidPharmacien;
    }

    public void setIdActualite(int idActualite) {
        this.idActualite = idActualite;
    }

    public void setLibelleActualite(String libelleActualite) {
        this.libelleActualite = libelleActualite;
    }

    public void setImageActualite(String imageActualite) {
        this.imageActualite = imageActualite;
    }

    public void setDateActualite(Date dateActualite) {
        this.dateActualite = dateActualite;
    }

    public void setHeureActualite(String heureActualite) {
        this.heureActualite = heureActualite;
    }

    public void setFkidPharmacien(int fkidPharmacien) {
        this.fkidPharmacien = fkidPharmacien;
    }
    
}
