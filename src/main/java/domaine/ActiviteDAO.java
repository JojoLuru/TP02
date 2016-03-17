/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaine;

import base.mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import metier.Activite;

/**
 *
 * @author jonathanraillard
 */
public class ActiviteDAO {
    public static ArrayList lstActivites = new ArrayList();
   
    public static int getNoAct(int indAct){
        int no = ((Activite)lstActivites.get(indAct)).getNoAct();
        return no;
    }
    
    public static Activite getActivite(int no){
        Activite act;
        for (int i = 0; i < lstActivites.size(); i++) {
            if (((Activite)lstActivites.get(i)).getNoAct()==no) {
                return ((Activite)lstActivites.get(i));
            }
        }
        return null;
    }
    
    public static ArrayList getLstActivites(){
        try {loadAct();} catch (Exception e) {e.getMessage();}
        return  lstActivites;
    }
    
    private static void loadAct() throws Exception{
        Connection con = mysql.importation();
        try{
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM Activite ORDER BY Libelle");
            while (rs.next()) {                
                int id = rs.getInt("NoAct");
                String nom = rs.getString("Libelle");
                Activite Act = new Activite(id,nom);
                lstActivites.add(Act);
            }
          
        } catch (Exception e){e.getMessage();}
        
    }
    
}
