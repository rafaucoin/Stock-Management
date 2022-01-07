package com.magasin.GDProduits.Produits;
public  class Produit {
    public final String Name,Ref,Descriptive;// Ref=Référence
    private int nbProduit=0;
    private double Price;
    public Produit(String Name,String Ref,String Descriptive) {
        this.Descriptive = Descriptive;
        this.Ref=Ref;
        this.Name=Name;
    }
    public void IncNb() {
        nbProduit++;
    }
    public void DecNb() {
        if(nbProduit!=0)
        nbProduit--;
        // exception ********
    }
    public  void Affiche_Produit(){
        System.out.println("Name :"+Name);
        System.out.println("Référence :"+Ref);
        System.out.println("Description :"+Descriptive);
    }
}