package com.magasin.GDProduits;
import java.util.HashMap;
import java.util.Map;
// Struct Alternative
public class Categorie {
    private final String Cat_Name;
    private static int index=1;
    private final Map<Integer,ProduitTypeVect> Produits_Type = new HashMap<>(); // size of Vector is the current Products number
    public Categorie(String Cat_Name) {
        this.Cat_Name=Cat_Name;
    }
    public String getCat_Name() {
        return Cat_Name;
    }
    public void Add_NewProduitType(String Name) {
    Produits_Type.put(index,new ProduitTypeVect(Name));
    index++;
    }
    public void Remove_Produit(int ProTypeIndex,int ProIndex) {
        Produits_Type.get(ProTypeIndex).Remove_Produit(ProIndex);
    }
    public void afficher_ProduitsType() {
        Produits_Type.forEach((key, Type) -> System.out.println((key+"-"+Type.Pro_Type)));
    }
    public int sizeVect() {
        return Produits_Type.size();
    }
}
