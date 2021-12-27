package com.magasin.Produits;
import java.util.HashMap;
import java.util.Map;
public class ProduitsNames {
    public String Pro_Name; // Mobile tablette etc and then there is many mobiles tablettes etc if u got something better tell me
    private Map<Integer,ProduitsVect> Pr = new HashMap<>(); // hash to easly select product vector after to add or search etc ..
    public ProduitsNames(String Pro_Name) {
        this.Pro_Name=Pro_Name;
    }

}
