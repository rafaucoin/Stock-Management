package com.magasin.GDProduits.Produits;
public class Tablette extends Produit {
    private int Ram,Stockage,Batterie;
    private String Cpu;
    public Tablette(String Type, String Name, String Ref, String Descriptive, String Cpu, int Ram, int Stockage, int Quent, int Batterie) {
        super(Name,Ref,Type, Descriptive,Quent);
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.Stockage=Stockage;
        this.Batterie=Batterie;
    }
    public Tablette(String name, String type, int ram, int stockage, int batterie, String cpu) {
        super(name, type);
        Ram = ram;
        Stockage = stockage;
        Batterie = batterie;
        Cpu = cpu;
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
        Tablette phone = (Tablette) o;
        return Ram == phone.Ram && Stockage == phone.Stockage && Cpu.equalsIgnoreCase(phone.Cpu) && Name.equalsIgnoreCase(phone.Name);
    }
}