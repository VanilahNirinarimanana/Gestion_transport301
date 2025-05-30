/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.classes;

/**
 *
 * @author Vanilah
 */
public class Siege {
    private int id_siege;
    private int id_veh;
    private String num_siege;
    private String etat_siege;

    public Siege() {
    }

    public Siege(int id_veh, String num_siege, String etat_siege) {
        this.id_veh = id_veh;
        this.num_siege = num_siege;
        this.etat_siege = etat_siege;
    }

    public Siege(int id_siege, String etat_siege) {
        this.id_siege = id_siege;
        this.etat_siege = etat_siege;
    }

    public Siege(int id_siege, int id_veh, String num_siege, String etat_siege) {
        this.id_siege = id_siege;
        this.id_veh = id_veh;
        this.num_siege = num_siege;
        this.etat_siege = etat_siege;
    }
    
    

    public String getEtat_siege() {
        return etat_siege;
    }

    public void setEtat_siege(String etat_siege) {
        this.etat_siege = etat_siege;
    }

    public int getId_siege() {
        return id_siege;
    }

    public void setId_siege(int id_siege) {
        this.id_siege = id_siege;
    }

    public int getId_veh() {
        return id_veh;
    }

    public void setId_veh(int id_veh) {
        this.id_veh = id_veh;
    }

    public String getNum_siege() {
        return num_siege;
    }

    public void setNum_siege(String num_siege) {
        this.num_siege = num_siege;
    }
    
    
}
