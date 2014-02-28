/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.NoteDAO;
import tunipharma.entities.Note;


/**
 *
 * @author ali
 */
public class TestAddNote {
    
    
    public static void main(String[] args) {
     Note note = new Note();
        NoteDAO eventsDAO = new NoteDAO();
        
        note.SetIdNote(0);
        note.SetNoteAtt(20);
        
        Date d=new Date(2014-1900,1,12);
        note.SetDateNote(d);
        note.SetHeureNote(new java.sql.Time(12, 12, 13));
        note.setFkidPatient(1);
        note.setFkidService(1);
        
        
        eventsDAO.insertNote(note);
}
}