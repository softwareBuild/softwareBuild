/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

/**
 *
 * @author ali
 */


import tunipharma.dao.ServicePharmcieDAO;
import tunipharma.entities.PharmacieService;



public class TestAddService {
    
    public static void main(String[] args) {
        PharmacieService service = new PharmacieService();
        ServicePharmcieDAO serviceDAO = new ServicePharmcieDAO();
        service.setIdService(0);
        service.setLibelleService("infirmerie");
        service.setFkidPharmacie(2);
        
        serviceDAO.insertService(service);
    }
    
}
