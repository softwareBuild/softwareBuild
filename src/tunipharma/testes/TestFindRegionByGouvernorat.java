/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.RegionDAO;
import tunipharma.entities.Region;
import tunipharma.services.RegionService;

/**
 *
 * @author wael.boumaiza
 */
public class TestFindRegionByGouvernorat {
      public static void main(String[] args) { 
          Region region =new Region();
          RegionDAO regionDAO =new RegionDAO();  
          RegionService regionService = new RegionService();
          List<Region> regions= new ArrayList<Region>();
          regions=regionService.DisplayAllRegionGouver(2);
            for (int i = 0; i < regions.size(); i++) {
         System.out.println(regions.get(i).toString()); 
      }
          
          
    
      }

          
}
