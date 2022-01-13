package com.magasin.GDProduits.Produits;
public abstract class Produit implements Affichage {
    public final String Name,Ref; // Ref=Référence
    public final String Type;
    public String Descriptive;
    private int NbProduit=0;
    private double price;
    public Produit(String name, String ref, String type, String descriptive,int NbProduit) {
        Name = name;
        Ref = ref;
        Type = type;
        Descriptive = descriptive;
        this.NbProduit=NbProduit;
    }
    public Produit(String name, String type) {
        Name = name;
        Type = type;
        Ref=" ";
    }
    public  void Affiche_Produit() {
        System.out.println("Name :" + Name);
        System.out.println("Référence :" + Ref);
        System.out.println("Description :" + Descriptive);
        System.out.println("Quantité :"+NbProduit);
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
    public abstract void finalize();
}
