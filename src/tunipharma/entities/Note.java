/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author ali
 */
public class Note {

    
    
    private int idNote;
    private int noteAtt;
    private java.sql.Date dateNote;    // à convertir en date ulterieurement
    private java.sql.Time heureNote;
    private int fkidService ;
    private int fkidPatient;
    
    public Note ()
    {
    
    
    }
    
    public int getIdNote()
    {
        return idNote;
    
    }
    
    public void SetIdNote(int idNote)
            
    {
        this.idNote=idNote;
    }
    
    public int getNoteAtt()
    {
        return noteAtt;
        
    }
    
    public void SetNoteAtt(int noteAtt)
    {
        this.noteAtt=noteAtt;
    
    }
    
    public java.sql.Date getDateNote()
    {
        return dateNote;
    }
    
    public void SetDateNote(java.sql.Date dateNote)
    {
        this.dateNote=dateNote;
    }
           
    public java.sql.Time getHeureNote()
    {
        return heureNote;
    }
    
    public void SetHeureNote(java.sql.Time heureNote)
    {
        this.heureNote=heureNote;
    }  
    
     public int getFkidService() {
        return fkidService;
    }

    public void setFkidService(int fkidService) {
        this.fkidService = fkidService;
    }

    public int getFkidPatient() {
        return fkidPatient;
    }

    public void setFkidPatient(int fkidPatient) {
        this.fkidPatient = fkidPatient;
    }

    @Override
    public String toString() {
        return "Note{" + "idNote=" + idNote + ", noteAtt=" + noteAtt + ", dateNote=" + dateNote + ", heureNote=" + heureNote + ", fkidService=" + fkidService + ", fkidPatient=" + fkidPatient + '}';
    }
    
    
    
}
