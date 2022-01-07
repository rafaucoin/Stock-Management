package com.magasin.GDProduits.Produits;
public class Phone extends Produit {
    //caract
    private int Ram,Stockage;
    private String Cpu;
    public Phone(String Name, String Ref, String Descriptive,String Cpu, int Ram, int Stockage) {
        super(Name, Ref, Descriptive);
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.Stockage=Stockage;
    }
    @Override
    public void Affiche_Produit() {
    }

}