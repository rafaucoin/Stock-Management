package com.magasin.GDProduits.Personnes;
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
        int Selec=INIT.Select_Categorie();
        int Type=INIT.Selection_ProduitType(Selec);
        Produit P = INIT.LireProduitClient(Selec,Type);
        boolean v = false;
            for (Produit M : INIT.Cat.get(Selec).Produits) {
                if (M.Type.equalsIgnoreCase(P.Type) && M.equals(P)) {
                    M.Affiche_Produit();
                    v = true;
                }
            }
        if (v == false)
            System.out.println("Le Produit n'existe Pas");
    }

}
