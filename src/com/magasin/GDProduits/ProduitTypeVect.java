package com.magasin.GDProduits;
import com.magasin.GDProduits.Produits.Produit;
import java.util.Vector;
// Produits Vect
public class ProduitTypeVect {
    public final String Pro_Type;
    private final Vector<Produit> Pro_=new Vector<>();
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
    public int  RechercheProduit(Produit P) {
        for(Produit O : Pro_) {
            if(O.equals(P))
                return Pro_.indexOf(O);
        }
        return -1;
    }
    public Produit ReturnProduit(int Index) {
        return Pro_.get(Index);
    }
}
