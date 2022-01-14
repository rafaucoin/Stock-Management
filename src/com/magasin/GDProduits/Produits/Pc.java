package com.magasin.GDProduits.Produits;
public class Pc extends Produit {
    private int Ram,Stockage, screen;
    private String Cpu;
    public Pc(String Cat,String Type, String Name, String Ref, String Descriptive, String Cpu, int Ram, int Stockage, int screen) {
        super(Cat, Name, Ref, Type, Descriptive);
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.Stockage=Stockage;
        this.screen = screen;
    }
    public Pc(String Cat,String name, String type, int ram, int stockage, int screen, String cpu) {
        super(Cat, name, type);
        Ram = ram;
        Stockage = stockage;
        this.screen = screen;
        Cpu = cpu;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pc)) return false;
        Pc pc = (Pc) o;
        return Ram == pc.Ram && Stockage == pc.Stockage && Cpu.equalsIgnoreCase(pc.Cpu) && Name.equalsIgnoreCase(pc.Name) && screen == pc.screen;
    }
    @Override
    public void Affiche_Produit() {
        super.Affiche_Produit();

    }
}