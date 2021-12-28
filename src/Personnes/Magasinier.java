package Personnes;
import com.magasin.GDProduits.Categorie;
import com.magasin.GDProduits.INITAndSelectionCatPro;
import com.magasin.GDProduits.Produits.*;
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
            P=new Televiseurs();
            break;
        case "electroménager":
            P=new ModulePhotovoltaique();
            break;
        case "informatiques":
            P=new PcBureau();
            break;
        case "kits solaires":
            P=new ModulePhotovoltaique();
            break;

    }
    return P;
}
private void  Supression_Produit() {

}
}
