package Appli;
import Personnes.Magasinier;
import com.magasin.GDProduits.INITAndSelectionCatPro;
public class App {
    public static void main(String[] args) {
        INITAndSelectionCatPro o=new INITAndSelectionCatPro();
        Magasinier m=new Magasinier(o);
        //System.out.println(o.Select_Categorie());
        m.Ajoute_Produit();
    }
}
