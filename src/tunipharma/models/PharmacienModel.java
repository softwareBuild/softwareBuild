/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.models;

import tunipharma.dao.PharmacienDAO;
import tunipharma.entities.Pharmacien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tunipharma.entities.Pharmacien;

/**
 *
 * @author Amine
 */
public class PharmacienModel extends AbstractTableModel {

   
 List<Pharmacien> pharmaciens = new ArrayList<Pharmacien>();
    String[] entete = {"idPharmacien", "login ", "pseudo","password", "nom","prenom","adresse","fkphLibelle"};
    
    public PharmacienModel() {
       
     //   pharmaciens = new PharmacienDAO().;
        

    }

    public int getRowCount() {
        return pharmaciens.size();
    }

    public int getColumnCount() {
        return entete.length;
    }


    @Override
    public String getColumnName(int column) {
        return entete[column];
    }
  public Object getValueAt(int rowIndex, int columnIndex) {
     Pharmacien ph= pharmaciens.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pharmaciens.get(rowIndex).getIdPharmacien();
            case 1:
                //return pharmaciens.get(rowIndex).getLogin();
            case 2:
                return pharmaciens.get(rowIndex).getPseudoPharmacien();
            case 3:
                //return pharmaciens.get(rowIndex).getPassword();
            case 4:
                return pharmaciens.get(rowIndex).getNomPharmacien();
            case 5:
                return pharmaciens.get(rowIndex).getPrenomPharmacien();
            case 6:
                return pharmaciens.get(rowIndex).getAddressePharmacien();
            case 7:
                //return pharmaciens.get(rowIndex).getFkphLibelle();
            default:
                 throw new IllegalArgumentException();
        }
        
    }
    
}
