/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.RegionDAO;
import tunipharma.entities.Region;

/**
 *
 * @author wael.boumaiza
 */
public class TestFindRegionByGouvernorat {
      public static void main(String[] args) { 
          Region region =new Region();
          RegionDAO regionDAO =new RegionDAO();          
          List<Region> regions= new ArrayList<Region>();
          regions=regionDAO.DisplayAllRegionGouver(2);
            for (int i = 0; i < regions.size(); i++) {
         System.out.println(regions.get(i).toString()); 
      }
          
          
    
      }

          
}
