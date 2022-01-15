package com.magasin.GDProduits.Produits;

public class Congelateur extends Produit{
    private String energie;
    public Congelateur(String Cat,String name, String Ref, String type, String descriptive, String energie) {
        super(Cat, name, Ref, type, descriptive);
        this.energie = energie;
    }
    public Congelateur(String Categorie, String name, String type, String energie) {
        super(Categorie, name, type);
        this.energie = energie;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Congelateur)) return false;
        Congelateur that = (Congelateur) o;
        return that.energie.equalsIgnoreCase(energie) && that.Name.equalsIgnoreCase(Name);
    }
    @Override
    public void Affiche_Produit() {
        super.Affiche_Produit();
        System.out.println("Enèrgie : "+energie);
    }
}
