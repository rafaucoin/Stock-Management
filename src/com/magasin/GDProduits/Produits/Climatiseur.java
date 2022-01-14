package com.magasin.GDProduits.Produits;
public class Climatiseur extends Produit{
    private int capacite, sonore;
    public Climatiseur(String Cat,String name, String ref, String type, String descriptive, int NbProduit, int capacite, int sonore) {
        super(Cat, name, ref, type, descriptive, NbProduit);
        this.capacite = capacite;
        this.sonore = sonore;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Climatiseur)) return false;
        Climatiseur that = (Climatiseur) o;
        return capacite == that.capacite && sonore == that.sonore;
    }
    //ter
}
