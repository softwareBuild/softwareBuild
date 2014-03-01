/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

/**
 *
 * @author ali
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Note;
import tunipharma.util.MyConnection;




public class NoteDAO {
    
    public void insertNote(Note n){

        String requete = "insert into note (idNote,noteAtt,dateNote,heureNote,fkidService,fkidPatient) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, n.getIdNote());
            ps.setInt(2, n.getNoteAtt());
            ps.setDate(3, n.getDateNote());
            ps.setTime(4, n.getHeureNote());
            ps.setInt(5, n.getFkidService());
            ps.setInt(6, n.getFkidPatient());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void updateNote(Note n){
        String requete = "update note set noteAtt=? where idNote=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setInt(1, n.getNoteAtt());
            ps.setInt(2, n.getIdNote());
           // ps.setDate(3,n.getDateNote());
            //ps.setTime(4,n.getHeureNote());
           // ps.setInt(5, n.getFkidService());
            //ps.setInt(6, n.getFkidPatient());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    public void deleteNote(int note){
        String requete = "delete from note where noteAtt='"+note+"'";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.executeUpdate();
            System.out.println("Note supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    public List<Note> DisplayAllNote (){


        List<Note> notes = new ArrayList<Note>();

        String requete = "select * from note";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Note note =new Note();
                note.SetIdNote(resultat.getInt(1));
                note.SetNoteAtt(resultat.getInt(2));
                note.SetDateNote(resultat.getDate(3));
                note.SetHeureNote(resultat.getTime(4));
                
                notes.add(note);
            }
            return notes;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des notes "+ex.getMessage());
            return null;
        }
    }
}
