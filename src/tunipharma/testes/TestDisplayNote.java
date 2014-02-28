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
public class TestDisplayNote {
    
     public static void main(String[] args) {

        List<Note> note = new ArrayList<Note>();
        NoteDAO noteDAO = new NoteDAO();
        
        note = noteDAO.DisplayAllNote();                        // à verifier
        for (int i = 0; i < note.size(); i++) {
            System.out.println(note.get(i));
        }

    }
    
}
