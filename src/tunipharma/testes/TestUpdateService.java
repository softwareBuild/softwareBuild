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


public class TestUpdateService {
    
    public static void main(String[] args) {

        PharmacieService service = new PharmacieService();
        PharmacieServiceDAO serviceDAO = new PharmacieServiceDAO();
        service = serviceDAO.findServiceByLibellle("infirmerie");
        //service=serviceDAO.findServiceById(1);
        service.setLibelleService("7IIIIIIIIIIIIIIIT");
        serviceDAO.updateService(service);

    }
    
    
    
    
    
}
