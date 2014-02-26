/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author wael.boumaiza
 */
public class Region {
    
    private int idG;
    private String libREgion;
//    Grouverment grouverment;
    
    public Region() {
    }

    public int getIdG() {
        return idG;
    }

    public void setIdG(int idG) {
        this.idG = idG;
    }

    public String getLibREgion() {
        return libREgion;
    }

    public void setLibREgion(String libREgion) {
        this.libREgion = libREgion;
    }

    @Override
    public String toString() {
        return "Region{" + "idG=" + idG + ", libREgion=" + libREgion + '}';
    }
    
    
    
}
