package com.magasin.GDProduits.Produits;
import java.util.Objects;
public class Batterie extends Produit {
    private String capacity;
    private String cells;
    public Batterie(String Cat,String name, String ref, String type, String descriptive, int NbProduit, String capacity, String cells) {
        super(Cat, name, ref, type, descriptive, NbProduit);
        this.capacity = capacity;
        this.cells = cells;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Batterie)) return false;
        Batterie batterie = (Batterie) o;
        return capacity.equalsIgnoreCase(batterie.capacity) && cells.equalsIgnoreCase(batterie.cells);
    }
}
