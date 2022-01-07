package Appli;
import Personnes.Magasinier;
import com.magasin.GDProduits.INITAndSelectionCatPro;
public class App {
    public static void main(String[] args) {
        INITAndSelectionCatPro o = new INITAndSelectionCatPro();
        Magasinier m = new Magasinier(o);
        do {
            System.out.println("Ajoute de Produit :");
            m.Ajoute_Produit();
            System.out.println("Rechercher Avec Référence :");
            m.Recherche_by_ref();
        } while (true);
    }
}
