package com.magasin.GDProduits.Produits;

import java.util.Objects;

public class Batterie extends Produit {
    private int capacity;
    private String cells;

    public Batterie(String name, String ref, String type, String descriptive, int NbProduit, int capacity, String cells) {
        super(name, ref, type, descriptive, NbProduit);
        this.capacity = capacity;
        this.cells = cells;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Batterie)) return false;
        Batterie batterie = (Batterie) o;
        return capacity == batterie.capacity && Objects.equals(cells, batterie.cells);
    }

}//ter
