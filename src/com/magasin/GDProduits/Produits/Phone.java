package com.magasin.GDProduits.Produits;
public class Phone extends Produit {
    private int Ram,Stockage,Batterie;
    private String Cpu;
    public Phone(String Cat,String Type,String Name, String Ref, String Descriptive,String Cpu, int Ram, int Stockage,int Batterie) {
        super(Cat,Name, Ref, Type, Descriptive);
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.Stockage=Stockage;
        this.Batterie=Batterie;
    }
    public Phone(String Cat,String name, String type, int ram, int stockage, int batterie, String cpu) {
        super(Cat, name, type);
        Ram = ram;
        Stockage = stockage;
        Batterie = batterie;
        Cpu = cpu;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Ram == phone.Ram && Stockage == phone.Stockage && Cpu.equalsIgnoreCase(phone.Cpu) && Name.equalsIgnoreCase(phone.Name);
    }
    @Override
    public void Affiche_Produit() {
        super.Affiche_Produit();
        System.out.println("Cpu : "+Cpu);
        System.out.println("Ram (gb)  : "+Ram);
        System.out.println("Stockage (gb) : "+Stockage);
        System.out.println("Batterie (mAh) : "+Batterie);
    }
}