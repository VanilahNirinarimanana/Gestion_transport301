/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.connexiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Vanilah
 */
public class ConnexionDb {
    public Connection con;
    public Statement stat;
    
    public ConnexionDb() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(Const.URL, Const.USER, Const.PASSWD);
        stat = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
        );  
        
        //System.out.println("Connexion reussie");
    }
    
    public ResultSet executeQuery(String query) throws Exception{
        ResultSet res = null;
        res = stat.executeQuery(query);
        return res;
    }
    
    public int executeUpdtade(String query) throws Exception{
        int res = 0;
        res = stat.executeUpdate(query);
        return res;   
    }
    
    public void close() throws Exception{
        con.close();
        stat.close();
    }
}
