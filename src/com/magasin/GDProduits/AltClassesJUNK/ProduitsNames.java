package com.magasin.GDProduits.AltClassesJUNK;
import com.magasin.GDProduits.ProduitTypeVect;

import java.util.HashMap;
import java.util.Map;
public class ProduitsNames {
    public String Pro_Name;
    private Map<Integer, ProduitTypeVect> Pr = new HashMap<>();
    public ProduitsNames(String Pro_Name) {
        this.Pro_Name=Pro_Name;
    }

}
