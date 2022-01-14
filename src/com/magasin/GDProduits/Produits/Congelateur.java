package com.magasin.GDProduits.Produits;
import java.util.Objects;
public class Congelateur extends Produit{
    private String energie;
    public Congelateur(String Cat,String name, String ref, String type, String descriptive, int NbProduit, String energie) {
        super(Cat, name, ref, type, descriptive, NbProduit);
        this.energie = energie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Congelateur)) return false;
        Congelateur that = (Congelateur) o;
        return that.energie.equalsIgnoreCase(energie);
    }
}
