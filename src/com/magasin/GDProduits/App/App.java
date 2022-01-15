package com.magasin.GDProduits.App;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.Personnes.Client;
import com.magasin.GDProduits.Personnes.Agent;
import com.magasin.GDProduits.Personnes.Responsable;
public class App {
    public static void main(String[] args) {
        INIT i=new INIT();
        Client C=new Client("ok","ok","ok");
        Responsable R= new Responsable();
        Agent m= new Agent();
        do {
            System.out.println("Ajoute de Produit :");
            m.Ajoute_Produit();
            //if(!Responsable.NoPricesProducts.isEmpty())
               // R.setProPricesInQueue();
            //System.out.println("Rechercher Avec Référence :");
            //m.Recherche_Ref();
            //C.Recherche_Produit();
            R.Change_Prices();
        } while (true);
    }
}
