package com.magasin.GDProduits; // *********** Negative Value of the Quant not handled yet *************
import com.magasin.GDProduits.Exceptions.*;
import com.magasin.GDProduits.Produits.*;

import java.util.*;
public class INIT {
    public final Queue<Produit> Pro_queue = new LinkedList<>();
    public final static  Map<Integer,Categorie> Cat = new HashMap<>();
    public  INIT() {
        // ***** Adding Products Name */
        Cat.put(1,new Categorie("Mobiles"));
        // add Products Names Of Mobile Cat ****
        Cat.get(1).Add_New_ProType("Tablette tactile");
        Cat.get(1).Add_New_ProType("Telephone mobile");
        Cat.get(1).Add_New_ProType("Smartwatch");
        Cat.put(2,new Categorie("Electroniques"));
        // add Products Names Of Elec Cat ****
        Cat.get(2).Add_New_ProType("Televiseur");
        Cat.get(2).Add_New_ProType("Sound Bar");
        Cat.put(3,new Categorie("Electromenager"));
        // add Products Names Of Electro Cat ****
        Cat.get(3).Add_New_ProType("Climatiseur");
        Cat.get(3).Add_New_ProType("Congelateur");
        Cat.put(4,new Categorie("Informatiques"));
        // add Products Names Of Info Cat ****
        Cat.get(4).Add_New_ProType("Pc bureau");
        Cat.get(4).Add_New_ProType("Pc portable");
        Cat.get(4).Add_New_ProType("Serveur");
        Cat.put(5,new Categorie("Kits solaires"));
        // add Products Names Of Mobile Kits ****
        Cat.get(5).Add_New_ProType("Onduleurs");
        Cat.get(5).Add_New_ProType("batterie solaire");
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
                    throw new SelectionOutOfBondException("Erreur tu as entrée une selection Invalid ");
            } catch (SelectionOutOfBondException e) {
                System.out.println(e.getMessage());
                v = false;
            }
            catch (InputMismatchException e){
                    System.out.println("Erreur il faut entrer un Numero");
                    v = false;
                    scn.next();
            }
        }while(!v);
        return S;
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
            }catch (InputMismatchException e){
                System.out.println("Erreur il faut entrer un numero ");
                v = false;
                scn.next();
            }
        }while(!v);
        return S;
    }
    public static int LireInt(String msg) {
        Scanner i=new Scanner(System.in);
        boolean v;
        int ii=0;
        do {
            v=true;
            try {
                System.out.print(msg);
                ii = i.nextInt();
            } catch (InputMismatchException e) {
                v=false;
                System.out.println("Veuiller Vous Entrez Des Chiffres");
                i.nextLine();
            }
        }while(!v);
        return ii;
    }
    public static ProduitEtNb LireProduitPrMagasinier(int Selct,int Type) {
        ProduitEtNb P=null;
        Scanner Scn= new Scanner(System.in);
        String s1,s2,s3,s4,s5;
        int i1,i2,i3,i4;
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
                        i1 =LireInt("Ram en (GB) : ");
                        i2 =LireInt("Stockage en (GB) : ");
                        i4=LireInt("Batterie (mAh) : ");
                        i3=LireInt("Quantité : ");
                        P=new ProduitEtNb(new Tablette(Cat.get(Selct).Nom_Cat,Cat.get(Selct).TypePro.get(Type),s1,s2,s3,s4,i1,i2,i4),i3);
                        break;
                    case 2 :
                        System.out.print("Cpu : ");
                        s4 = Scn.next();
                        i1 =LireInt("Ram en (GB) : ");
                        i2 =LireInt("Stockage en (GB) : ");
                        i4=LireInt("Batterie (mAh) : ");
                        i3=LireInt("Quantité : ");
                        P=new ProduitEtNb(new Phone(Cat.get(Selct).Nom_Cat,Cat.get(Selct).TypePro.get(Type),s1,s2,s3,s4,i1,i2,i4),i3);
                        break;
                    case 3 :
                        break;
                }
                break;
            case 2 :
                switch (Type) {
                    case 1 :
                        System.out.print("Taille d'Ecran :");
                        i1=Scn.nextInt();
                        System.out.print("Quality d'image supporté :");
                        s4=Scn.next();
                        i3=LireInt("Quantité :");
                        P=new ProduitEtNb(new Tv(Cat.get(Selct).Nom_Cat,Cat.get(Selct).TypePro.get(Type),s1,s2,s3,s4,i1),i3);
                        break;
                    case 2 : // soundbar
                        System.out.println("Sound : "); // WDYM BY SOUND
                        s4=Scn.next();
                        System.out.println("connectivity : ");
                        s5=Scn.next();
                        i3=LireInt("Quantité :");
                        P=new ProduitEtNb(new Soundbar(Cat.get(Selct).Nom_Cat,s1,s2,Cat.get(Selct).TypePro.get(Type),s3,s4,s5),i3);
                        break;
                }
                break;
            case 3 :
                switch (Type) {
                    case 1 :
                        i1=LireInt("Capacité : ");
                        i2=LireInt("Sonore : ");
                        i3=LireInt("Quantité :");
                        P=new ProduitEtNb(new Climatiseur(Cat.get(Selct).Nom_Cat,s1,s2,Cat.get(Selct).TypePro.get(Type),s3,i1,i2),i3);
                        break;
                    case 2 :
                        System.out.println("Enèrgie : ");
                        s4=Scn.next();
                        i3=LireInt("Quantité :");
                        P= new ProduitEtNb(new Congelateur(Cat.get(Selct).Nom_Cat,s1,s2,Cat.get(Selct).TypePro.get(Type),s3,s4),i3);
                        break;
                }
                break;
            case 4 :
                switch (Type) {
                    case 1 :
                    case 2 :
                        System.out.print("Cpu : ");
                        s4 = Scn.next();
                        System.out.print("Ram en (GB) : ");
                        i1 = Scn.nextInt();
                        System.out.print("Stockage en (GB) : ");
                        i2 = Scn.nextInt();
                        System.out.print("Taille d'Ecran: ");
                        i3 = Scn.nextInt();
                        System.out.print("Quantité :");
                        i4= Scn.nextInt();
                        P=new ProduitEtNb(new Pc(Cat.get(Selct).Nom_Cat,Cat.get(Selct).TypePro.get(Type),s1,s2,s3,s4,i1,i2,i3),i4);
                        break;
                    case 3 :
                        System.out.print("Cpu : ");
                        s4 = Scn.next();
                        System.out.print("Ram en (GB) : ");
                        i1 = Scn.nextInt();
                        System.out.print("Stockage en (GB) : ");
                        i2 = Scn.nextInt();
                        System.out.print("Quantité :");
                        i4= Scn.nextInt();
                        P=new ProduitEtNb(new Serveur(Cat.get(Selct).Nom_Cat,Cat.get(Selct).TypePro.get(Type),s1,s2,s3,s4,i1,i2),i4);
                        break;

                }
                break;
            case 5 :
                switch (Type) {
                    case 1 :
                        i1=LireInt("Nombre des Prises : ");
                        i2=LireInt("Capacité : ");
                        i3=LireInt("Quantité : ");
                        P=new ProduitEtNb(new Onduleurs(Cat.get(Selct).Nom_Cat,s1,s2,Cat.get(Selct).TypePro.get(Type),s3,i1,i2),i3);
                        break;
                    case 2 :
                        System.out.println("Capacité : ");
                        s4=Scn.next();
                        System.out.println("Nombre de Cells : ");
                        s5=Scn.next();
                        i3=LireInt("Quantité : ");
                        P=new ProduitEtNb(new Batterie(Cat.get(Selct).Nom_Cat,s1,s2,Cat.get(Selct).TypePro.get(Type),s3,s4,s5),i3);
                        break;
                }
                break;
        }
        return P;
    }
    public static Produit LireProduitClient(int Selct, int Type) { // pour la recherche de client
        Produit P=null;
        Scanner Scn= new Scanner(System.in);
        String s1,s2,s3,s4;
        int i1,i2,i3,i4;
        System.out.print("Name=");
        s1 = Scn.next();
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
                        System.out.print("Batterie (mAh) :");
                        i4= Scn.nextInt();
                        P=new Tablette(Cat.get(Selct).Nom_Cat,s1,Cat.get(Selct).TypePro.get(Type),i1,i2,i4,s4);
                        break;
                    case 2 :
                        System.out.print("Cpu : ");
                        s4 = Scn.next();
                        System.out.print("Ram en (GB) : ");
                        i1 = Scn.nextInt();
                        System.out.print("Stockage en (GB) : ");
                        i2 = Scn.nextInt();
                        System.out.print("Batterie (mAh) :");
                        i4= Scn.nextInt();
                        P=new Phone(Cat.get(Selct).Nom_Cat,s1,Cat.get(Selct).TypePro.get(Type),i1,i2,i4,s4);
                        break;
                    /*case 3 : // MAYBE I'LL ADD SMART WATCH
                        break; */
                }
                break;
            case 2 :
                switch (Type) {
                    case 1 :
                        System.out.print("Taille d'Ecran :");
                        i1=Scn.nextInt();
                        System.out.print("Quality d'image supporté :");
                        s4=Scn.next();
                        P=new Tv(Cat.get(Selct).Nom_Cat,s1,Cat.get(Selct).TypePro.get(Type),i1,s4);
                        break;
                    case 2 :

                        break;
                }
                break;
            case 3 :
                switch (Type) {
                    case 1 :
                        break;
                    case 2 :
                        break;
                }
                break;
            case 4 :
                switch (Type) {
                    case 1 :
                    case 2 :
                        System.out.print("Cpu : ");
                        s4 = Scn.next();
                        System.out.print("Ram en (GB) : ");
                        i1 = Scn.nextInt();
                        System.out.print("Stockage en (GB) : ");
                        i2 = Scn.nextInt();
                        System.out.print("Taille d'Ecran: ");
                        i3 = Scn.nextInt();
                        P=new Pc(Cat.get(Selct).Nom_Cat,s1,Cat.get(Selct).TypePro.get(Type),i1,i2,i3,s4);
                        break;
                    case 3 :
                        System.out.print("Cpu : ");
                        s4 = Scn.next();
                        System.out.print("Ram en (GB) : ");
                        i1 = Scn.nextInt();
                        System.out.print("Stockage en (GB) : ");
                        i2 = Scn.nextInt();
                        System.out.print("Taille d'Ecran: ");
                        i3 = Scn.nextInt();
                        P=new Serveur(Cat.get(Selct).Nom_Cat,s1,Cat.get(Selct).TypePro.get(Type),i1,i2,s4);
                        break;
                }
                break;
            case 5 :
                switch (Type) {
                    case 1 :
                        break;
                    case 2 :
                        break;
                }
                break;
        }
        return P;
    }

}
