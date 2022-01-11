package com.magasin.GDProduits.Produits;
public class Phone extends Produit {
    private int Ram,Stockage;
    private String Cpu;
    public Phone(String Type,String Name, String Ref, String Descriptive,String Cpu, int Ram, int Stockage, int Quent) {
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
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Ram == phone.Ram && Stockage == phone.Stockage && Cpu.equalsIgnoreCase(phone.Cpu) && Name.equalsIgnoreCase(phone.Name) && Ref.equalsIgnoreCase(phone.Ref);
    }
}