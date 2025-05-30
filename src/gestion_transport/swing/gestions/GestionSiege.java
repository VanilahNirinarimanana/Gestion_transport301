/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.gestions;

import gestion_transport.swing.classes.Session;
import gestion_transport.swing.classes.Siege;
import gestion_transport.swing.classes.ReservationTemp;
import gestion_transport.swing.connexiondb.ConnexionDb;
import java.sql.ResultSet;
import java.util.Date;
import java.util.stream.Collectors;

/**
 *
 * @author Vanilah
 */
public class GestionSiege {
    public ConnexionDb connexion;
    
    public GestionSiege() throws Exception{
        connexion = new ConnexionDb();
    }
    
    public void insertSiege(Siege obj) throws Exception{
        String query = "INSERT INTO siege(id_veh, num_siege, etat_siege) VALUES('" + obj.getId_veh()+ "', '" + obj.getNum_siege()+ "','" + obj.getEtat_siege()+ "')";
        connexion.executeUpdtade(query);
    }
    
    public void updateSiege(String id_siege, Siege obj) throws Exception{
        String query = "UPDATE siege SET id_veh='" + obj.getId_veh()+ "', num_siege='" + obj.getNum_siege()+ "', etat_siege='" + obj.getEtat_siege()+ "' WHERE id_siege='"+id_siege+"'";
        connexion.executeUpdtade(query);
    }
    
    public void deleteSiege(String id_siege) throws Exception{
        String query = "DELETE FROM siege WHERE id_siege='"+id_siege+"'";
        connexion.executeUpdtade(query);
    }
    
    public ResultSet selectAllSiege() throws Exception {
        String query = "SELECT s.id_siege, s.id_veh, s.num_siege, s.etat_siege FROM siege s JOIN vehicule v ON s.id_veh= v.id_veh WHERE v.id_cooper='"+Session.idCoop+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public ResultSet selectAllSiegeByIdVeh(int id_veh) throws Exception {
        String query = "SELECT s.id_siege, s.id_veh, s.num_siege, s.etat_siege FROM siege s JOIN vehicule v ON s.id_veh= v.id_veh WHERE v.id_veh='"+id_veh+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countEnregToutSiege() throws Exception {
        String query = "SELECT count(*) as nombre FROM siege s JOIN vehicule v ON s.id_veh= v.id_veh WHERE v.id_cooper='"+Session.idCoop+"'";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    
    public ResultSet selectByImmat(String immat) throws Exception{
        String query = "SELECT s.id_siege, s.id_veh, s.num_siege, s.etat_siege FROM siege s JOIN vehicule v ON s.id_veh= v.id_veh WHERE v.immatriculation='"+immat+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }

    
    public int countEnregSiege(int id_veh) throws Exception {
        String query = "SELECT count(*) as nombre FROM siege WHERE id_veh ='"+id_veh+"'";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    
    public int countMaxInsert(int id_veh) throws Exception{
        String query = "SELECT capacite as siegeMax FROM vehicule WHERE id_veh ='"+id_veh+"'";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int siegeMax = rs.getInt("siegeMax");
        return siegeMax;
    }
    
    public ResultSet getByEtat(String etat) throws Exception {
        String query = "SELECT s.id_siege, s.id_veh, s.num_siege, s.etat_siege FROM siege s JOIN vehicule v ON s.id_veh= v.id_veh WHERE s.etat_siege LIKE '%"+etat+"%'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public ResultSet selectAllSiegeDispo(int id_veh) throws Exception {
        String query = "SELECT * FROM siege WHERE id_veh='"+id_veh+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    } 
    
    //RESERVATION PASSAGER
    public ResultSet selectSiege(String ville_arr, Date date_dep, int id_cooper) throws Exception{
        String query="SELECT s.id_siege, s.num_siege FROM siege s JOIN vehicule v ON s.id_veh = v.id_veh JOIN trajet t ON t.id_traj = v.id_traj WHERE t.ville_arr = '"+ville_arr+"' AND t.date_dep = '"+date_dep+"' AND t.id_cooper = '"+id_cooper+"' AND s.etat_siege = 'disponible'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    /*public void updateEtatSiege(int id_traj, int num_siege) throws Exception{
        String numeros = ReservationTemp.placesChoisies.stream().map(String::valueOf).collect(Collectors.joining(","));
        String sql = "UPDATE siege SET etat_siege = 'réservé' " +
                     "WHERE id_traj = " + temp.idTrajet +
                     " AND numero_siege IN (" + numeros + ");";
    }*/
}
