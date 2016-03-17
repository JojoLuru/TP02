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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import metier.*;

/**
 *
 * @author jonathanraillard
 */
public class PrendPartDAO {
    public static ArrayList lstPrendPart = new ArrayList();
    public static ArrayList lst =new ArrayList();
    
    public static int getNoAct(int ind){
        int no = ((Activite)lst.get(ind)).getNoAct();
        return no;
    }
    
    public static ArrayList getLstAct(int noPar){
        lst.removeAll(lst);
        for (int i = 0; i < lstPrendPart.size(); i++) {
            if(((PrendPart)lstPrendPart.get(i)).getNoPart()==noPar){
                int noAct = (((PrendPart)lstPrendPart.get(i)).getNoAct());
                mauchlySort(ActiviteDAO.getActivite(noAct));
            }
        }
        return lst; 
    }
    
    public static void ajouter (int indAct, int indPers) throws Exception {
        Connection con = mysql.importation();
        try{
            PreparedStatement stmtInsert = con.prepareStatement("INSERT INTO `PrendPart`(`NoPart`, `NoAct`) VALUES ("+ indPers + "," + indAct +")");
            stmtInsert.executeUpdate();
            stmtInsert.close();     
        }catch (Exception e){e.getMessage();}
        try{load();}catch(Exception e){e.getMessage();} 
    }
    
    public static void loadPrendPart(){
        try {load();} catch (Exception e) {e.getMessage();}  
    }
    
    public static void efface(int noAct, int noPers){
        for (int i = 0; i < lstPrendPart.size(); i++) {
            if ((noAct == (((PrendPart)lstPrendPart.get(i))).getNoAct()) && (noPers == (((PrendPart)lstPrendPart.get(i)).getNoPart()))) {
                try {deleteFromBdd(noAct, noPers);} catch (Exception e){e.getMessage();}
            }   
            
        }
        try{load();}catch(Exception e){e.getMessage();}
    }
    
    private static void deleteFromBdd(int noAct, int noPers) throws Exception{
        Connection con = mysql.importation();
        try {
            PreparedStatement stmtEff = con.prepareStatement("DELETE FROM `PrendPart` WHERE `NoPart` = " + noPers + " AND `NoAct`=" + noAct);
            stmtEff.executeUpdate();
            stmtEff.close();   
        } catch (SQLException e){System.err.println("Erreur SQL : " + e.getMessage());}
    }
    
    private static void load() throws Exception{
        Connection con = mysql.importation();
        lstPrendPart.removeAll(lstPrendPart);
        try{
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM PrendPart");
            while (rs.next()) {                
                int noPart = rs.getInt("NoPart");
                int noAct = rs.getInt("NoAct");
                PrendPart pP = new PrendPart(noPart,noAct);
                lstPrendPart.add(pP);
            }    
        } catch (Exception e){e.getMessage();}   
        
    }
    
    private static void mauchlySort(Activite Act){
       int pos;
       if(lst.isEmpty() || Act.compareTo((Activite)lst.get(0))<0){
            pos=0;
       } else if(Act.compareTo((Activite)lst.get(lst.size()-1))>=0) {
           pos = lst.size();
       } else {
           int g = 0, d = lst.size()-1;
           while(g<d-1){
               int m = (d+g)/2;
               if(((Activite)lst.get(m)).compareTo(Act) <0){
                   g = m;
               }else{
                   d = m;
               }
           }
           pos = d;
       }
       lst.add(pos, Act);
    } //mauchlySort
    
    
}
