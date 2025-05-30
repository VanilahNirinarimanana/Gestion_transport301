/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_transport.swing.classes;

/**
 *
 * @author Vanilah
 */
public class Cooperative {
    private int id_coo;
    private String nom_coo;
    private String contact_coo;
    private String logo_coo;
    private String num_porte;

    public Cooperative() {
    }

    public Cooperative(int id_coo, String nom_coo, String contact_coo, String logo_coo, String num_porte) {
        this.id_coo = id_coo;
        this.nom_coo = nom_coo;
        this.contact_coo = contact_coo;
        this.logo_coo = logo_coo;
        this.num_porte = num_porte;
    }

    public Cooperative(String nom_coo, String contact_coo, String logo_coo, String num_porte) {
        this.nom_coo = nom_coo;
        this.contact_coo = contact_coo;
        this.logo_coo = logo_coo;
        this.num_porte = num_porte;
    }

    public int getId_coo() {
        return id_coo;
    }

    public void setId_coo(int id_coo) {
        this.id_coo = id_coo;
    }

    public String getContact_coo() {
        return contact_coo;
    }

    public void setContact_coo(String contact_coo) {
        this.contact_coo = contact_coo;
    }

    public String getLogo_coo() {
        return logo_coo;
    }

    public void setLogo_coo(String logo_coo) {
        this.logo_coo = logo_coo;
    }

    public String getNom_coo() {
        return nom_coo;
    }

    public void setNom_coo(String nom_coo) {
        this.nom_coo = nom_coo;
    }

    public String getNum_porte() {
        return num_porte;
    }

    public void setNum_porte(String num_porte) {
        this.num_porte = num_porte;
    }
    
    
}
