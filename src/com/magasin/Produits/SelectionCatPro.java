package com.magasin.Produits;
import java.util.HashMap;
import java.util.Map;
public class SelectionCatPro {
    private Map<Integer, Categorie> Cat = new HashMap<>();
    public SelectionCatPro() {
        Categorie Temp=new Categorie("Mobiles");
        Cat.put(1,Temp);
        // add Products Names Of Mobile Cat ****
        Temp.Add_Produit_Name("Tablette tactile");
        Temp.Add_Produit_Name(" Téléphone mobile");
        Temp.Add_Produit_Name("Smartwatch,");
        Temp.Add_Produit_Name("Kids Watch");
        Temp=new Categorie("Electroniques");
        Cat.put(2,Temp);
        // add Products Names Of Elec Cat ****
        Temp.Add_Produit_Name("Téléviseurs");
        Temp.Add_Produit_Name("Démodulateur");
        Temp.Add_Produit_Name("WifiSpeaker");
        Cat.put(3,new Categorie("Electroménager"));
        // add Products Names Of Electro Cat ****
        Temp.Add_Produit_Name("Climatiseurs");
        Temp.Add_Produit_Name("Equipements de cuisine");
        Temp.Add_Produit_Name("lave linge");
        Temp.Add_Produit_Name("réfrigérateurs");
        Temp.Add_Produit_Name("petit électroménager");
        Temp.Add_Produit_Name("aspirateur");
        Temp.Add_Produit_Name("ventilateur");
        Temp.Add_Produit_Name("congélateur");
        /*Cat.put(4,new Catégorie("Informatiques"));
        // add Products Names Of Info Cat ****
        Temp.Add_Produit_Name("pc bureau");
        Temp.Add_Produit_Name("pc portable");
        Temp.Add_Produit_Name("pc all in one");
        Temp.Add_Produit_Name("serveur");
        Temp.Add_Produit_Name("");
        Temp.Add_Produit_Name("");
        Temp.Add_Produit_Name("");
        Temp.Add_Produit_Name("");
        Cat.put(5,new Catégorie("Kits solaires"));
        // add Products Names Of Mobile Kits ****
        Temp.Add_Produit_Name("");
        Temp.Add_Produit_Name("");
        Temp.Add_Produit_Name("");
        Temp.Add_Produit_Name(""); */
    }
    public void  afficher_Categories() {
        Cat.forEach((key, cat) -> System.out.println((key+"-"+cat.getCat_Name()))); // Cat.size() to get size **
    }
    // Print Every Name of pruduct in the categorie
    public static void Console_Clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
