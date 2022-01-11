package com.magasin.GDProduits.App;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.Personnes.Magasinier;
public class App {
    public static void main(String[] args) {
        INIT i=new INIT();
        Magasinier m= new Magasinier();
        do {
            System.out.println("Ajoute de Produit :");
            m.Ajoute_Produit();
            System.out.println("Rechercher Avec Référence :");
            m.Recherche_Ref();
        } while (true);
    }
}
