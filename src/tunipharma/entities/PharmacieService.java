/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author ali
 */
public class PharmacieService {
    
    
    private int idService;
    private String libelleService;
    private int fkidPharmacie;
    
    public PharmacieService()
    {
    
    }
    
    
    public int getIdService()
    {
      return idService;  
    }
    
    public void setIdService(int idService)
    {
        this.idService=idService;  
        
    }
    
    public String getLibelleService()
    {
        return libelleService;
    }
    
    public void setLibelleService(String libelleService)
    {
        this.libelleService= libelleService;
    }

    public int getFkidPharmacie() {
        return fkidPharmacie;
    }

    public void setFkidPharmacie(int fkidPharmacie) {
        this.fkidPharmacie = fkidPharmacie;
    }

    @Override
    public String toString() {
        return "PharmacieService{" + "idService=" + idService + ", libelleService=" + libelleService + ", fkidPharmacie=" + fkidPharmacie + '}';
    }

    
    
    
}
