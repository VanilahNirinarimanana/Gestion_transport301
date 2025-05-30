/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.classes;

/**
 *
 * @author Vanilah
 */
public class Admin {
    private int id_admin;
    private String nom_admin;
    private String contact_admin;
    private String mdp_admin;
    private int id_cooper;

    public Admin() {
    }

    public Admin(String nom_admin, String contact_admin, String mdp_admin, int id_cooper) {
        this.nom_admin = nom_admin;
        this.contact_admin = contact_admin;
        this.mdp_admin = mdp_admin;
        this.id_cooper = id_cooper;
    }

    public Admin(String nom_admin, String contact_admin, String mdp_admin) {
        this.nom_admin = nom_admin;
        this.contact_admin = contact_admin;
        this.mdp_admin = mdp_admin;
    }

    public Admin(String nom_admin, String mdp_admin) {
        this.nom_admin = nom_admin;
        this.mdp_admin = mdp_admin;
    }
    
    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public int getId_cooper() {
        return id_cooper;
    }

    public void setId_cooper(int id_cooper) {
        this.id_cooper = id_cooper;
    }

    public String getMdp_admin() {
        return mdp_admin;
    }

    public void setMdp_admin(String mdp_admin) {
        this.mdp_admin = mdp_admin;
    }

    public String getNom_admin() {
        return nom_admin;
    }

    public void setNom_admin(String nom_admin) {
        this.nom_admin = nom_admin;
    }

    public String getContact_admin() {
        return contact_admin;
    }

    public void setContact_admin(String contact_admin) {
        this.contact_admin = contact_admin;
    }
    
    
}
