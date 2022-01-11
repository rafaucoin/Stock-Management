package com.magasin.GDProduits.Produits;
public class Serveur extends Produit{
    private int Ram,Stockage;
    private String Cpu;
    public Serveur(String Type, String Name, String Ref, String Descriptive, String Cpu, int Ram, int Stockage, int Quent) {
        super(Name,Ref,Type, Descriptive,Quent);
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.Stockage=Stockage;
    }
    public Serveur(String name, String type, int ram, int stockage, String cpu) {
        super(name, type);
        Ram = ram;
        Stockage = stockage;
        Cpu = cpu;
    }
    public void Affiche_Produit() {
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serveur)) return false;
        Serveur serveur = (Serveur) o;
        return Ram == serveur.Ram && Stockage == serveur.Stockage && Cpu.equalsIgnoreCase(serveur.Cpu) && Name.equalsIgnoreCase(serveur.Name);
    }
}
