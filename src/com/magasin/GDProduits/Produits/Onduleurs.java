package com.magasin.GDProduits.Produits;

import java.util.Objects;

public class Onduleurs extends Produit{
    private int nbprises;
    private int capacite;

    public Onduleurs(String name, String ref, String type, String descriptive, int NbProduit, int nbprises, int capacite) {
        super(name, ref, type, descriptive, NbProduit);
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

}
