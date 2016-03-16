/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaine;
import base.*;
import metier.*;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
/**
 *
 * @author jonathanraillard
 */
public class ParticipantDAO {
    public static ArrayList lstParticipants = new ArrayList();
    
    public static ArrayList getLstParticipants(){
        try {loadPart();} catch (Exception e) {e.getMessage();}
        return  lstParticipants;
    }
    
    public static int getNoPers(int indPart){
        int no = ((Participant)lstParticipants.get(indPart)).getNoPart();
        return no;
    }
    
    private static void loadPart() throws Exception{
        Connection con = mysql.importation();
        try{
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM Participant ORDER BY Nom, Prenom");
            while (rs.next()) {                
                int id = rs.getInt("NoPart");
                String nom = rs.getString("Nom");
                String prenom = rs.getString("Prenom");
                String tel = rs.getString("Telephone");
                Participant Part = new Participant(id,nom,prenom,tel);
                lstParticipants.add(Part);
            }   
        } catch (Exception e){e.getMessage();}
        
    }    
}

