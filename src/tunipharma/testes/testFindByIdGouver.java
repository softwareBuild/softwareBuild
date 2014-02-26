/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.GouvernratDAO;
import tunipharma.entities.Gouvernrat;

/**
 *
 * @author wael.boumaiza
 */
public class testFindByIdGouver {
    public static void main(String[] args) { 
    
      Gouvernrat grouverment = new Gouvernrat();
      GouvernratDAO grouvermentDAO = new GouvernratDAO();
      grouverment = grouvermentDAO.findGrouvermentById(1);
      System.out.println(grouverment);
    
    }  
}
