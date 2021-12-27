package com.magasin.GDProduits.AltClassesJUNK;
import com.magasin.GDProduits.Produits.Produit;

import java.util.Vector;
// Produits Vect
public class ProduitsVect {
    private Vector<Produit> Pro_=new Vector<>();
    public void Add_Produit(Produit P) {
        Pro_.add(P);
    }
    public void Remove_Produit(int Index) {
        Pro_.remove(Index);
    }
}
