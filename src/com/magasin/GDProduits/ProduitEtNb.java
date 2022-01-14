package com.magasin.GDProduits;
import com.magasin.GDProduits.Produits.*;
import com.magasin.GDProduits.Exceptions.NombreProduitsNeagtiveException;
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
        boolean v;
        Produit=P;
        NombreProduit=Nombre;
        do {
            v=true;
            try {
                if (NombreProduit < 0)
                    throw new NombreProduitsNeagtiveException();
            }
            catch (NombreProduitsNeagtiveException e) {
                System.out.println(e.getMessage());
                v=false;
            }
        NombreProduit=INIT.LireInt("Quantité : ");
        }while(!v);
    }
    public void incNbProduit(int nombreProduit) {
        this.NombreProduit += nombreProduit;
    }
    public void DecNbby1() {
        this.NombreProduit--;
    }
}