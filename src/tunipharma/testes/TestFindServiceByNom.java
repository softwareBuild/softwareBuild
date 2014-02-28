/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.PharmacieServiceDAO;
import tunipharma.entities.PharmacieService;

/**
 *
 * @author ali
 */
public class TestFindServiceByNom {
    
    public static void main(String[] args) {

        PharmacieService service = new PharmacieService();
        PharmacieServiceDAO serviceDAO = new PharmacieServiceDAO();
        service = serviceDAO.findServiceByLibellle("vente en ligne");
        //service=serviceDAO.findServiceById(1);
        System.out.println(service);
        serviceDAO.updateService(service);

    }
    
}

