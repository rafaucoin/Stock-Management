package com.magasin.GDProduits;
import Exceptions.SelectionOutOfBondException;
import com.magasin.GDProduits.Produits.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public  class INITAndSelectionCatPro {
    public static final Map<Integer,Categorie> Cat = new HashMap<>();
    public INITAndSelectionCatPro() {
        // ***** Adding Products Name */
        Cat.put(1,new Categorie("Mobiles"));
        // add Products Names Of Mobile Cat ****
        Cat.get(1).Add_NewProduitType("Tablette tactile");
        Cat.get(1).Add_NewProduitType("Télephone mobile");
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
    public static void  afficher_Categories() {
        Cat.forEach((key, cat) -> System.out.println((key+"-"+cat.getCat_Name()))); // Cat.size() to get size **
    }
    private static int  Select_Categorie() {
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
        }while(!v);
        return S;
    }
    private static int Select_ProduitType(int cat) {
        boolean v;
        int selection;
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
    public static IndexCouple Selection() {
        int i=Select_Categorie(),j=Select_ProduitType(i);
        return new IndexCouple(i,j);
    }
    public static Produit LireProduit(int Type,int Selct) {
    Produit P=null;
    Scanner Scn=new Scanner(System.in);
    String s1,s2,s3,s4,s5;
    int i1,i2;
        System.out.print("Name=");
        s1 = Scn.next();
        System.out.print("Référence=");
        s2=Scn.next();
        System.out.print("Description=");
        s3 = Scn.next();
    switch (Selct) {
        case 1 :
                switch (Type) {
                    case 1 :
                        break;
                    case 2 :
                        System.out.print("Cpu : ");
                        s4 = Scn.next();
                        System.out.print("Ram en (GB) : ");
                        i1 = Scn.nextInt();
                        System.out.print("Stockage en (GB) : ");
                        i2 = Scn.nextInt();
                        P=new Phone(s1,s2,s3,s4,i1,i2);
                        break;

                    case 3 :
                        break;
                    case 4 :
                        break;
                    case 5 :
                        break;
                }
                break;
        case 2 :
            switch (Type) {
                case 1 :
                    break;
                case 2 :
                    break;

                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
            }
            break;
        case 3 :
            switch (Type) {
                case 1 :
                    break;
                case 2 :
                    break;

                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
            }
            break;
        case 4 :
            switch (Type) {
                case 1 :
                    break;
                case 2 :
                    break;

                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
            }
            break;
        case 5 :
            switch (Type) {
                case 1 :
                    break;
                case 2 :
                    break;

                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
            }
            break;
    }
    return P;
    }
}
