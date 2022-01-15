package com.magasin.GDProduits.Produits;
public  class Produit implements Affichage {
    public final String Name,Ref; // Ref=Référence
    public final String Type,Categorie;
    public String Descriptive;
    public double getPrice() {
        return price;
    }
    private double price;
    public Produit(String Categorie, String name, String ref, String type, String descriptive) {
        this.Categorie=Categorie;
        Name = name;
        Ref = ref;
        Type = type;
        Descriptive = descriptive;
    }
    public Produit(String Categorie, String name, String type) {
        this.Categorie=Categorie;
        Name = name;
        Type = type;
        Ref=" ";
    }
    public void Affiche_Produit() {
        System.out.println("Name :" + Name);
        System.out.println("Référence :" + Ref);
        System.out.println("Description :" + Descriptive);
        System.out.println("Prix :" + price);
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
