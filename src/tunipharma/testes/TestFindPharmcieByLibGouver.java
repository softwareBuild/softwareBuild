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
public class TestFindPharmcieByLibGouver {
    public static void main(String[] args) { 
    
      Gouvernorat grouverment = new Gouvernorat();
      GouvernoratDAO grouvermentDAO = new GouvernoratDAO();
      GouvernoratService gouvernratService = new GouvernoratService(); 
      grouverment = gouvernratService.findGrouvermentByLib("Ariana");
      System.out.println(grouverment);
    
    } 
}
