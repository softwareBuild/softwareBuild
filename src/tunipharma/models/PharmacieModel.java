/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.models;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tunipharma.dao.PatientDAO;
import tunipharma.dao.PharmacieDAO;
import tunipharma.entities.Patient;
import tunipharma.entities.Pharmacie;

/**
 *
 * @author wael.boumaiza
 */
public class PharmacieModel extends AbstractTableModel {

    List<Pharmacie> pharmacies = new ArrayList<Pharmacie>();
    
    String[] entete = {"Id","Login","Password","Nom","Prenom","Adresse","000"};
    
    public PharmacieModel(){
        pharmacies = new PharmacieDAO().DisplayAllPharmacie();
       }

    public PharmacieModel(String lib) {
       pharmacies = new PharmacieDAO().DisplayAllPharmacieByLibelle(lib);  
    }

    public PharmacieModel(int garde) {
        pharmacies = new PharmacieDAO().DisplayAllPharmacieGarde(garde);
    }

    public PharmacieModel(String type,int a) {
        pharmacies = new PharmacieDAO().DisplayAllPharmacieNuit(type,0);
    }
    
    public PharmacieModel(String adr,int a,int b) {
        pharmacies = new PharmacieDAO().DisplayAllByAdresse(adr, a, b);
    }
    
            
    public int getRowCount() {
        return  pharmacies.size();
    }

    public int getColumnCount() {
    return  entete.length;
    }

    public Object getValueAt(int rowIndex, int columIndex ) {
        switch (columIndex){
            case 0 : 
                return pharmacies.get(rowIndex).getPhLibelle();
            case 1 :
                return pharmacies.get(rowIndex).getPhRaisonSocial();
            case 2 :
                return pharmacies.get(rowIndex).getPhMatriculeFiscale();
            case 3 : 
                return pharmacies.get(rowIndex).getPhRegistre();
            case 4 : 
                return pharmacies.get(rowIndex).getPhAdresse();
            case 5 : 
                return pharmacies.get(rowIndex).getTypePharmacie();
                case 6 : 
                return pharmacies.get(rowIndex).getGarde();
            default: 
                throw new IllegalArgumentException();
        }
        
        
    }
    public String getColumnName(int colum){
        return  entete[colum];
    }
    
    
}
