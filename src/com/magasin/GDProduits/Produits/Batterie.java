package com.magasin.GDProduits.Produits;
public class Batterie extends Produit {
    private String capacity;
    private String cells;
    public Batterie(String Cat,String name, String ref, String type, String descriptive,String capacity, String cells) {
        super(Cat, name, ref, type, descriptive);
        this.capacity = capacity;
        this.cells = cells;
    }
    public Batterie(String Categorie, String name, String type, String capacity, String cells) {
        super(Categorie, name, type);
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
    @Override
    public void Affiche_Produit() {
        super.Affiche_Produit();

    }
}
