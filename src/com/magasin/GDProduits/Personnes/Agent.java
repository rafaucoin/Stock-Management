package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.Produits.Produit;
import java.util.Scanner;
public class Agent {
    public Produit Recherche_Ref() {
        Scanner scn=new Scanner(System.in);
        String Ref=scn.next();
        for (int i = 1; i < INIT.Cat.size(); i++) {
            for (Produit M : INIT.Cat.get(i).Produits) {
                if(M.Ref.equalsIgnoreCase(Ref) && M.getNbProduit()!=0)
                    return M;
            }
        }
        return null;
    }
    public void Ajoute_Produit() {
        boolean found=false;
        int Selec=INIT.Select_Categorie();
        int Type=INIT.Selection_ProduitType(Selec);
        boolean v= true;
        Produit P = INIT.LireProduitPrMagasinier(Selec,Type);
        for(Produit M : INIT.Cat.get(Selec).Produits) {
           if(P.equals(M))
               M.IncNbProduit(P.getNbProduit()); found=true; break;
        }
        if(!found)
            INIT.Cat.get(Selec).Produits.add(P);

    }
    public void Action_Achat(Client c) {
        Produit P=Recherche_Ref();
        if(c.)
        switch (P.Categorie) {
            case "Mobiles":
            case "Informatiques" :

                break;
            case "Electromenager":
            case "Electroniques":

                break;
            case "Kits solaires" :

                break;
        }
        P.DecNbProduit();
    }
    public void Action_Retour(int Nombre) {
        Produit P=Recherche_Ref();
        switch (P.Categorie) {
            case "Mobiles":
            case "Informatiques" :

                break;
            case "Electromenager":
            case "Electroniques":

                break;
            case "Kits solaires" :

                break;
        }
        P.IncNbProduit(Nombre);
    }
}
