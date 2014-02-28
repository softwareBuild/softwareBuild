/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

/**
 *
 * @author ali
 */


import tunipharma.dao.PharmacieServiceDAO;
import tunipharma.entities.PharmacieService;



public class TestAddService {
    
    public static void main(String[] args) {
        PharmacieService service = new PharmacieService();
        PharmacieServiceDAO serviceDAO = new PharmacieServiceDAO();
        service.setIdService(0);
        service.setLibelleService("infirmerie");
        service.setFkidPharmacie(2);
        
        serviceDAO.insertService(service);
    }
    
}
