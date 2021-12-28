package Personnes;
import com.magasin.GDProduits.Categorie;
import com.magasin.GDProduits.INITAndSelectionCatPro;
import com.magasin.GDProduits.Produits.Produit;

import java.util.Locale;

public class Magasinier {
INITAndSelectionCatPro obj;
Magasinier(INITAndSelectionCatPro obj) {
    this.obj=obj;
}
private void Ajoute_Produit() {
 int selection =obj.Select_Categorie();
    Categorie ob=obj.getCat(selection);
    ob.Add_Produit(LireProduit(selection));

}
private Produit LireProduit(int i) {
    Produit P;
    String cat;
    switch(cat.toLowerCase())
}
}
