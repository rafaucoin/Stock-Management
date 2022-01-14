package com.magasin.GDProduits.Produits;
public class Climatiseur extends Produit{
    private int capacite, sonore;
    public Climatiseur(String Cat,String name, String ref, String type, String descriptive, int capacite, int sonore) {
        super(Cat, name, ref, type, descriptive);
        this.capacite = capacite;
        this.sonore = sonore;
    }
    public Climatiseur(String Categorie, String name, String type, int capacite, int sonore) {
        super(Categorie, name, type);
        this.capacite = capacite;
        this.sonore = sonore;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Climatiseur)) return false;
        Climatiseur that = (Climatiseur) o;
        return capacite == that.capacite && sonore == that.sonore && that.Name.equalsIgnoreCase(Name);
    }
    @Override
    public void Affiche_Produit() {
        super.Affiche_Produit();

    }
}
