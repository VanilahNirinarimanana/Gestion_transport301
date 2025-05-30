/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.classes;

/**
 *
 * @author Vanilah
 */
public class Vehicule {
    private int id_veh;
    private int id_cooper;
    private int id_traj;
    private String immat;
    private int capacite;

    public Vehicule() {
    }

    public Vehicule(int id_cooper, int id_traj, String immat, int capacite) {
        this.id_cooper = id_cooper;
        this.id_traj = id_traj;
        this.immat = immat;
        this.capacite = capacite;
    }

    public Vehicule(int id_veh, String immat) {
        this.id_veh = id_veh;
        this.immat = immat;
    }

    @Override
    public String toString() {
        return immat;//"Vehicule{" + "immat=" + immat + '}';
    }
    
    
    
    public Vehicule(int id_veh, String immat, int id_traj, int capacite) {
        this.id_veh= id_veh;
        this.id_traj = id_traj;
        this.immat = immat;
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
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

    public int getId_veh() {
        return id_veh;
    }

    public void setId_veh(int id_veh) {
        this.id_veh = id_veh;
    }

    public String getImmat() {
        return immat;
    }

    public void setImmat(String immat) {
        this.immat = immat;
    }
    
    
}
