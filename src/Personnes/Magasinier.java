package Personnes;
import com.magasin.GDProduits.Categorie;
import com.magasin.GDProduits.INITAndSelectionCatPro;
import com.magasin.GDProduits.Produits.Mobile;
import com.magasin.GDProduits.Produits.Produit;
public class Magasinier {
INITAndSelectionCatPro obj;
Magasinier(INITAndSelectionCatPro obj) {
    this.obj=obj;
}
private void Ajoute_Produit() {
 int selection =obj.Select_Categorie();
    Categorie ob=obj.getCat(selection);
    ob.Add_Produit(LireProduit(selection));

}
private  Produit LireProduit(int i) {
    Produit P;
    String cat=obj.getCat(i).getCat_Name().toLowerCase();
    switch(cat) {
        case "mobiles" :
            P=new Mobile(/*args*/);
            break;
        case "electroniques":

            break;
        case "electroménager":

            break;
        case "informatiques":

            break;
        case "kits solaires":

            break;

    }
    return P;
}
private void  Supression_Produit() {

}
}
