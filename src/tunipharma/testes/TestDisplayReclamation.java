/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;
import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.ReclamationDAO;
import tunipharma.entities.Reclamation;

/**
 *
 * @author omar
 */
public class TestDisplayReclamation {
      public static void main(String[] args) {
        Reclamation reclamation = new Reclamation();
        ReclamationDAO daoRecllamation = new ReclamationDAO();
        List<Reclamation> reclamations = new ArrayList<Reclamation>();
        reclamations=daoRecllamation.DisplayAllReclamations();
      for (int i = 0; i < reclamations.size(); i++) {
         System.out.println(reclamations.get(i).toString()); 
      }   
        }
        }
