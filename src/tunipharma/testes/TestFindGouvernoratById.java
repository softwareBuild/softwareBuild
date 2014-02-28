/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.dao.GouvernoratDAO;
import tunipharma.entities.Gouvernorat;
import tunipharma.services.GouvernoratService;

/**
 *
 * @author wael.boumaiza
 */
public class TestFindGouvernoratById {
    public static void main(String[] args) { 
    
      Gouvernorat grouverment = new Gouvernorat();
      GouvernoratDAO grouvermentDAO = new GouvernoratDAO();
      GouvernoratService gouvernratService = new GouvernoratService(); 
      grouverment = gouvernratService.findGrouvermentById(1);
      System.out.println(grouverment);
    
    }  
}
