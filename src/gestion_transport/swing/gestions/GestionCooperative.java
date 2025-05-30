/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.gestions;

import gestion_transport.swing.classes.Cooperative;
import gestion_transport.swing.connexiondb.ConnexionDb;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Vanilah
 */
public class GestionCooperative {
    public ConnexionDb connexion;
    
    public GestionCooperative() throws Exception{
        connexion = new ConnexionDb();
    }
    
    public int insertCoop(Cooperative obj) throws Exception{
        
        String query = "INSERT INTO cooperative(nom_coo, contact_coo, logo_coo, num_porte) VALUES('" + obj.getNom_coo()+ "', '" + obj.getContact_coo()+ "','" + obj.getLogo_coo()+ "','" + obj.getNum_porte()+ "')";
        connexion.executeUpdtade(query);
        String getIdQuery = "SELECT MAX(id_cooper) AS id_coo FROM cooperative";
        ResultSet rs = connexion.executeQuery(getIdQuery);
        if(rs.next()){
            return rs.getInt("id_coo");
        }
        
        return -1;
    }
    
    public void updateCoop(String id_coo, Cooperative obj) throws Exception{
        String query = "UPDATE cooperative SET nom_coo='" + obj.getNom_coo()+ "', contact_coo='" + obj.getContact_coo()+ "', logo_coo='" + obj.getLogo_coo()+ "', num_porte='" + obj.getNum_porte()+ "' WHERE id_cooper='" + id_coo + "',";
        connexion.executeUpdtade(query);
    }
    
    public void deleteCoop(String id_coo ) throws Exception{
        String query = "DELETE FROM cooperative WHERE id_cooper='" + id_coo +"'";
        connexion.executeUpdtade(query);
    }
    
    public ResultSet selectAllCoop() throws Exception {
        String query = "SELECT * FROM cooperative";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countEnregCoop() throws Exception {
        String query = "SELECT count(*) as nombre FROM cooperative";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    
    //RESERVATION PASSAGER
    public ResultSet getCooperative(String ville_arr, Date date) throws Exception{
        String query="SELECT DISTINCT c.id_cooper, c.nom_coo FROM cooperative c JOIN trajet t ON c.id_cooper = t.id_cooper WHERE t.ville_arr = '"+ville_arr+"' AND t.date_dep = '"+date+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
}
