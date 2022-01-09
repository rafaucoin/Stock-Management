package com.magasin.GDProduits;
import com.magasin.GDProduits.Exceptions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class INIT {
    public final static  Map<Integer,Categorie> Cat = new HashMap<>();
    public  INIT() {
        // ***** Adding Products Name */
        Cat.put(1,new Categorie("Mobiles"));
        // add Products Names Of Mobile Cat ****
        Cat.get(1).Add_New_ProType("Tablette tactile");
        Cat.get(1).Add_New_ProType("Télephone mobile");
        Cat.get(1).Add_New_ProType("Smartwatch,");
        Cat.get(1).Add_New_ProType("Kids Watch");
        Cat.put(2,new Categorie("Electroniques"));
        // add Products Names Of Elec Cat ****
        Cat.get(2).Add_New_ProType("Televiseurs");
        Cat.get(2).Add_New_ProType("Démodulateur");
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
    public static   int  Select_Categorie() {
        Scanner scn=new Scanner(System.in);
        int S=0;
        boolean v;
        do {
            Cat.forEach((key, cat) -> System.out.println((key+"-"+cat.Nom_Cat)));
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

}
