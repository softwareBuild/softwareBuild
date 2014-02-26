/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author sahar
 */
public class Pharmacien {
    private String idPharmacien;//1
    private String nomPharmacien;//2
    private String prenomPharmacien;//3
    private int numTelPharmacien;//4
    private String addressePharmacien;//5
    private String pseudoPharmacien;//6

    public String getIdPharmacien() {
        return idPharmacien;
    }

    public void setIdPharmacien(String idPharmacien) {
        this.idPharmacien = idPharmacien;
    }

    public String getNomPharmacien() {
        return nomPharmacien;
    }

    public void setNomPharmacien(String nomPharmacien) {
        this.nomPharmacien = nomPharmacien;
    }

    public String getPrenomPharmacien() {
        return prenomPharmacien;
    }

    public void setPrenomPharmacien(String prenomPharmacien) {
        this.prenomPharmacien = prenomPharmacien;
    }

    public int getNumTelPharmacien() {
        return numTelPharmacien;
    }

    public void setNumTelPharmacien(Number numTelPharmacien) {
        this.numTelPharmacien = (int) numTelPharmacien;
    }

    public String getAddressePharmacien() {
        return addressePharmacien;
    }

    public void setAddressePharmacien(String addressePharmacien) {
        this.addressePharmacien = addressePharmacien;
    }

    public String getPseudoPharmacien() {
        return pseudoPharmacien;
    }

    public void setPseudoPharmacien(String pseudoPharmacien) {
        this.pseudoPharmacien = pseudoPharmacien;
    }

   
}
