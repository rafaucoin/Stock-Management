package com.magasin.GDProduits;
import com.magasin.GDProduits.Produits.Produit;
import java.util.Vector;
// Produits Vect
public class ProduitTypeVect {
    public final String Pro_Type;
    public  final Vector<Produit> Pro_=new Vector<>();
    public ProduitTypeVect(String name) {
        Pro_Type=name;
    }
    public void Add_Produit(Produit P) {
        Pro_.add(P);
    }
    public void Remove_Produit(int Index) {
        Pro_.remove(Index);
    }
    public boolean RechercheRef(String Ref) {
        for(Produit P : Pro_) {
            if (P.Ref.equalsIgnoreCase(Ref))
                    return true;
        }
        return false;
    }
}
