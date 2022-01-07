package Personnes;
import com.magasin.GDProduits.INITAndSelectionCatPro;
import com.magasin.GDProduits.IndexCouple;
import com.magasin.GDProduits.Produits.*;
import java.util.Scanner;
public class Magasinier {
    // private final Map<Integer,Produit> FileDeProduits= new HashMap<>();
    public void Ajoute_Produit() {
        IndexCouple I;
        I=INITAndSelectionCatPro.Selection();
       Produit P = INITAndSelectionCatPro.LireProduit(I.S,I.C);
       int Tr= INITAndSelectionCatPro.Cat.get(I.C).Produits_Type.get(I.S).RechercheProduit(P);
       if(Tr!= -1) {
           System.out.println("Trouvé");
           INITAndSelectionCatPro.Cat.get(I.C).Produits_Type.get(I.S).ReturnProduit(Tr).IncNb();
       }
       else
           INITAndSelectionCatPro.Cat.get(I.C).Produits_Type.get(I.S).Add_Produit(P);
    } // interface Possibility with client
        //private void  Supression_Produit() {
    public void  Recherche_by_ref() {
        IndexCouple I;
        Scanner scn = new Scanner(System.in);
        String s;
        I=INITAndSelectionCatPro.Selection();
        System.out.print("Référence :");
        s=scn.next();
        System.out.println(INITAndSelectionCatPro.Cat.get(I.C).Produits_Type.get(I.S).RechercheRef(s));
    }

    }
