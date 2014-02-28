/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.NoteDAO;
import tunipharma.entities.Note;



/**
 *
 * @author ali
 */
public class TestfindNoteByNote {
     public static void main(String[] args) {

        List<Note> notes = new ArrayList<Note>();
        NoteDAO noteDAO = new NoteDAO();
        
        notes = (List<Note>) noteDAO.findNoteByNote(13);                        // à verifier
        for (int i = 0; i < notes.size(); i++) {
            System.out.println(notes.get(i));
        }

        /* Note note = new Note();
         note.SetIdNote(1);
         note.SetNoteAtt(12);
         note.SetDateNote("21/02/1990");
         note.SetHeureNote("22:22");
         System.out.println(note);
         */ 
          
         
    }
    
    
}
