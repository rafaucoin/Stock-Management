package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.ProduitEtNb;
import com.magasin.GDProduits.Produits.Produit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Client {
    public final String Nom, Prenom, Adresse;
    CompteFDL Compte = null;
    public Client(String nom, String prenom, String adresse) {
        Nom = nom;
        Prenom = prenom;
        Adresse = adresse;
    }
    public final ArrayList<ProduitEtNb> Reservation = new ArrayList<>();
    public Produit Recherche_Produit() {
        int Selec = INIT.Select_Categorie();
        int Typ = INIT.Selection_ProduitType(Selec);
        Produit P = INIT.LireProduitClient(Selec, Typ);
        boolean v = false;
        for (ProduitEtNb M : INIT.Cat.get(Selec).Produits) {
            if (M.Produit.Type.equalsIgnoreCase(P.Type) && M.Produit.equals(P) && M.getNombreProduit() != 0) {
                v = true;
                P = M.Produit;
            }
        }
        if (!v)
            System.out.println("Le Produit n'existe Pas");
        else
            System.out.println("Le Produit Existe");
        return P;
    }
    public void Reservation(Produit P) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (ProduitEtNb P : Reservation) {
                    int Select = 1;
                    while (Select < INIT.Cat.size()) {
                        if (P.Produit.Categorie.equalsIgnoreCase(INIT.Cat.get(Select).Nom_Cat))
                            break;
                    }
                    for (ProduitEtNb M : INIT.Cat.get(Select).Produits) {
                        if (M.Produit.equals(P.Produit))
                            M.incNbProduit(P.getNombreProduit());
                    }
                }
            }
        }, 1000 * 3600 * 48);
        int choix;
        do {
            System.out.println("1-Réservé ce Produit pour une durée de deux jours (2jrs)");
            System.out.println("0-Pour non");
            choix = INIT.LireInt("Entré Votre choix : ");
        } while (choix != 0 && choix != 1);
        if (choix == 1) {
            boolean v = false;
            for (ProduitEtNb M : Reservation) {
                if (P.equals(M.Produit)) {
                    M.incNbProduit(1);
                    v = true;
                }
            }
            if (!v) {
                Reservation.add(new ProduitEtNb(P, 1));
            }
        }
    }

    public void Connexion() {
        int choix;
        String Pass;
        Scanner Scn = new Scanner(System.in);
        do {
            System.out.println("1- Entrez Votre Mdp ");
            System.out.println("0- Exit");
            choix = INIT.LireInt("Votre Choix");
            if (choix == 1) {
                Pass = Scn.nextLine();
                if (Pass.equals(Compte.getPassword()))
                    Compte.Affiche_Points();
                else
                    System.out.println("Mot de Pass Invalide");
            }
        } while (choix != 0);
    }
}
