/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.ServicePharmcieDAO;
import tunipharma.entities.PharmacieService;

/**
 *
 * @author ali
 */
public class TestDisplayService {
    
    public static void main(String[] args) {

        List<PharmacieService> service = new ArrayList<PharmacieService>();
        ServicePharmcieDAO pharmacieServiceDAO = new ServicePharmcieDAO();
        
        service = pharmacieServiceDAO.DisplayAllServices();                        // à verifier
        for (int i = 0; i < service.size(); i++) {
            System.out.println(service.get(i));
        }

    }
}
    

