/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wael.boumaiza
 */

public class Gouvernorat {
    
    private int idG;
    private String libG;
    
    public Gouvernorat() {}

    public int getIdG() {
        return idG;
    }

    public void setIdG(int idG) {
        this.idG = idG;
    }

    public String getLibG() {
        return libG;
    }

    public void setLibG(String libG) {
        this.libG = libG;
    }

    @Override
    public String toString() {
        return "Grouverment{" + "idG=" + idG + ", libG=" + libG + '}';
    }
    
    
}
