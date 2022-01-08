package Appli;
import Personnes.Magasinier;
import java.lang.Thread;

import java.util.InputMismatchException;

import com.magasin.GDProduits.INITAndSelectionCatPro;
public class App {
    public static void main(String[] args) throws InterruptedException {
        INITAndSelectionCatPro o=new INITAndSelectionCatPro();
        Magasinier m = new Magasinier(o);
        do {
            System.out.println("Ajoute de Produit :");
                m.Ajoute_Produit();
            Thread.sleep(2000);
            System.out.println("Rechercher Avec Référence :");
            m.Recherche_by_ref();
        } while (true);
    }
}
