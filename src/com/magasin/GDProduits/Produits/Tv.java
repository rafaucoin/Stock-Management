package com.magasin.GDProduits.Produits;

public class Tv extends Produit {
    private int screen;
    private int quality;

    public Tv(String name, String ref, String type, String descriptive, int NbProduit, int screen, int quality) {
        super(name, ref, type, descriptive, NbProduit);
        this.screen = screen;
        this.quality = quality;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soundbar)) return false;
        Tv tv = (Tv) o;
        return screen == tv.screen && quality == tv.quality;
    }
    //ter
}
