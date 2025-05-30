/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.gestions;

import gestion_transport.swing.classes.Reservation;
import gestion_transport.swing.classes.ReservationTemp;
import gestion_transport.swing.classes.Session;
import gestion_transport.swing.connexiondb.ConnexionDb;
import java.sql.ResultSet;

/**
 *
 * @author Vanilah
 */
public class GestionReservation {
    public ConnexionDb connexion;
    
    public GestionReservation() throws Exception{
        connexion = new ConnexionDb();
    }
    
    public void insertReservation(Reservation obj) throws Exception{
        String query = "INSERT INTO reservation(nomcli, prenomcli, contact_cli, id_traj, nb_billet, statut_paiement, montant_paye, transaction_id, date_reservation) VALUES('"+ obj.getNomcli() +"', '"+ obj.getPrenomcli()+"', '"+ obj.getContact_cli()+"', '"+ obj.getId_traj()+"', '"+ obj.getNb_billet()+"', '"+ obj.getStatut_paim()+"', '"+ obj.getMontant()+"', '"+ obj.getTransaction_id()+"', '"+ obj.getDate_reserv()+"')";
        connexion.executeUpdtade(query);
    }
    
    public void updateReservation(String id_reserv, Reservation obj) throws Exception{
        String query = "UPDATE reservation SET nomcli='"+ obj.getNomcli() +"', prenomcli='"+ obj.getPrenomcli()+"', contact_cli='"+ obj.getContact_cli()+"', id_traj='"+ obj.getId_traj()+"', nb_billet='"+ obj.getNb_billet()+"', statut_paiement='"+ obj.getStatut_paim()+"', montant_paye='"+ obj.getMontant()+"', transaction_id='"+ obj.getTransaction_id()+"', date_reservation='"+ obj.getDate_reserv()+"'";
        connexion.executeUpdtade(query);
    }
    
    public void deleteReservation(String id_reserv) throws Exception{
        String query = "DELETE FROM reservation WHERE id_reserv='"+id_reserv+"'";
        connexion.executeUpdtade(query);
    }
    
    public ResultSet selectAllByDate() throws Exception{
        String query = "SELECT * FROM reservation r JOIN trajet t ON r.id_traj=t.id_traj WHERE t.id_cooper = '"+Session.idCoop+"' ORDER BY r.date_reservation DESC";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public ResultSet getByNomCli(String nomRech) throws Exception{
        String query ="SELECT * FROM reservation r JOIN trajet t ON r.id_traj=t.id_traj WHERE t.id_cooper = '"+Session.idCoop+"' AND r.nomcli='"+nomRech+"' ORDER BY date_reservation ASC";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public ResultSet getJourTrajet(int id_traj) throws Exception{
        String query = "SELECT DATE(date_reservation) as jour , COUNT(*) as total FROM reservation WHERE id_traj = '"+id_traj+"' GROUP BY jour ORDER BY jour ASC";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public int countReservation() throws Exception{
        String query = "SELECT count(*) as nombre FROM reservation r JOIN trajet t ON r.id_traj=t.id_traj WHERE t.id_cooper = '"+Session.idCoop+"'";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    
    //RESERVATION PASSAGER
    public void insertReservationPassager(ReservationTemp obj) throws Exception{
        String query = "INSERT INTO reservation(nomcli, prenomcli, contact_cli, id_traj, nb_billet, statut_paiement, montant_paye, transaction_id, date_reservation) VALUES('"+ obj.nomClient +"', '"+ obj.prenomClient+"', '"+ obj.contactClient+"', '"+ obj.idTrajet+"', '"+ obj.nb_billet+"', '"+ obj.statut_p+"', '"+ obj.montantPaye+"', '"+ obj.transactionId+"', NOW())";
        connexion.executeUpdtade(query);
    }
}
