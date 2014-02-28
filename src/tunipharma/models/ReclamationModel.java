/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.models;
import tunipharma.dao.ReclamationDAO;
import tunipharma.entities.Reclamation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Amine
 */
public class ReclamationModel extends AbstractTableModel {

    List<Reclamation> reclamations = new ArrayList<Reclamation>();
    String[] entete = {"idReclamation", "msgReclamation", "dateReclamation", "fkidPatient","heureReclamation"};

    public ReclamationModel() {
        reclamations = new ReclamationDAO().DisplayAllReclamations();
    }

    public int getRowCount() {
        return reclamations.size();
    }

    public int getColumnCount() {
        return entete.length;
    }


    @Override
    public String getColumnName(int column) {
        return entete[column];
    }
  public Object getValueAt(int rowIndex, int columnIndex) {
     Reclamation rec= reclamations.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return reclamations.get(rowIndex).getIdReclamation();
            case 1:
                return reclamations.get(rowIndex).getMsgReclamation();
            case 2:
                return reclamations.get(rowIndex).getDateReclamation();
            case 3:
                return reclamations.get(rowIndex).getFkidPatient();
                case 4:
                return reclamations.get(rowIndex).getHeureReclamation();
            default:
                 throw new IllegalArgumentException();
        }
        
    }
    
}
