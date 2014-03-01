/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

import tunipharma.dao.NoteDAO;
import tunipharma.entities.Note;
import tunipharma.services.NoteService;

/**
 *
 * @author ali
 */
public class TestUpdateNote {
    
    
    public static void main(String[] args) {

        Note notes = new Note();
        NoteDAO notesDAO = new NoteDAO();
        NoteService noteService = new NoteService();
        notes = noteService.findNoteById(5);
        notes.SetNoteAtt(20);
        notesDAO.updateNote(notes);

    }
    
}
