package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.Produits.Produit;
import java.util.Random;
import java.util.Scanner;
public class Agent {
    public Produit Recherche_Ref() {
        Scanner scn=new Scanner(System.in);
        String Ref=scn.next();
        for (int i = 1; i < INIT.Cat.size(); i++) {
            for (Produit M : INIT.Cat.get(i).Produits) {
                if(M.Ref.equalsIgnoreCase(Ref) && M.getNbProduit()!=0)
                    return M;
            }
        }
        return null;
    }
    public void Ajoute_Produit() {
        boolean found=false;
        int Selec=INIT.Select_Categorie();
        int Type=INIT.Selection_ProduitType(Selec);
        boolean v= true;
        Produit P = INIT.LireProduitPrMagasinier(Selec,Type);
        for(Produit M : INIT.Cat.get(Selec).Produits) {
           if(P.equals(M))
               M.IncNbProduit(P.getNbProduit()); found=true; break;
        }
        if(!found)
            INIT.Cat.get(Selec).Produits.add(P);

    }
    public void Action_Achat(Client c) {
        Produit P=Recherche_Ref();
        if(c.Compte!=null)
        c.Compte.Increment_Points(P.getPrice(),P.Categorie);
        P.DecNbProduit();
    }
    public void Action_Retour(Client c,int Nombre) {
        Produit P=Recherche_Ref();
        c.Compte.Decrement_Points(P.getPrice(),P.Categorie);
        P.IncNbProduit(Nombre);
    }
    public void Creation_Account(Client c) {
    if(c.Compte!=null) {
        System.out.println("Compte Existe Déja");
    }
    else {
         String Pass= PasswordGenerator.generateRandomPassword(8);
         c.Compte=new CompteFDL(Pass);
         System.out.println("Mot de Pass : "+c.Compte.getPassword());
    }
    }
    public void Changement_Pass(Client c) {
        if(c.Compte==null)
            System.out.println("il a pas un compte");
        else {
            String Pass= PasswordGenerator.generateRandomPassword(8);
            c.Compte.setPassword(Pass);
            System.out.println("Le nouveau Mot de Pass est : "+c.Compte.getPassword());
        }
    }
    private class PasswordGenerator {
        public static String generateRandomPassword(int len) {
            String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
                    +"jklmnopqrstuvwxyz!@#$%&";
            Random rnd = new Random();
            StringBuilder sb = new StringBuilder(len);
            for (int i = 0; i < len; i++)
                sb.append(chars.charAt(rnd.nextInt(chars.length())));
            return sb.toString();
        }
    }  // INNER CLASS
}
