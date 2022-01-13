package com.magasin.GDProduits.Produits;

public class Tv extends Produit{
    private int screenSize;
    private String quality;
    public Tv(String Type, String Name, String Ref, String Descriptive, String quality,int Quent, int screenSize) {
        super(Name, Ref, Type, Descriptive,Quent);
        this.quality = quality;
        this.screenSize = screenSize;
    }
    public Tv(String name, String type, int screenSize, String quality) {
        super(name, type);
        this.screenSize = screenSize;
        this.quality = quality;
    }
    public void Affiche_Produit() {
    }
    @Override
    public void finalize() {

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tv)) return false;
        Tv tv = (Tv) o;
        return screenSize == tv.screenSize && quality.equalsIgnoreCase(tv.quality) && Name.equalsIgnoreCase(tv.Name);
    }

}