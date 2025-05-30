/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.gestions;

import gestion_transport.swing.classes.Session;
import gestion_transport.swing.classes.Trajet;
import gestion_transport.swing.connexiondb.ConnexionDb;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Vanilah
 */
public class GestionTrajet {
    public ConnexionDb connexion;
    
    public GestionTrajet() throws Exception{
        connexion = new ConnexionDb();
    }
    
    public void insertTrajet(Trajet obj) throws Exception{
        
        String query = "INSERT INTO trajet(id_cooper, ville_dep, ville_arr, heure_dep, heure_arr, date_dep, prix_billet) VALUES('" + obj.getId_cooper()+ "', '" + obj.getVille_dep()+ "','" + obj.getVille_arr()+ "','" + obj.getHeure_dep()+ "','" + obj.getHeure_arr()+ "','" + obj.getDate_dep()+ "','" + obj.getPrix_billet()+ "')";
        connexion.executeUpdtade(query);
    }
    
    public void updateTrajet(int id_traj, Trajet obj) throws Exception{
        String query = "UPDATE trajet SET ville_dep='" + obj.getVille_dep()+ "', ville_arr='" + obj.getVille_arr()+ "', heure_dep='" + obj.getHeure_dep()+ "',heure_arr='" + obj.getHeure_arr()+ "', date_dep='" + obj.getDate_dep()+ "', prix_billet='" + obj.getPrix_billet()+ "' WHERE id_cooper='" + Session.idCoop + "' AND id_traj='"+id_traj+"'";
        connexion.executeUpdtade(query);
    }
    
    public void deleteTrajet(int id_traj ) throws Exception{
        String query = "DELETE FROM trajet WHERE id_cooper='" + Session.idCoop +"' AND id_traj='"+id_traj+"'";
        connexion.executeUpdtade(query);
    }
    
    public ResultSet getTrajet() throws Exception{
        String query = "SELECT id_traj, ville_arr FROM trajet WHERE id_cooper = '"+Session.idCoop+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public ResultSet selectAllTrajet() throws Exception {
        String query = "SELECT id_traj, ville_dep, ville_arr, heure_dep, heure_arr, date_dep, prix_billet FROM trajet WHERE id_cooper='" + Session.idCoop +"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countEnregTrajet() throws Exception {
        String query = "SELECT count(*) as nombre FROM trajet WHERE id_cooper='" + Session.idCoop +"'";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    public ResultSet getByVilleArr(String ville) throws Exception {
        String query = "SELECT id_traj, ville_dep, ville_arr, heure_dep, heure_arr, date_dep, prix_billet FROM trajet WHERE ville_arr LIKE '%"+ville+"%' AND id_cooper='" + Session.idCoop +"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
     
    //RESERVATION DES PASSAGERS
    public ResultSet selectAllForPassager() throws Exception{
        String query ="SELECT DISTINCT ville_arr FROM trajet";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public ResultSet getByVilleArrPassager(String ville, Date date) throws Exception {
        String query = "SELECT id_traj, heure_dep FROM trajet WHERE ville_arr LIKE '%"+ville+"%' AND date_dep='" + date +"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public ResultSet selectHeureForPassager() throws Exception{
        String query ="SELECT DISTINCT heure_dep FROM trajet";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countAllForPassager(String ville_arr, String date_dep) throws Exception{
        String query = "SELECT COUNT(*) as nombre FROM trajet WHERE ville_arr='"+ville_arr+"' AND date_dep='"+date_dep+"'";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    
    public ResultSet selectPrixBillet(int id_traj) throws Exception{
        String query = "SELECT prix_billet FROM trajet WHERE id_traj = '"+id_traj+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
}
