package com.magasin.GDProduits.Produits.Personnes;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.Produits.Produit;
public class Magasinier {
    public Produit Recherche_Ref(String Ref) {
        for (int i = 1; i < INIT.Cat.size(); i++) {
            for (Produit M : INIT.Cat.get(i).Produits) {
                if(M.Ref.equalsIgnoreCase(Ref))
                    return M;
            }
        }
        return null;
    }

}
