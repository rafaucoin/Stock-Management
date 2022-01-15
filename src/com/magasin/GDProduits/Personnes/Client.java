package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.ProduitEtNb;
import com.magasin.GDProduits.Produits.Produit;
import java.util.ArrayList;
import java.util.Scanner;
public class Client {
    public final String Nom, Prenom,Adresse;
    CompteFDL Compte =null;
    //Array list of searched products if there a many with same caract 0 Nbproducts s case not yet
    public Client(String nom, String prenom, String adresse) {
        Nom = nom;
        Prenom = prenom;
        Adresse = adresse;
    }
    public final ArrayList<ProduitEtNb> Reservation = new ArrayList();
    public Produit Recherche_Produit() { // ttbdel if kyn name
        int Selec=INIT.Select_Categorie();
        int Typ=INIT.Selection_ProduitType(Selec);
        Produit P = INIT.LireProduitClient(Selec,Typ);
        boolean v = false;
            for (ProduitEtNb M : INIT.Cat.get(Selec).Produits) {
                if (M.Produit.Type.equalsIgnoreCase(P.Type) && M.equals(P) && M.getNombreProduit()!=0) {
                    ; // ADD IT TO VECTOR IF FOUND IF THERE AREN'T NAME IN SEARCH CRIT
                    v = true; P=M.Produit;
                }
            }
        if (v == false)
            System.out.println("Le Produit n'existe Pas");
        else
            System.out.println("Le Produit Existe");
        return P;
    }
    public void Reservation(Produit P) {
        Scanner Scn = new Scanner(System.in);
        int choix;
        do {
            System.out.println("1-Réservé ce Produit pour une durée de deux jours (2jrs)");
            System.out.println("0-Pour non");
            choix = INIT.LireInt("Entré Votre choix : ");
        } while (choix != 0 && choix != 1);
        if (choix == 1) {
            boolean v = false;
            for (ProduitEtNb M : Reservation) {
                if (P.equals(M)) {
                    M.incNbProduit(1);
                    v = true;
                }
            }
            if(v==false) {
              Reservation.add(new ProduitEtNb(P,1));
            }
        }
    }
    public void Connexion() {

    }
}
