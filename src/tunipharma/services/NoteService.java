/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Note;
import tunipharma.util.MyConnection;

/**
 *
 * @author wael.boumaiza
 */
public class NoteService {
    
    public Note findNoteById(int id){
    Note note = new Note();
     String requete = "select * from note where idNote=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                note.SetIdNote(resultat.getInt(1));
                note.SetNoteAtt(resultat.getInt(2));
                note.SetDateNote(resultat.getDate(3));
                note.SetHeureNote(resultat.getTime(4));
            }
            return note;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de la note "+ex.getMessage());
            return null;
        }
    }
    
    public List<Note> findNoteByNote(int noteAtt){
         List<Note> notes = new ArrayList<Note>();
    Note note = new Note();
     String requete = "select * from note where noteAtt ='"+noteAtt+"'";;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, noteAtt);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                note.SetIdNote(resultat.getInt(1));
                //System.out.println(note.getIdNote());
                note.SetNoteAtt(resultat.getInt(2));
                //System.out.println(resultat.getString(2));
                note.SetDateNote(resultat.getDate(3));
                //System.out.println(resultat.getString(3));
                note.SetHeureNote(resultat.getTime(4));
                //System.out.println(resultat.getString(6));
                notes.add(note);
            }
            return notes;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de la note "+ex.getMessage());
            return null;
        }
    }
}
