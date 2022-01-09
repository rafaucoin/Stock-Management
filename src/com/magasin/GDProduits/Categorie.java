package com.magasin.GDProduits;
import com.magasin.GDProduits.Produits.Produit;
import java.util.Vector;
public class Categorie {
    public final String Nom_Cat;
    public final Vector<String> TypePro = new Vector<>();
    public final  Vector <Produit> Produits = new Vector<>();
    public Categorie(String Nom_Cat) {
        this.Nom_Cat=Nom_Cat;
    }
    public void Add_New_ProType(String Type) {
        TypePro.add(Type);
    }

}
