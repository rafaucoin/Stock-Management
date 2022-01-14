package com.magasin.GDProduits;
import com.magasin.GDProduits.Produits.Produit;
import java.util.*;
public class Categorie {
    public final String Nom_Cat;
    public final Map<Integer,String> TypePro = new HashMap<>();
    public final List<Produit> Produits = new LinkedList<>();
    public Categorie(String Nom_Cat) {
        this.Nom_Cat=Nom_Cat;
    }
    public void Add_New_ProType(String Type) {
        TypePro.put(TypePro.size()+1,Type);
    }
}
