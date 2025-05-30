/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.classes;

import java.time.LocalTime;

/**
 *
 * @author Vanilah
 */
public class Trajet {
    private int id_traj;
    private int id_cooper;
    private String ville_dep;
    private String ville_arr;
    private LocalTime heure_dep;
    private LocalTime heure_arr;
    private String date_dep;
    private int prix_billet;

    public Trajet() {
    }

    public Trajet(int id_traj, String ville_arr) {
        this.id_traj = id_traj;
        this.ville_arr = ville_arr;
    }

    @Override
    public String toString() {
        return ville_arr;
    }

    
    public Trajet(String ville_dep, String ville_arr, LocalTime heure_dep, LocalTime heure_arr, String date_dep, int prix_billet) {
        this.ville_dep = ville_dep;
        this.ville_arr = ville_arr;
        this.heure_dep = heure_dep;
        this.heure_arr = heure_arr;
        this.date_dep = date_dep;
        this.prix_billet = prix_billet;
    }
    
    public Trajet(String ville_dep,int id_traj, String ville_arr, LocalTime heure_dep, LocalTime heure_arr, String date_dep,int prix_billet){
        this.id_traj = id_traj;
        this.ville_dep = ville_dep;
        this.ville_arr = ville_arr;
        this.heure_dep = heure_dep;
        this.heure_arr = heure_arr;
        this.date_dep = date_dep;
        this.prix_billet = prix_billet;
    }

    public Trajet(int id_cooper, String ville_dep, String ville_arr, LocalTime heure_dep, LocalTime heure_arr, String date_dep, int prix_billet) {
        this.id_cooper = id_cooper;
        this.ville_dep = ville_dep;
        this.ville_arr = ville_arr;
        this.heure_dep = heure_dep;
        this.heure_arr = heure_arr;
        this.date_dep = date_dep;
        this.prix_billet = prix_billet;
    }
    
    

    public String getDate_dep() {
        return date_dep;
    }

    public void setDate_dep(String date_dep) {
        this.date_dep = date_dep;
    }

    public LocalTime getHeure_arr() {
        return heure_arr;
    }

    public void setHeure_arr(LocalTime heure_arr) {
        this.heure_arr = heure_arr;
    }

    public LocalTime getHeure_dep() {
        return heure_dep;
    }

    public void setHeure_dep(LocalTime heure_dep) {
        this.heure_dep = heure_dep;
    }

    public int getId_cooper() {
        return id_cooper;
    }

    public void setId_cooper(int id_cooper) {
        this.id_cooper = id_cooper;
    }

    public int getId_traj() {
        return id_traj;
    }

    public void setId_traj(int id_traj) {
        this.id_traj = id_traj;
    }

    public int getPrix_billet() {
        return prix_billet;
    }

    public void setPrix_billet(int prix_billet) {
        this.prix_billet = prix_billet;
    }

    public String getVille_arr() {
        return ville_arr;
    }

    public void setVille_arr(String ville_arr) {
        this.ville_arr = ville_arr;
    }

    public String getVille_dep() {
        return ville_dep;
    }

    public void setVille_dep(String ville_dep) {
        this.ville_dep = ville_dep;
    }
    
    
}
