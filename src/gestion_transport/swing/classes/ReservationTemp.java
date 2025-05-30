/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.classes;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Vanilah
 */
public class ReservationTemp {
    public int idTrajet;
    public int idCoop;
    public String villeDepart="Fianarantsoa";
    public String villeArrivee;
    public LocalDate dateDepart;
    public String heureDepart;
    public String cooperative;
    public List<Integer> placesChoisies = new ArrayList<>();//Stocke le numero du siege
    public int nb_billet;
    public String nomClient;
    public String prenomClient;
    public String contactClient;
    public double montantPaye;
    public String transactionId;
    public String statut_p;

    public ReservationTemp(int idTrajet, int nb_billet, String nomClient, String prenomClient, String contactClient, double montantPaye, String transactionId, String statut_p) {
        this.idTrajet = idTrajet;
        this.nb_billet = nb_billet;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.contactClient = contactClient;
        this.montantPaye = montantPaye;
        this.transactionId = transactionId;
        this.statut_p = statut_p;
    }

    public ReservationTemp() {
    }
    
    

    
}
