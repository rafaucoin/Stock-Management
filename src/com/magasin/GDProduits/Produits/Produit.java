package com.magasin.GDProduits.Produits;
public abstract class Produit {
    public final String Name,Ref;// Ref=Référence
    public  String Descriptive;
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
    public abstract  void Affiche_Produit();

    /*public boolean Equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit)) return false;

        Produit produit = (Produit) o;

        if (!Name.equals(produit.Name)) return false;
        return Ref.equals(produit.Ref);
    } */
}