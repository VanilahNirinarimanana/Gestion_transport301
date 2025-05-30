/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.classes;

import java.util.Date;

/**
 *
 * @author Vanilah
 */
public class Reservation {
    private int id_reserv;
    private String nomcli;
    private String prenomcli;
    private String contact_cli;
    private int id_traj;
    private int nb_billet;
    private String statut_paim;
    private int montant;
    private String transaction_id;
    private String date_reserv;

    public Reservation() {
    }

    public Reservation(String nomcli, String prenomcli, String contact_cli, int id_traj, int nb_billet, String statut_paim, int montant, String transaction_id, String date_reserv) {
        this.nomcli = nomcli;
        this.prenomcli = prenomcli;
        this.contact_cli = contact_cli;
        this.id_traj = id_traj;
        this.nb_billet = nb_billet;
        this.statut_paim = statut_paim;
        this.montant = montant;
        this.transaction_id = transaction_id;
        this.date_reserv = date_reserv;
    }

    public Reservation(int id_reserv, String nomcli, String prenomcli, String contact_cli, int id_traj, int nb_billet, String statut_paim, int montant, String transaction_id, String date_reserv) {
        this.id_reserv = id_reserv;
        this.nomcli = nomcli;
        this.prenomcli = prenomcli;
        this.contact_cli = contact_cli;
        this.id_traj = id_traj;
        this.nb_billet = nb_billet;
        this.statut_paim = statut_paim;
        this.montant = montant;
        this.transaction_id = transaction_id;
        this.date_reserv = date_reserv;
    }
    
    

    public String getContact_cli() {
        return contact_cli;
    }

    public void setContact_cli(String contact_cli) {
        this.contact_cli = contact_cli;
    }

    public String getDate_reserv() {
        return date_reserv;
    }

    public void setDate_reserv(String date_reserv) {
        this.date_reserv = date_reserv;
    }

    public int getId_reserv() {
        return id_reserv;
    }

    public void setId_reserv(int id_reserv) {
        this.id_reserv = id_reserv;
    }

    public int getId_traj() {
        return id_traj;
    }

    public void setId_traj(int id_traj) {
        this.id_traj = id_traj;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getNb_billet() {
        return nb_billet;
    }

    public void setNb_billet(int nb_billet) {
        this.nb_billet = nb_billet;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getPrenomcli() {
        return prenomcli;
    }

    public void setPrenomcli(String prenomcli) {
        this.prenomcli = prenomcli;
    }

    public String getStatut_paim() {
        return statut_paim;
    }

    public void setStatut_paim(String statut_paim) {
        this.statut_paim = statut_paim;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }
    
    
}
