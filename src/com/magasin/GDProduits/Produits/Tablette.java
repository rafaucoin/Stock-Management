package com.magasin.GDProduits.Produits;
public class Tablette extends Produit {
    private int Ram,Stockage;
    private String Cpu;
    public Tablette(String Type, String Name, String Ref, String Descriptive, String Cpu, int Ram, int Stockage, int NbProduit) {
        super(Name,Ref,Type, Descriptive,NbProduit);
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.Stockage=Stockage;
    }

    @Override
    public void Affiche_Produit() {
    }

    @Override
    public void finalize() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tablette)) return false;
        Tablette tablette = (Tablette) o;
        return Ram == tablette.Ram && Stockage == tablette.Stockage && Cpu.equalsIgnoreCase(tablette.Cpu) && Name.equalsIgnoreCase(tablette.Name) && Ref.equalsIgnoreCase(tablette.Ref);
    }
}