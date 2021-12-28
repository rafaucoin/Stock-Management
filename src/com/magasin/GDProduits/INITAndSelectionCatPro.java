package com.magasin.GDProduits;
import Exceptions.SelectionOutOfBondException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class INITAndSelectionCatPro {
    private Map<Integer,Categorie> Cat = new HashMap<>();
    public INITAndSelectionCatPro() {
        // 5 Catégoris Initiale Adding a Add_Methode for new Categories After *****
        Cat.put(1,new Categorie("Mobiles"));
        // ***** Adding Products name
        Cat.get(1).add_NewProduitName("Tablette tactiles");

        Cat.put(2,new Categorie("Electroniques"));
        // ***** Adding Products Name
        Cat.get(2).add_NewProduitName("Télévisions");

        Cat.put(3,new Categorie("Electroménager"));
        // ***** Adding Products Name
        Cat.get(3).add_NewProduitName("Climatiseurs");

        Cat.put(4,new Categorie("Informatiques"));
        // ***** Adding Products Name
        Cat.get(4).add_NewProduitName("Pc Portable");

        Cat.put(5,new Categorie("Kits solaires"));
        // ***** Adding Products Name
        Cat.get(5).add_NewProduitName("Batteries solaires");
    }
    public void  afficher_Categories() {
        Cat.forEach((key, cat) -> System.out.println((key+"-"+cat.getCat_Name()))); // Cat.size() to get size **
    }
    public int  Select_Categorie() {
        Scanner scn=new Scanner(System.in);
        int S=0;
        boolean v;
        do {
            afficher_Categories();
            v = true;
            try {
                S = scn.nextInt();
                if (S < 1 || S > Cat.size())
                    throw new SelectionOutOfBondException("Erreur tu as entrée une selection Invalid");
            } catch (SelectionOutOfBondException e) {
                System.out.println(e.getMessage());
                v = false;
            }
            Console_Clear();
        }while(!v);
        return S;
    }
    // Print Every Name of pruduct in the categorie
    public static void Console_Clear() { // not Working*******
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public Categorie getCat(Integer i) {
        return Cat.get(i);
    }
}