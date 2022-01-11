package com.magasin.GDProduits;
import com.magasin.GDProduits.Exceptions.*;
import com.magasin.GDProduits.Produits.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class INIT {
    //hahahahahahhahahaha
    public final static  Map<Integer,Categorie> Cat = new HashMap<>();
    public  INIT() {
        // ***** Adding Products Name */
        Cat.put(1,new Categorie("Mobiles"));
        // add Products Names Of Mobile Cat ****
        Cat.get(1).Add_New_ProType("Tablette tactile");
        Cat.get(1).Add_New_ProType("Telephone mobile");
        Cat.get(1).Add_New_ProType("Smartwatch");
        Cat.get(1).Add_New_ProType("Kids Watch");
        Cat.put(2,new Categorie("Electroniques"));
        // add Products Names Of Elec Cat ****
        Cat.get(2).Add_New_ProType("Televiseurs");
        Cat.get(2).Add_New_ProType("Demodulateur");
        Cat.get(2).Add_New_ProType("WifiSpeaker");
        Cat.put(3,new Categorie("Electroménager"));
        // add Products Names Of Electro Cat ****
        Cat.get(3).Add_New_ProType("Climatiseurs");
        Cat.get(3).Add_New_ProType("Equipements de cuisine");
        Cat.get(3).Add_New_ProType("lave linge");
        Cat.get(3).Add_New_ProType("refrigerateurs");
        Cat.get(3).Add_New_ProType("petit électroménager");
        Cat.get(3).Add_New_ProType("aspirateur");
        Cat.get(3).Add_New_ProType("ventilateur");
        Cat.get(3).Add_New_ProType("congelateur");
        Cat.put(4,new Categorie("Informatiques"));
        // add Products Names Of Info Cat ****
        Cat.get(4).Add_New_ProType("pc bureau");
        Cat.get(4).Add_New_ProType("pc portable");
        Cat.get(4).Add_New_ProType("pc all in one");
        Cat.get(4).Add_New_ProType("serveur");
        Cat.get(4).Add_New_ProType("station de travail");
        Cat.get(4).Add_New_ProType("ultrabook");
        Cat.get(4).Add_New_ProType("Peripheriques et accessoires");
        Cat.put(5,new Categorie("Kits solaires"));
        // add Products Names Of Mobile Kits ****
        Cat.get(5).Add_New_ProType("module photovoltaique");
        Cat.get(5).Add_New_ProType("batteries solaires");
        Cat.get(5).Add_New_ProType("regulateurs de charge solaires");
    }
    public static int Select_Categorie() {
        Scanner scn=new Scanner(System.in);
        int S=0;
        boolean v;
        do {
            INIT.Cat.forEach((key, cat) -> System.out.println((key+"-"+cat.Nom_Cat)));
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
    public static Produit LireProduitPrMagasinier(int Selct,int Type) {
        Produit P=null;
        Scanner Scn= new Scanner(System.in);
        String s1,s2,s3,s4;
        int i1,i2,i3;
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
                        System.out.print("Cpu : ");
                        s4 = Scn.next();
                        System.out.print("Ram en (GB) : ");
                        i1 = Scn.nextInt();
                        System.out.print("Stockage en (GB) : ");
                        i2 = Scn.nextInt();
                        System.out.print("Quantité :");
                        i3= Scn.nextInt();
                        P=new Tablette(Type,s1,s2,s3,s4,i1,i2,i3);
                        break;
                    case 2 :
                        System.out.print("Cpu : ");
                        s4 = Scn.next();
                        System.out.print("Ram en (GB) : ");
                        i1 = Scn.nextInt();
                        System.out.print("Stockage en (GB) : ");
                        i2 = Scn.nextInt();
                        System.out.print("Quantité :");
                        i3= Scn.nextInt();
                        P=new Phone(Type,s1,s2,s3,s4,i1,i2,i3);
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
    public static Produit LireProduit1() { // pour la recherche de client
        return null;
    }
    public static int Selection_ProduitType(int cat) {
        Scanner scn=new Scanner(System.in);
        int S=0;
        boolean v;
        do {
            Cat.get(cat).TypePro.forEach((key, type) -> System.out.println((key+"-"+type)));
            v = true;
            try {
                S = scn.nextInt();
                if (S < 1 || S > Cat.get(cat).TypePro.size())
                    throw new SelectionOutOfBondException("Erreur tu as entrée une selection Invalid");
            } catch (SelectionOutOfBondException e) {
                System.out.println(e.getMessage());
                v = false;
            }
        }while(!v);
        return S;
    }
}
