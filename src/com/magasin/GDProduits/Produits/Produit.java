package com.magasin.GDProduits.Produits;
public class Produit {
    public String Name,Ref, Descriptive,Pro_Typ;// Ref=Référence
    public double Price;
    public Produit(String Pro_Typ,String Name,String Ref,String Descriptive,double Price) {
        this.Pro_Typ=Pro_Typ;
        this.Descriptive = Descriptive;
        this.Ref=Ref;
        this.Name=Name;
        this.Price=Price;
    }
}
