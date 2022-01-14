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
        boolean v=true;
        Produit=P;
        NombreProduit=Nombre;
        do {
            if(!v)
                NombreProduit=INIT.LireInt("Quantité : ");
            v=true;
            try {
                if (NombreProduit < 0)
                    throw new NombreProduitsNeagtiveException("il faut un Nombre Positif");
            }
            catch (NombreProduitsNeagtiveException e) {
                System.out.println(e.getMessage());
                v=false;
            }
        }while(!v);
    }
    public void incNbProduit(int nombreProduit) {
        this.NombreProduit += nombreProduit;
    }
    public void DecNbby1() {
        this.NombreProduit--;
    }
}