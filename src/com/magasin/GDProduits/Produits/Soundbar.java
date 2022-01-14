package com.magasin.GDProduits.Produits;

public class Soundbar extends Produit{
    private String sound;
    private String connectivity;
    public Soundbar(String Cat,String name, String ref, String type, String descriptive, String sound, String connectivity) {
        super(Cat,name, ref, type, descriptive);
        this.sound = sound;
        this.connectivity = connectivity;
    }
    public Soundbar(String Categorie, String name, String type, String sound, String connectivity) {
        super(Categorie, name, type);
        this.sound = sound;
        this.connectivity = connectivity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soundbar)) return false;
        Soundbar soundbar = (Soundbar) o;
        return sound.equalsIgnoreCase(soundbar.sound) && connectivity.equalsIgnoreCase(soundbar.connectivity) && Name.equalsIgnoreCase(soundbar.Name);
    }
    @Override
    public void Affiche_Produit() {
        super.Affiche_Produit();

    }
}
