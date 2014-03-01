/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.Test;

import java.util.ArrayList;
import java.util.List;
import tunipharma.dao.NoteDAO;
import tunipharma.entities.Note;
import tunipharma.services.NoteService;



/**
 *
 * @author ali
 */
public class TestfindNoteByNote {
     public static void main(String[] args) {

        List<Note> notes = new ArrayList<Note>();
        NoteDAO noteDAO = new NoteDAO();
        NoteService noteService = new NoteService();
        
        notes = (List<Note>) noteService.findNoteByNote(13);                        // à verifier
        for (int i = 0; i < notes.size(); i++) {
            System.out.println(notes.get(i));
        }
      }
   }
