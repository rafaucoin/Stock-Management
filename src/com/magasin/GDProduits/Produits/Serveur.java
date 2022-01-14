package com.magasin.GDProduits.Produits;

public class Serveur extends Produit {
    private int Ram,Stockage;
    private String Cpu;
    public Serveur(String Categorie, String name, String type, int ram, int stockage, String cpu) {
        super(Categorie, name, type);
        Ram = ram;
        Stockage = stockage;
        Cpu = cpu;
    }
    public Serveur(String Cat,String Type, String Name, String Ref, String Descriptive, String Cpu, int Ram, int Stockage, int NbProduit) {
        super(Cat, Name, Ref, Type, Descriptive, NbProduit);
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
        if (!(o instanceof Serveur)) return false;
        Serveur serveur = (Serveur) o;
        return Ram == serveur.Ram && Stockage == serveur.Stockage && Cpu.equalsIgnoreCase(serveur.Cpu) && Name.equalsIgnoreCase(serveur.Name);
    }
    //ter
}
