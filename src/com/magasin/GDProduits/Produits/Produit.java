package com.magasin.GDProduits.Produits;
public class Produit {
    public final String Name,Ref; // Ref=Référence
    public final int Type;
    public String Descriptive;
    private int NbProduit=0;
    private double price;
    public Produit(String name, String ref, int type, String descriptive,int NbProduit) {
        Name = name;
        Ref = ref;
        Type = type;
        Descriptive = descriptive;
        this.NbProduit=NbProduit;
    }
    public  void Affiche_Produit() {
        // quantiti tanik hna wa9il
        System.out.println("Name :" + Name);
        System.out.println("Référence :" + Ref);
        System.out.println("Description :" + Descriptive);
    }
    public void IncNbProduit(int nbProduit) {
        NbProduit += nbProduit;
    }
    public int getNbProduit() {
        return NbProduit;
    }
    public void DecNb() {
        if (NbProduit != 0)
            NbProduit--;

    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
