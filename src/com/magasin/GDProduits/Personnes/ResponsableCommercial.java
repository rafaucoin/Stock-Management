package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.Exceptions.NombreNegativeException;
import com.magasin.GDProduits.Exceptions.SelectionOutOfBondException;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.ProduitEtNb;
import com.magasin.GDProduits.Produits.Produit;
import java.util.*;
public class ResponsableCommercial{
    public  static  Queue<Produit> NoPricesProducts = new LinkedList<>();
    Map<Integer,Produit> PrixChangePro = new HashMap<>();
    public void Change_Prices() {
        Scanner scn=new Scanner(System.in);
        boolean v,run;
        double price = 0;
        Integer i =1,choix,S=0;
        int Select=INIT.Select_Categorie();
        int Typ=INIT.Selection_ProduitType(Select);
        for(ProduitEtNb P: INIT.Cat.get(Select).Produits) {
        if(P.Produit.Type.equalsIgnoreCase(INIT.Cat.get(Select).TypePro.get(Typ))) {
            PrixChangePro.put(i,P.Produit); i++;
        }
        }
        run=true;
        do {
            System.out.println("1-Change Les Prix ");
            System.out.println("0 - Exit ");
            choix=INIT.LireInt("Entrez ton choix : ");
            switch (choix) {
                case 1:
                    do {
                        PrixChangePro.forEach((key, Pr) -> System.out.println((key + "-" + Pr.Name)));
                        v = true;
                        try {
                            S = scn.nextInt();
                            if (S < 1 || S > PrixChangePro.size())
                                throw new SelectionOutOfBondException("Erreur tu as entrée une selection Invalid ");
                        } catch (SelectionOutOfBondException e) {
                            System.out.println(e.getMessage());
                            v = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Erreur il faut entrer un Numero");
                            v = false;
                            scn.next();
                        }

                    } while (!v);

                    PrixChangePro.get(S).Affiche_Produit();
                    do {
                        v = true;
                        try {
                            price = INIT.LireDouble("Donnez le Prix de ce Produit : ");
                            if (price < 0)
                                throw new NombreNegativeException();
                        } catch (NombreNegativeException e) {
                            System.out.println(e.getMessage());
                            v = false;
                        }
                        PrixChangePro.get(S).setPrice(price);
                    } while (!v);
                    break;
                case 0:
                    run = false; break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
            }while (run);
        }
    public void setProPricesInQueue() {
        double price = 0;
        boolean v;
        Scanner scn = new Scanner(System.in);
        while (!NoPricesProducts.isEmpty()) {
            NoPricesProducts.peek().Affiche_Produit();
            do {
                v = true;
                try {
                    price = INIT.LireDouble("Donnez le Prix de ce Produit : ");
                    if (price < 0)
                        throw new NombreNegativeException();
                } catch (NombreNegativeException e) {
                    System.out.println(e.getMessage());
                    v = false;
                }
            } while (!v);
            NoPricesProducts.peek().setPrice(price);
            NoPricesProducts.remove();
        }
    }
}
