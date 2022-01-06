package Personnes;
import com.magasin.GDProduits.INITAndSelectionCatPro;
import com.magasin.GDProduits.Produits.*;
import java.util.HashMap;
import java.util.Map;
public class Magasinier {
    INITAndSelectionCatPro obj;
    private final Map<Integer,Produit> FileDeProduits= new HashMap<>();
    public Magasinier(INITAndSelectionCatPro obj) {
        this.obj = obj;
    }
    public void Ajoute_Produit() {
       int selection = obj.Select_Categorie();
       int TypeSel = obj.Select_ProduitType();








    } // interface Possibility with client
        //private void  Supression_Produit() {
   /* private Produit Recherche_Produit(String Ref) {

    }*/
    }
