/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.models;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tunipharma.dao.PatientDAO;
import tunipharma.entities.Patient;

/**
 *
 * @author wael.boumaiza
 */
public class PatientModel extends AbstractTableModel {

    List<Patient> patients = new ArrayList<Patient>();
    
    String[] entete = {"Id","Login","Password","Nom","Prenom","Adresse"};
    
    public PatientModel(){
        patients = new PatientDAO().DisplayAllPatient();
    }
            
    public int getRowCount() {
        return  patients.size();
    }

    public int getColumnCount() {
    return  entete.length;
    }

    public Object getValueAt(int rowIndex, int columIndex ) {
        switch (columIndex){
            case 0 : 
                return patients.get(rowIndex).getIdPatient();
            case 1 :
                return patients.get(rowIndex).getLogin();
            case 2 :
                return patients.get(rowIndex).getPassword();
            case 3 : 
                return patients.get(rowIndex).getNom();
            case 4 : 
                return patients.get(rowIndex).getPrenom();
            case 5 : 
                return patients.get(rowIndex).getAdresse();
            default: 
                throw new IllegalArgumentException();
        }
        
        
    }
    public String getColumnName(int colum){
        return  entete[colum];
    }
    
    
}
