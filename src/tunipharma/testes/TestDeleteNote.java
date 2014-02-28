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

public class TestDeleteNote {
    
  
    
    public static void main(String[] args) {

        Note note = new Note();
        NoteDAO noteDAO = new NoteDAO();         // à verifier
        //note = noteDAO.findNoteByNote(13);
        note.getIdNote();
        noteDAO.deleteNote(12);

    }
}
