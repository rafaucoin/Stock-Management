package com.magasin.GDProduits;
import com.magasin.GDProduits.Produits.Produit;
import java.util.Vector;
// Struct Alternative
public class Categorie {
    private final String Cat_Name;
    private Vector<String> Produits_Name = new Vector<>(3); // used to search if an exception ill be lifted after
   // private int nbProduitsName=1;
    private Vector<Produit> ProduitsVec = new Vector<>(); // size of Vector is the current Products number
    public Categorie(String Cat_Name) {
        this.Cat_Name=Cat_Name;
    }
    public String getCat_Name() {
        return Cat_Name;
    }
    public void add_NewProduitName(String Name) {
        Produits_Name.add(Name);
    }
    public void Add_Produit(Produit P) {
        ProduitsVec.add(P);
    }
    public void Remove_Produit(int Index) {
        Produits_Name.remove(Index);
    }
    public Vector<Produit> Recherche_Type_Return_Vector(String Pro_Typ) {
        Vector<Produit> Results= new Vector<Produit>();
        int i;
        if(Pro_Typ!=null) {
            for(i=0 ; i< ProduitsVec.size(); i++) {
                if(Pro_Typ.equalsIgnoreCase(ProduitsVec.get(i).Pro_Typ))
                    Results.add(ProduitsVec.get(i));
            }
        }
        return  Results;
    }
}
