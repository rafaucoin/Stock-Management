package com.magasin.GDProduits.Produits;
public class Tablette extends Produit {
    private int Ram,Stockage;
    private String Cpu;
    public Tablette(String Type, String Name, String Ref, String Descriptive, String Cpu, int Ram, int Stockage, int Quent) {
        super(Name,Ref,Type, Descriptive,Quent);
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.Stockage=Stockage;
    }

    @Override
    public void Affiche_Produit() {
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tablette)) return false;
        Tablette phone = (Tablette) o;
        return Ram == phone.Ram && Stockage == phone.Stockage && Cpu.equalsIgnoreCase(phone.Cpu) && Name.equalsIgnoreCase(phone.Name) && Ref.equalsIgnoreCase(phone.Ref);
    }
}