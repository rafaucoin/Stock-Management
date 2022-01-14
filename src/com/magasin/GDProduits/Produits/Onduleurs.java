package com.magasin.GDProduits.Produits;
public class Onduleurs extends Produit{
    private int nbprises;
    private int capacite;

    public Onduleurs(String Cat,String name, String ref, String type, String descriptive, int NbProduit, int nbprises, int capacite) {
        super(Cat, name, ref, type, descriptive, NbProduit);
        this.nbprises = nbprises;
        this.capacite = capacite;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Onduleurs)) return false;
        Onduleurs onduleurs = (Onduleurs) o;
        return nbprises == onduleurs.nbprises && capacite == onduleurs.capacite;
    }
}
