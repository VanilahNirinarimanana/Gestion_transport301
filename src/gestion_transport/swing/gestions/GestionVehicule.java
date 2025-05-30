/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.gestions;

import gestion_transport.swing.classes.Session;
import gestion_transport.swing.classes.Vehicule;
import gestion_transport.swing.connexiondb.ConnexionDb;
import java.sql.ResultSet;

/**
 *
 * @author Vanilah
 */
public class GestionVehicule {
    public ConnexionDb connexion;
    
    public GestionVehicule() throws Exception{
        connexion = new ConnexionDb();
    }
    
    public void insertVehicule(Vehicule obj) throws Exception{        
        String query = "INSERT INTO vehicule(id_cooper, id_traj, immatriculation, capacite) VALUES('" + obj.getId_cooper()+ "', '" + obj.getId_traj()+ "','" + obj.getImmat()+ "','" + obj.getCapacite()+ "')";
        connexion.executeUpdtade(query);
    }
    
    public void updateVehicule(String id_veh, Vehicule obj) throws Exception{
        String query = "UPDATE vehicule SET id_traj='" + obj.getId_traj()+ "', immatriculation='" + obj.getImmat()+ "', capacite='" + obj.getCapacite()+ "' WHERE id_cooper='" + Session.idCoop + "' AND id_veh='"+id_veh+"'";
        connexion.executeUpdtade(query);
    }
    
    public void deleteVehicule(String id_veh) throws Exception{
        String query = "DELETE FROM vehicule WHERE id_cooper='" + Session.idCoop +"' AND id_veh='"+id_veh+"'";
        connexion.executeUpdtade(query);
    }
    
    public ResultSet selectAllVehicule() throws Exception {
        String query = "SELECT id_veh, id_traj, immatriculation, capacite FROM vehicule WHERE id_cooper='" + Session.idCoop +"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countEnregVehicule() throws Exception {
        String query = "SELECT count(*) as nombre FROM vehicule WHERE id_cooper='" + Session.idCoop +"'";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    public ResultSet getByImmat(String immat) throws Exception {
        String query = "SELECT id_veh, id_traj, immatriculation, capacite FROM vehicule WHERE immatriculation LIKE '%"+immat+"%' AND id_cooper='" + Session.idCoop +"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
        
    public ResultSet getIdImmat() throws Exception {
        String query = "SELECT id_veh, immatriculation FROM vehicule WHERE id_cooper='" + Session.idCoop +"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
}
