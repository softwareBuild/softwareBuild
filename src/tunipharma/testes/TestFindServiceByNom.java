/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.ServicePharmcieDAO;
import tunipharma.entities.PharmacieService;
import tunipharma.services.ServicePharmcieService;

/**
 *
 * @author ali
 */
public class TestFindServiceByNom {
    
    public static void main(String[] args) {

        PharmacieService service = new PharmacieService();
        ServicePharmcieDAO serviceDAO = new ServicePharmcieDAO();
        ServicePharmcieService servicePharmcieService = new ServicePharmcieService();
        service = servicePharmcieService.findServiceByLibellle("vente en ligne");
        System.out.println(service);
        serviceDAO.updateService(service);

    }
    
}

