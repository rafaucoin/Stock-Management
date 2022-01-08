package Personnes;
import com.magasin.GDProduits.Categorie;
import com.magasin.GDProduits.INITAndSelectionCatPro;
import com.magasin.GDProduits.IndexCouple;
import com.magasin.GDProduits.Produits.*;
import java.util.Scanner;
public class Magasinier {
    INITAndSelectionCatPro o;

    // private final Map<Integer,Produit> FileDeProduits= new HashMap<>();
    public Magasinier(INITAndSelectionCatPro o) {
        this.o = o;
    }

    public void Ajoute_Produit() {
        IndexCouple I;
        I = o.Selection();
        Produit P = INITAndSelectionCatPro.LireProduit(I.S, I.C);
        int Tr = INITAndSelectionCatPro.Cat.get(I.C).Produits_Type.get(I.S).RechercheProduit(P);
        if (Tr != -1) {
            System.out.println("Trouvé");
            INITAndSelectionCatPro.Cat.get(I.C).Produits_Type.get(I.S).ReturnProduit(Tr).IncNb();
        } else
            INITAndSelectionCatPro.Cat.get(I.C).Produits_Type.get(I.S).Add_Produit(P);
    } // interface Possibility with client

    //private void  Supression_Produit() {
    public void Recherche_by_ref() {
        //IndexCouple I;
        Boolean Trouve = false;
        Scanner scn = new Scanner(System.in);
        String s;
        //I=o.Selection();
        System.out.print("Référence :");
        s = scn.next();
        //System.out.println(INITAndSelectionCatPro.Cat.get(I.C).Produits_Type.get(I.S).RechercheRef(s));
        int i = 1, j;
        while (i < INITAndSelectionCatPro.Cat.size() && Trouve==false) {
             j=1;
             while(j<INITAndSelectionCatPro.Cat.get(i).sizeVect() && Trouve==false) {
                 Trouve=INITAndSelectionCatPro.Cat.get(i).Produits_Type.get(j).RechercheRef(s);
                 j++;
             }
             i++;
        }
        System.out.println(Trouve);
    }
}
