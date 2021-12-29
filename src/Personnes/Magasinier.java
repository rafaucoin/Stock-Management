package Personnes;
import com.magasin.GDProduits.Categorie;
import com.magasin.GDProduits.INITAndSelectionCatPro;
import com.magasin.GDProduits.Produits.*;
import java.util.Scanner;
public class Magasinier {
    INITAndSelectionCatPro obj;
   public Magasinier(INITAndSelectionCatPro obj) {
        this.obj = obj;
    }
    public void Ajoute_Produit() {
        int selection = obj.Select_Categorie();
        Categorie ob = obj.getCat(selection);
        ob.Add_Produit(LireProduit(selection));
    }
    private Produit LireProduit(int i) {
        Produit P=null;
        int in;
        Scanner scn = new Scanner(System.in);
        String str, Name, Ref, Des,ProduitType;
        System.out.println("Nom de Produit :");
        Name=scn.next();
        System.out.println("Référence de Produit :");
        Ref=scn.next();
        System.out.println("Description de Produit :");
        Des=scn.next();
        System.out.println("Prix de Produit :");
        double Price = scn.nextDouble();
        String cat = obj.getCat(i).getCat_Name().toLowerCase();
        // ill put here here
        switch (cat) {
            case "mobiles":
                ProduitType=scn.next(); // exception will be handled here ***
                switch (ProduitType.toLowerCase()) {
                    case "mobile":
                        P = new Mobile(ProduitType, Name, Ref, Des, Price);
                        break;
                }
                // scan Produit Type apres un autre switch case pour ajout des autres attribues

                break;
        case "electroniques":
            // switch
            ProduitType=scn.next();
            P=new Televiseurs("Télévision", Name, Ref, Des, Price);
            break;
        case "electroménager":
            ProduitType=scn.next();
            switch (ProduitType.toLowerCase()) {
                case "climatiseur":
                    P = new Climatiseurs(ProduitType, Name, Ref, Des, Price);
                    break;

            }
            break;
        case "informatiques":
            ProduitType=scn.next();
            P=new PcBureau(ProduitType, Name, Ref, Des, Price);
            break;
        case "kits solaires":
            ProduitType=scn.next();
            P=new ModulePhotovoltaique(ProduitType, Name, Ref, Des, Price);
            break;

    }
            return P;
        }
/*private void  Supression_Produit() {

} */
    }
