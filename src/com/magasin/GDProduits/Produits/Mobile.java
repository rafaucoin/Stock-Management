package com.magasin.GDProduits.Produits;
public class Mobile extends Produit {
    //caract
    private int Ram,Stockage,Cam_Ar,Cam_Av;
    private String Cpu,Gpu;
    public Mobile(String Pro_Typ, String Name, String Ref, String Descriptive, double Price) {
        super(Pro_Typ, Name, Ref, Descriptive, Price);
    }
}