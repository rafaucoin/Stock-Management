package com.magasin.GDProduits;
import com.magasin.GDProduits.Exceptions.SelectionOutOfBondException;
import com.magasin.GDProduits.Produits.Produit;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
public class Categorie {
    public final String Nom_Cat;
    public final Map<Integer,String> TypePro = new HashMap<>();
    public final  Vector <Produit> Produits = new Vector<>();
    public Categorie(String Nom_Cat) {
        this.Nom_Cat=Nom_Cat;
    }
    public void Add_New_ProType(String Type) {
        TypePro.put(TypePro.size()+1,Type);
    }
    public void Add_Produit(Produit P) {
        Produits.add(P);
    }
}
