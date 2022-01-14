package com.magasin.GDProduits.Produits;
public class Tv extends Produit{
    private int screenSize;
    private String quality;
    public Tv(String Cat,String Type, String Name, String Ref, String Descriptive, String quality, int screenSize) {
        super(Cat, Name, Ref, Type, Descriptive);
        this.quality = quality;
        this.screenSize = screenSize;
    }
    public Tv(String Cat,String name, String type, int screenSize, String quality) {
        super(Cat, name, type);
        this.screenSize = screenSize;
        this.quality = quality;
    }
    @Override
    public void Affiche_Produit() {
        super.Affiche_Produit();

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tv)) return false;
        Tv tv = (Tv) o;
        return screenSize == tv.screenSize && quality.equalsIgnoreCase(tv.quality) && Name.equalsIgnoreCase(tv.Name);
    }

}