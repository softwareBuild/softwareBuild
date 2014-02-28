/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.sql.Date;
import tunipharma.dao.ActualiteDAO;
import tunipharma.entities.Actualites;



/**
 *
 * @author omar
 */
public class TestAjoutActualite {
     public static void main(String[] args) {
         Actualites n =new Actualites();
                n.setIdActualite(2);
                n.setLibelleActualite("act1");
                n.setImageActualite("act1.png");
                 Date d=new Date(2014-1900,1,12);
                n.setHeureActualite("12:25:36");
                n.setFkidPharmacien(15);
                
         ActualiteDAO actDAO = new ActualiteDAO();
         if (actDAO.insertactualite(n)==true)
         System.out.println("l'insersion est bien fait");
         
     
        }
}
