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
    public Serveur(String Cat,String Type, String Name, String Ref, String Descriptive, String Cpu, int Ram, int Stockage) {
        super(Cat, Name, Ref, Type, Descriptive);
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.Stockage=Stockage;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serveur)) return false;
        Serveur serveur = (Serveur) o;
        return Ram == serveur.Ram && Stockage == serveur.Stockage && Cpu.equalsIgnoreCase(serveur.Cpu) && Name.equalsIgnoreCase(serveur.Name);
    }
    @Override
    public void Affiche_Produit() {
        super.Affiche_Produit();
        System.out.println("Cpu : "+Cpu);
        System.out.println("Ram (gb)  : "+Ram);
        System.out.println("Stockage  : "+Stockage);
    }
}
