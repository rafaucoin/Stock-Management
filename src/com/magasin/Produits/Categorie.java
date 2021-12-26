package com.magasin.Produits;
import java.util.HashMap;
import java.util.Map;
public class Categorie {
    private String Designation;
    private Map<Integer,String> Cat = new HashMap();
    public Categorie() {

    }
    public void  afficher_Categorie() {
    Cat.forEach();
    }
}
