package com.magasin.Produits;
public class Produit {
    public String Name,Ref, Descriptive;// Ref=Référence
    public double Price;
    public Produit(String Name,String Ref,String Descriptive,double Price) {
        this.Descriptive = Descriptive;
        this.Ref=Ref;
        this.Name=Name;
        this.Price=Price;
    }
}
