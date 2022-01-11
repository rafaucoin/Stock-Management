package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.Exceptions.InvalidProduitTypeException;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.Produits.Produit;
import java.util.ArrayList;
public class Client {
    public final ArrayList Reservation = new ArrayList();
    //public final String Nom, Prenom;
    public String Adresse;
    public Client() {

    }
    public void Recherche_Produit() {
        Produit P = INIT.LireProduit1();
        boolean v = false;
        for (int i = 1; i < INIT.Cat.size(); i++) {
            for (Produit M : INIT.Cat.get(i).Produits) {
                if (M.getClass() == P.getClass() && M.equals(P)) {
                    M.Affiche_Produit();
                    v = true;
                }
            }
        }
        if (v == false)
            System.out.println("Le Produit n'existe Pas");
    }

}
