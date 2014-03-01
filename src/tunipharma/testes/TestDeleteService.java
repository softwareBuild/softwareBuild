/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

import tunipharma.dao.ServicePharmcieDAO;
import tunipharma.dao.ServicePharmcieDAO;
import tunipharma.entities.PharmacieService;


public class TestDeleteService {
    
    public static void main(String[] args) {

        PharmacieService service = new PharmacieService();
        ServicePharmcieDAO serviceDAO = new ServicePharmcieDAO();         // à verifier
       // service = serviceDAO.findServiceById(1);
       // service.getIdService();
        serviceDAO.deleteService(1);

    }
    
}