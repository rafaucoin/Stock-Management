package com.magasin.GDProduits;
import Exceptions.SelectionOutOfBondException;
import com.magasin.GDProduits.Produits.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class INITAndSelectionCatPro {
    private final Map<Integer,Categorie> Cat = new HashMap<>();
    public INITAndSelectionCatPro() {
        // ***** Adding Products Name */
        Cat.put(1,new Categorie("Mobiles"));
        // add Products Names Of Mobile Cat ****
        Cat.get(1).Add_NewProduitType("Tablette tactile");
        Cat.get(1).Add_NewProduitType(" Télephone mobile");
        Cat.get(1).Add_NewProduitType("Smartwatch,");
        Cat.get(1).Add_NewProduitType("Kids Watch");
        Cat.put(2,new Categorie("Electroniques"));
        // add Products Names Of Elec Cat ****
        Cat.get(2).Add_NewProduitType("Televiseurs");
        Cat.get(2).Add_NewProduitType("Démodulateur");
        Cat.get(2).Add_NewProduitType("WifiSpeaker");
        Cat.put(3,new Categorie("Electroménager"));
        // add Products Names Of Electro Cat ****
        Cat.get(3).Add_NewProduitType("Climatiseurs");
        Cat.get(3).Add_NewProduitType("Equipements de cuisine");
        Cat.get(3).Add_NewProduitType("lave linge");
        Cat.get(3).Add_NewProduitType("refrigerateurs");
        Cat.get(3).Add_NewProduitType("petit électroménager");
        Cat.get(3).Add_NewProduitType("aspirateur");
        Cat.get(3).Add_NewProduitType("ventilateur");
        Cat.get(3).Add_NewProduitType("congelateur");
        Cat.put(4,new Categorie("Informatiques"));
        // add Products Names Of Info Cat ****
        Cat.get(4).Add_NewProduitType("pc bureau");
        Cat.get(4).Add_NewProduitType("pc portable");
        Cat.get(4).Add_NewProduitType("pc all in one");
        Cat.get(4).Add_NewProduitType("serveur");
        Cat.get(4).Add_NewProduitType("station de travail");
        Cat.get(4).Add_NewProduitType("ultrabook");
        Cat.get(4).Add_NewProduitType("Peripheriques et accessoires");
        Cat.put(5,new Categorie("Kits solaires"));
        // add Products Names Of Mobile Kits ****
        Cat.get(5).Add_NewProduitType("module photovoltaique");
        Cat.get(5).Add_NewProduitType("batteries solaires");
        Cat.get(5).Add_NewProduitType("regulateurs de charge solaires");
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
    public int Select_ProduitType() {
        boolean v;
        int cat=Select_Categorie(),selection;
        Scanner scn=new Scanner(System.in);
        do {
           v=true;
           Cat.get(cat).afficher_ProduitsType();
           selection= scn.nextInt();
           try {
               if(selection < 1 ||selection >Cat.get(cat).sizeVect())
                   throw new SelectionOutOfBondException("Erreur tu as entrée une selection Invalid");
           }
           catch (SelectionOutOfBondException e) {
               System.out.println(e.getMessage());
               v=false;
           }
        }while(!v);
        return selection;
    }
    public Produit LireProduit(int i) {
    Produit P;
    return P;
    }
    public static void Console_Clear() { // not Working*******
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public Categorie getCat(Integer i) {
        return Cat.get(i);
    }
}