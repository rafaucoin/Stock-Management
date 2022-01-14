package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.Produits.Produit;
import java.util.ArrayList;
import java.util.Scanner;
public class Client {

    static ArrayList<CompteFDL> Compts = new ArrayList<>(); // ALL CLIENTS ACCOUNTS
    //Vector of searched products if there a many with same caract 0 Nbproducts s case not yet
    public final ArrayList<Produit> Reservation = new ArrayList();
    public Produit Recherche_Produit() { // ttbdel if kyn name
        int Selec=INIT.Select_Categorie();
        int Type=INIT.Selection_ProduitType(Selec);
        Produit P = INIT.LireProduitClient(Selec,Type);
        boolean v = false;
            for (Produit M : INIT.Cat.get(Selec).Produits) {
                if (M.Type.equalsIgnoreCase(P.Type) && M.equals(P) && M.getNbProduit()!=0) {
                    M.Affiche_Produit(); // ADD IT TO VECTOR IF FOUND IF THERE AREN'T NAME IN SEARCH CRIT
                    v = true; P=M;
                }
            }
        if (v == false)
            System.out.println("Le Produit n'existe Pas");
        else
            System.out.println("Le Produit Existe");
        return P;
    }
    public void Reservation(Produit P) {
        Scanner Scn=new Scanner(System.in);
        int choix;
        do {
            System.out.println("1-Réservé ce Produit pour une durée de deux jours (2jrs)");
            System.out.println("0-Pour non");
            choix=INIT.LireInt("Entré Votre choix : ");
        }while(choix!= 0 && choix!=1);
        if(choix==1) {
            //for(Produit M : Reservation) {
               //if(P.)
           // }
        }
    }
    public boolean  Connexion() {
    }
    public void Affichage_Pts() {

    }
}
