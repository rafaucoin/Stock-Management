package com.magasin.GDProduits.Produits;
public class Onduleurs extends Produit{
    private int nbprises;
    private int capacite;
    public Onduleurs(String Cat,String name, String ref, String type, String descriptive,int nbprises, int capacite) {
        super(Cat, name, ref, type, descriptive);
        this.nbprises = nbprises;
        this.capacite = capacite;
    }
    public Onduleurs(String Categorie, String name, String type, int nbprises, int capacite) {
        super(Categorie, name, type);
        this.nbprises = nbprises;
        this.capacite = capacite;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Onduleurs)) return false;
        Onduleurs onduleurs = (Onduleurs) o;
        return nbprises == this.nbprises && capacite == this.capacite;
    }
    @Override
    public void Affiche_Produit() {
        super.Affiche_Produit();

    }
}
