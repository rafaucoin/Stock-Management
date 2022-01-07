package Personnes;
import com.magasin.GDProduits.INITAndSelectionCatPro;
import com.magasin.GDProduits.Produits.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Magasinier {
    INITAndSelectionCatPro obj;
    private final Map<Integer,Produit> FileDeProduits= new HashMap<>();
    public Magasinier(INITAndSelectionCatPro obj) {
        this.obj = obj;
    }
    public void Ajoute_Produit() {
       int selection = obj.Select_Categorie();
       int TypeSel = obj.Select_ProduitType(selection);
       (obj.Cat.get(selection)).Produits_Type.get(TypeSel).Add_Produit(obj.LireProduit(TypeSel,selection));
    } // interface Possibility with client
        //private void  Supression_Produit() {
    public void  Recherche_by_ref() {
        Scanner scn = new Scanner(System.in);
        String s;
        int selc=obj.Select_Categorie();
        int type=obj.Select_ProduitType(selc);
        System.out.print("Référence :");
        s=scn.next();
        System.out.print(obj.Cat.get(selc).Produits_Type.get(type).RechercheRef(s));
    }
    }
