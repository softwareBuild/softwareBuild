/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.RegionDAO;
import tunipharma.entities.Region;

/**
 *
 * @author wael.boumaiza
 */
public class testAddRegion {
    
    public static void main(String[] args) {
        Region region = new Region();
        RegionDAO regionDAO = new RegionDAO();
        region.setLibREgion("La Marsa");
        regionDAO.insertRegion(region);
    }
    
}
