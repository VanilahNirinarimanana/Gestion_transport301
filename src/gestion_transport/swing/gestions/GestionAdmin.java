/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.gestions;

import gestion_transport.swing.classes.Admin;
import gestion_transport.swing.classes.Cooperative;
import gestion_transport.swing.classes.Session;
import gestion_transport.swing.connexiondb.ConnexionDb;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanilah
 */
public class GestionAdmin {
    public ConnexionDb connexion;
    
    public GestionAdmin() throws Exception{
        connexion = new ConnexionDb();
    }
    
    public void insertAdmin(Admin obj) throws Exception{
        //GestionCooperative gc = new GestionCooperative();
        //int idCoop = gc.insertCoop(coop);
        String query = "INSERT INTO admin(nom_admin, contact_admin, mdp_admin, id_cooper) VALUES('" + obj.getNom_admin()+ "', '" + obj.getContact_admin()+ "','" + obj.getMdp_admin()+ "','" + obj.getId_cooper() + "')";
        connexion.executeUpdtade(query);
    }
    
    public ResultSet verifAdmin(Admin obj) throws Exception{
        String query = "SELECT * FROM admin a JOIN cooperative c ON a.id_cooper = c.id_cooper WHERE a.nom_admin = '"+ obj.getNom_admin()+"' AND a.mdp_admin = '"+obj.getMdp_admin()+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public void updateAdmin(String id_admin, Admin obj) throws Exception{
        String query = "UPDATE admin SET nom_admin='" + obj.getNom_admin()+ "', contact_admin='" + obj.getContact_admin()+ "', mdp_admin='" + obj.getMdp_admin()+ "' WHERE id_admin='" + id_admin + "',";
        connexion.executeUpdtade(query);
    }
    
    public void deleteAdmin(String id_admin ) throws Exception{
        String query = "DELETE FROM admin WHERE id_admin='" + id_admin +"'";
        connexion.executeUpdtade(query);
    }
    
    public ResultSet selectAllAdmin() throws Exception {
        String query = "SELECT id_admin, nom_admin, contact_admin, id_cooper FROM admin";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countEnregAdmin() throws Exception {
        String query = "SELECT count(*) as nombre FROM admin";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
}
