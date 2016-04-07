/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author jonathanraillard
 */
public class mysql {
   public static Connection connect (String nomBase) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
       Properties prop = new Properties();
       prop.put("user", "root"); prop.put("password","root");prop.put("charSet","UTF-");
       return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nomBase, prop);
   } 
   
   public static Connection importation() throws Exception{
        Connection con = connect("GestionAct"); System.out.println("Base de données MySQL \"EmplDept\"");  
        return con;
   }
}
