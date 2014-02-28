/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tunipharma.dao.AdminDAO;
import tunipharma.dao.AdminDAO;
import tunipharma.entities.Admin;

/**
 *
 * @author omar
 */
public class AdminModel  extends AbstractTableModel{
   
    List<Admin> admins = new ArrayList<Admin>();
    
    String[] entete = {"login","password"};

    public AdminModel() {
        admins = new AdminDAO().DisplayInfoAdmin();
    }
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
       public Object getValueAt(int rowIndex, int columIndex ) {
        switch (columIndex){
            case 0 : 
                return admins.get(rowIndex).getLogin();
            case 1 :
                return admins.get(rowIndex).getPassword();
          
            default: 
                throw new IllegalArgumentException();
        }
        
        
    }

        public String getColumnName(int colum){
        return  entete[colum];
    }

}
