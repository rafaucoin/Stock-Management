package com.magasin.GDProduits.Produits;
public class Produit {
    public final String Name,Ref,Pro_Typ;// Ref=Référence
    public  String Descriptive;
    private int nbProduit=0;
    private double Price;
    public Produit(String Pro_Typ,String Name,String Ref,String Descriptive,double Price) {
        this.Pro_Typ=Pro_Typ;
        this.Descriptive = Descriptive;
        this.Ref=Ref;
        this.Name=Name;
        this.Price=Price;
    }
    public void IncNb() {
        nbProduit++;
    }
    public void DecNb() {
        if(nbProduit!=0)
        nbProduit--;
        // exception ********
    }
}
