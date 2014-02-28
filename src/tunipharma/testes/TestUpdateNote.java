/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

import tunipharma.dao.NoteDAO;
import tunipharma.entities.Note;

/**
 *
 * @author ali
 */
public class TestUpdateNote {
    
    
    public static void main(String[] args) {

         Note notes = new Note();
        NoteDAO notesDAO = new NoteDAO();
        notes = notesDAO.findNoteById(5);
        //notes.SetIdNote(1);
        notes.SetNoteAtt(20);
        
        notesDAO.updateNote(notes);

    }
    
}
