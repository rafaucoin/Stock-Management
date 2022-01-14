package com.magasin.GDProduits;
import com.magasin.GDProduits.Produits.*;
public class ProduitEtNb {
    public Produit Produit;
    public int getNombreProduit() {
        return NombreProduit;
    }
    public void setNombreProduit(int nombreProduit) {
        NombreProduit = nombreProduit;
    }
    private int NombreProduit=0;
    public ProduitEtNb(Produit P,int Nombre) {
        Produit=P;
        NombreProduit=Nombre;
    }
    public void incNbProduit(int nombreProduit) {
        this.NombreProduit += nombreProduit;
    }
    public void DecNbby1() {
        this.NombreProduit--;
    }
}
