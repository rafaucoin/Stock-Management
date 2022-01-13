package com.magasin.GDProduits.Produits;

import java.util.Objects;

public class Soundbar extends Produit{
    private String sound;
    private String connectivity;

    public Soundbar(String name, String ref, String type, String descriptive, int NbProduit, String sound, String connectivity) {
        super(name, ref, type, descriptive, NbProduit);
        this.sound = sound;
        this.connectivity = connectivity;
    }
    //ter
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soundbar)) return false;
        Soundbar soundbar = (Soundbar) o;
        return Objects.equals(sound, soundbar.sound) && Objects.equals(connectivity, soundbar.connectivity);
    }

}
