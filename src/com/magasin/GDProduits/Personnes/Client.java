package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.Produits.Produit;
import java.util.ArrayList;
import java.util.Scanner;
public class Client {
    public final ArrayList Reservation = new ArrayList();
    public Produit Recherche_Produit() {
        int Selec=INIT.Select_Categorie();
        int Type=INIT.Selection_ProduitType(Selec);
        Produit P = INIT.LireProduitClient(Selec,Type);
        boolean v = false;
            for (Produit M : INIT.Cat.get(Selec).Produits) {
                if (M.Type.equalsIgnoreCase(P.Type) && M.equals(P)) {
                    M.Affiche_Produit();
                    v = true; P=M;
                }
            }
        if (v == false)
            System.out.println("Le Produit n'existe Pas");
        else
            System.out.println("Le Produit Existe");
        return P;
    }
    public void Reservation() {
        Produit P=this.Recherche_Produit();
        Scanner Scn=new Scanner(System.in);
        int choix;
        do {
            System.out.println("1-Réservé ce Produit pour une durée de deux jours (2jrs)");
            System.out.println("0-Pour non");
            choix=INIT.LireInt("Entré Votre choix : ");
        }while(choix!= 0 && choix!=1);
        if(choix==1) {
            Reservation.add(P);
            P.
        }
    }
}
