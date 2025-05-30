/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.gestions;

import gestion_transport.swing.classes.Session;
import gestion_transport.swing.connexiondb.ConnexionDb;
import java.sql.ResultSet;

/**
 *
 * @author Vanilah
 */
public class GestionAccueil {
    public ConnexionDb connexion;
    
    public GestionAccueil() throws Exception{
         connexion = new ConnexionDb();
    }
    
    public ResultSet selectTrajet() throws Exception{
        String sql = "SELECT t.id_traj, t.ville_dep, t.ville_arr, v.immatriculation FROM trajet t JOIN vehicule v ON t.id_traj = v.id_traj WHERE t.id_cooper = " + Session.idCoop;
        ResultSet rs = connexion.executeQuery(sql);
        return rs;
    }
    
    public ResultSet selectAlerte() throws Exception{
        String sql =  "SELECT ville_dep, ville_arr, heure_dep FROM trajet WHERE id_cooper ='" +Session.idCoop +"'AND TIMESTAMPDIFF(MINUTE,NOW(), TIMESTAMP(date_dep, heure_dep)) BETWEEN 0 AND 60";
        ResultSet rs = connexion.executeQuery(sql);
        return rs;
    }
}
