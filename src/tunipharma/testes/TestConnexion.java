/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.testes;

import tunipharma.services.AuthentificationSERVICE;

/**
 *
 * @author wael.boumaiza
 */
public class TestConnexion {
      public static void main(String[] args) {
                  //connection 
        AuthentificationSERVICE authentificationSERVICE = new AuthentificationSERVICE();
        boolean test;
        test = authentificationSERVICE.connexion("admin", "admin");

      }
    
    
    
}
