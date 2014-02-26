/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author sahar
 */
public class Pharmacie {
   private  String phLibelle;
   private String  phRaisonSocial;
   private int  phMatriculeFiscale ;
   private String  phRegistre;
   private String   phAdresse;
   private String  typePharmacie;
   private int  garde;

    public String getPhLibelle() {
        return phLibelle;
    }

    public void setPhLibelle(String phLibelle) {
        this.phLibelle = phLibelle;
    }

    public String getPhRaisonSocial() {
        return phRaisonSocial;
    }

    public void setPhRaisonSocial(String phRaisonSocial) {
        this.phRaisonSocial = phRaisonSocial;
    }

    public int getPhMatriculeFiscale() {
        return phMatriculeFiscale;
    }

    public void setPhMatriculeFiscale(int phMatriculeFiscale) {
        this.phMatriculeFiscale = phMatriculeFiscale;
    }

    public String getPhRegistre() {
        return phRegistre;
    }

    public void setPhRegistre(String phRegistre) {
        this.phRegistre = phRegistre;
    }

    public String getPhAdresse() {
        return phAdresse;
    }

    public void setPhAdresse(String phAdresse) {
        this.phAdresse = phAdresse;
    }

    public String getTypePharmacie() {
        return typePharmacie;
    }

    public void setTypePharmacie(String typePharmacie) {
        this.typePharmacie = typePharmacie;
    }

    public int getGarde() {
        return garde;
    }

    public void setGarde(int garde) {
        this.garde = garde;
    }

    @Override
    public String toString() {
        return "Pharmacie{" + "phLibelle=" + phLibelle + ", phRaisonSocial=" + phRaisonSocial + ", phMatriculeFiscale=" + phMatriculeFiscale + ", phRegistre=" + phRegistre + ", phAdresse=" + phAdresse + ", typePharmacie=" + typePharmacie + ", garde=" + garde + '}';
    }
   
    
    
}
