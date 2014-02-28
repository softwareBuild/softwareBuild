/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tunipharma.dao.NoteDAO;
import tunipharma.entities.Note;

/**
 *
 * @author ali
 */

 


public class NoteModel extends   AbstractTableModel {

    List<Note> note = new ArrayList<Note>();
    // entet de tablaux
    String[] entete = {"ID Note","Note","date Note","fkidService","fkidPatient"};
    
    public NoteModel(){
        note = new NoteDAO().DisplayAllNote();
    }
            
    public int getRowCount() {
        return  note.size();
    }

    public int getColumnCount() {
    return  entete.length;
    }

    public Object getValueAt(int rowIndex, int columIndex ) {
        switch (columIndex){
            case 0 : 
                return note.get(rowIndex).getIdNote();
            case 1 :
                return note.get(rowIndex).getNoteAtt();
            case 2 :
                return note.get(rowIndex).getDateNote();
            case 3 : 
                return note.get(rowIndex).getHeureNote();
            case 4 : 
                return note.get(rowIndex).getFkidService();    
            case 5 : 
                return note.get(rowIndex).getFkidPatient();    
                
            default: 
                throw new IllegalArgumentException();
        }
        
        
    }
    public String getColumnName(int colum){
        return  entete[colum];
    }
    
    
}

    

