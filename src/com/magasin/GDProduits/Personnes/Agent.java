package com.magasin.GDProduits.Personnes;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.ProduitEtNb;
import java.util.Random;
import java.util.Scanner;
public class Agent {
    public ProduitEtNb Recherche_Ref() {
        Scanner scn = new Scanner(System.in);
        String Ref = scn.next();
        for (int i = 1; i < INIT.Cat.size(); i++) {
            for (ProduitEtNb M : INIT.Cat.get(i).Produits) {
                if (M.Produit.Ref.equalsIgnoreCase(Ref) && M.getNombreProduit() != 0)
                    return M;
            }
        }
        return null;
    }

    public void Ajoute_Produit() {
        boolean found = false;
        int Selec = INIT.Select_Categorie();
        int Type = INIT.Selection_ProduitType(Selec);
        boolean v = true;
        ProduitEtNb P = INIT.LireProduitPrMagasinier(Selec, Type);
        for (ProduitEtNb M : INIT.Cat.get(Selec).Produits) {
            if (P.Produit.equals(M.Produit))
                M.incNbProduit(P.getNombreProduit());
            found = true;
            break;
        }
        if (!found)
            INIT.Cat.get(Selec).Produits.add(P);

    }

    public void Action_Achat(Client c) {
        ProduitEtNb P = Recherche_Ref();
        if (c.Compte == null)
            Creation_Account(c);
        c.Compte.Increment_Points(P.getNombreProduit(), P.Produit.Categorie);
        P.DecNbby1();
    }

    public void Action_Retour(Client c) {
        ProduitEtNb P = Recherche_Ref();
        c.Compte.Decrement_Points(P.Produit.getPrice(), P.Produit.Categorie);
        P.incNbProduit(1);
    }

    public void Creation_Account(Client c) {
        if (c.Compte != null) {
            System.out.println("Compte Existe Déja");
        } else {
            String Pass = PasswordGenerator.generateRandomPassword(8);
            c.Compte = new CompteFDL(Pass);
            System.out.println("Mot de Pass : " + c.Compte.getPassword());
        }
    }

    public void Changement_Pass(Client c) {
        if (c.Compte == null)
            System.out.println("il a pas un compte");
        else {
            String Pass = PasswordGenerator.generateRandomPassword(8);
            c.Compte.setPassword(Pass);
            System.out.println("Le nouveau Mot de Pass est : " + c.Compte.getPassword());
        }
    }

    private class PasswordGenerator {
        public static String generateRandomPassword(int len) {
            String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
                    + "jklmnopqrstuvwxyz!@#$%&";
            Random rnd = new Random();
            StringBuilder sb = new StringBuilder(len);
            for (int i = 0; i < len; i++)
                sb.append(chars.charAt(rnd.nextInt(chars.length())));
            return sb.toString();
        }
    }  // INNER CLASS
}
