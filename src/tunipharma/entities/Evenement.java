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
public class Evenement {
   private int idEvent;
   private String libEvent;
  
   private java.sql.Date dateEvent;
   private java.sql.Time heureEvent;
   private String lieuEvent;
private String fklibellePharmacie;

    @Override
    public String toString() {
        return "Evenement{" + "idEvent=" + idEvent + ", libEvent=" + libEvent + ", dateEvent=" + dateEvent + ", heureEvent=" + heureEvent + ", lieuEvent=" + lieuEvent + ", fklibellePharmacie=" + fklibellePharmacie + '}';
    }

    public String getFklibellePharmacie() {
        return fklibellePharmacie;
    }

    public void setFklibellePharmacie(String fklibellePharmacie) {
        this.fklibellePharmacie = fklibellePharmacie;
    }
    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getLibEvent() {
        return libEvent;
    }

    public void setLibEvent(String libEvent) {
        this.libEvent = libEvent;
    }

    public Date getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Date dateEvent) {
        this.dateEvent = dateEvent;
    }

    public Time getHeureEvent() {
        return heureEvent;
    }

    public void setHeureEvent(Time heureEvent) {
        this.heureEvent = heureEvent;
    }

    public String getLieuEvent() {
        return lieuEvent;
    }

    public void setLieuEvent(String lieuEvent) {
        this.lieuEvent = lieuEvent;
    }

 

    
   
}
