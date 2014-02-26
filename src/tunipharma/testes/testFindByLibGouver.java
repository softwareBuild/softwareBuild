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
public class testFindByLibGouver {
    public static void main(String[] args) { 
    
      Gouvernrat grouverment = new Gouvernrat();
      GouvernratDAO grouvermentDAO = new GouvernratDAO();
      //grouverment = grouvermentDAO.findGrouvermentByLib("La Manouba");
      grouverment = grouvermentDAO.findGrouvermentByLib("Ariana");
      System.out.println(grouverment);
    
    } 
}
