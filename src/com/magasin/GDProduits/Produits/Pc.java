package com.magasin.GDProduits.Produits;
public class Pc extends Produit {
    private int Ram,Stockage, screen;
    private String Cpu;
    public Pc(String Type, String Name, String Ref, String Descriptive, String Cpu, int Ram, int Stockage, int NbProduit, int screen) {
        super(Name,Ref,Type, Descriptive,NbProduit);
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.Stockage=Stockage;
        this.screen = screen;
    }
    @Override
    public void Affiche_Produit() {
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pc)) return false;
        Pc pc = (Pc) o;
        return Ram == pc.Ram && Stockage == pc.Stockage && Cpu.equalsIgnoreCase(pc.Cpu) && Name.equalsIgnoreCase(pc.Name) && Ref.equalsIgnoreCase(pc.Ref) && screen == pc.screen;
    }
}