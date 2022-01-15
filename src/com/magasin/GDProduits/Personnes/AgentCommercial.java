package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.Exceptions.NombreNegativeException;
import com.magasin.GDProduits.Exceptions.NombreProduitsNeagtiveException;
import com.magasin.GDProduits.Exceptions.SelectionOutOfBondException;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.ProduitEtNb;
import java.util.Random;
import java.util.Scanner;
public class AgentCommercial {
    public ProduitEtNb Recherche_Ref() {
        boolean v=false;
        ProduitEtNb Re=null;
        Scanner scn = new Scanner(System.in);
        System.out.println(" Entrer La Référence du Produit : ");
        String Ref =scn.next();
        for (int i = 1; i < INIT.Cat.size(); i++) {
            for (ProduitEtNb M : INIT.Cat.get(i).Produits) {
                if (M.Produit.Ref.equalsIgnoreCase(Ref) && M.getNombreProduit() != 0)
                    Re=M; v=true;
            }
        }
        if(v==true)
            System.out.println("Le Produit Existe ");
        else
        System.out.println("Le Produit Existe pas  ");
        return Re;
    }
    public void Ajoute_Produit() {
        boolean found = false;
        int Selec = INIT.Select_Categorie();
        int Type = INIT.Selection_ProduitType(Selec);
        boolean v = true;
        ProduitEtNb P = INIT.LireProduitPrMagasinier(Selec, Type);
        for (ProduitEtNb M : INIT.Cat.get(Selec).Produits) {
            if (P.Produit.equals(M.Produit)) {
                M.incNbProduit(P.getNombreProduit());
                found = true;
            }
            break;
        }
        if (!found)
            INIT.Cat.get(Selec).Produits.add(P);
            ResponsableCommercial.NoPricesProducts.add(P.Produit);
            System.out.println("Produit Ajouté avec Succes !!");
    }
    public void Action_Achat(Client c) {
        int choix,choix1,Quant=0;
        String pass;
        boolean v;
        double PrixP=0,Totalprix=0;
        Scanner scn=new Scanner(System.in);
        if (c.Compte == null) {
            System.out.println("Client a pas un compte ( creation d un compte )  ");
            System.out.printf("%s,Donne votre Mot de passe : ", c.Nom);
            pass = scn.nextLine();
            Creation_Account(c, pass);
        }
        do {
            ProduitEtNb P = null;
            System.out.println("1-Valider les achats ");
            System.out.println("0-Exit");
            choix1 = INIT.LireInt("Votre Choix :");
            if(choix1!=0)
            P = Recherche_Ref();
            if (P != null) {
                do {
                    v = true;
                    Quant = INIT.LireInt("Entrez la Quant de Produit : ");
                    try {
                        if (Quant < 0)
                            throw new NombreProduitsNeagtiveException("il faut un Nombre Positif");
                        if(Quant > P.getNombreProduit())
                            throw new SelectionOutOfBondException("Quantité et sup a nombre de Produit dans le stock ");
                    } catch (NombreProduitsNeagtiveException e) {
                        System.out.println(e.getMessage());
                        v = false;
                    }
                     catch (SelectionOutOfBondException e) {
                        System.out.println(e.getMessage());
                    }
                } while (!v);
                PrixP += P.Produit.getPrice() * Quant;
                P.DecNbbyN(Quant);
                if (c.Compte.Return_PointCat(P.Produit.Categorie) != 0) {
                    do {
                        System.out.println("1-Bénéficiez d'une reduction (Utilisation des Points)");
                        System.out.println("0-Non Achat avec un Prix par Default");
                        choix = INIT.LireInt("Votre Choix : ");
                    } while (choix != 1 && choix != 0);
                    if (choix == 0) {
                        c.Compte.Increment_Points(PrixP, P.Produit.Categorie);
                        Totalprix += PrixP;
                    }
                    if (choix == 1)
                        Totalprix += c.Compte.Reduction(P.Produit.Categorie, PrixP);
                }
                else {
                    c.Compte.Increment_Points(PrixP, P.Produit.Categorie);
                    Totalprix += PrixP;
                }
            }
        }  while (choix1 != 0);
        System.out.println("Total A Payez : "+Totalprix);
    }
    public void Action_Retour(Client c) {
        ProduitEtNb P = Recherche_Ref();
        c.Compte.Decrement_Points(P.Produit.getPrice(), P.Produit.Categorie);
        P.incNbProduit(1);
    }
    public void Creation_Account(Client c,String pass) {
        if (c.Compte != null) {
            System.out.println("Compte Existe Déja");
        } else {
            c.Compte = new CompteFDL(pass);
            System.out.println("Mot de Pass : " + c.Compte.getPassword());
        }
    }
    public void Changement_Pass(Client c) {
        Scanner scn=new Scanner(System.in);
        if (c.Compte == null)
            System.out.println("il a pas un compte");
        else {
            String pass;
            do {
                System.out.printf("%s,Donne votre Mot de passe ( au moins 8 caractères )  : ", c.Nom);
                pass = scn.nextLine();
            }while(pass.length()<8);
            c.Compte.setPassword(pass);
            System.out.println("Le nouveau Mot de Pass est : " + c.Compte.getPassword());
        }
    }
}