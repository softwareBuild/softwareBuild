/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tunipharma.entities.PharmacieService;
import tunipharma.dao.ServicePharmcieDAO;

/**
 *
 * @author ali
 */

 


public class PharmacieServiceModel extends   AbstractTableModel {

    List<PharmacieService> service = new ArrayList<PharmacieService>();
    // entet de tablaux
    String[] entete = {"ID Service","Libellé Service","fkidPharmacie"};
    
    public PharmacieServiceModel(){
        service = new ServicePharmcieDAO().DisplayAllServices();
    }
            
    public int getRowCount() {
        return  service.size();
    }

    public int getColumnCount() {
    return  entete.length;
    }

    public Object getValueAt(int rowIndex, int columIndex ) {
        switch (columIndex){
            case 0 : 
                return service.get(rowIndex).getIdService();
            case 1 :
                return service.get(rowIndex).getLibelleService();
            case 2:
                return service.get(rowIndex).getFkidPharmacie();
            
            default: 
                throw new IllegalArgumentException();
        }
        
        
    }
    public String getColumnName(int colum){
        return  entete[colum];
    }
    
    
}

    

