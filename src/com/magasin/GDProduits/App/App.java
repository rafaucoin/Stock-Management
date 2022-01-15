package com.magasin.GDProduits.App;
import com.magasin.GDProduits.INIT;
import com.magasin.GDProduits.Personnes.AgentCommercial;
import com.magasin.GDProduits.Personnes.Client;
import com.magasin.GDProduits.Personnes.ResponsableCommercial;
import com.magasin.GDProduits.ProduitEtNb;
import com.magasin.GDProduits.Produits.Produit;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        INIT i = new INIT();
        Client cl = null;
        ResponsableCommercial R = new ResponsableCommercial();
        Scanner scn = new Scanner(System.in);
        int choix,choix2;
        AgentCommercial agt = new AgentCommercial();
        System.out.println("Tu est maintenant Agent Commercial pour ajouté des Produits : ");
        do {
            System.out.println("1 -Ajouté des Produit ");
            System.out.println("0- Exit ");
            choix = INIT.LireInt("Votre Choix : ");
            switch (choix) {
                case 1:
                    agt.Ajoute_Produit();
                    break;
                case 0: break;
                default:
                    System.out.println("Choix Invalid");
                    break;
            }
        } while (choix != 0);
        if(!ResponsableCommercial.NoPricesProducts.isEmpty()) {
            System.out.println("Tu est Maintenant Responsable Commercial ( pour initalisé les prix ajouté par l'agent ) : ");
            R.setProPricesInQueue();
        }
        int choice_personne, choix1;
        do {
            System.out.println("1 - Client ");
            System.out.println("2 - Agent Commercial ");
            System.out.println("3 - Responsable ");
            System.out.println("0 - Exit ");
            choice_personne = INIT.LireInt("Qui êtes-vous ? ");
            switch (choice_personne) {
                case 1:
                    do {
                        if(cl==null) {
                            String nom, prenom, adresse;
                            System.out.print("Nom : ");
                            nom = scn.next();
                            System.out.print("Prénom : ");
                            prenom = scn.next();
                            System.out.print("Adresse : ");
                            scn.next();
                            adresse = scn.nextLine();
                            cl = new Client(nom, prenom, adresse);
                        }
                        System.out.println("1-ShowRoom ");
                        System.out.println("2-EnLigne ");
                        System.out.println("0 - Exit ");
                        choix1 = INIT.LireInt("Ou etes vous ? ");
                        switch (choix1) {
                            case 1:
                                System.out.println("1-Recherche Produit");
                                System.out.println("2-Consulté Ton Compte de Fidélité");
                                System.out.println("0 - Exit ");
                                choix2=INIT.LireInt("Votre Choix : ");
                                switch (choix2) {
                                    case 1 :
                                        cl.Recherche_Produit();
                                        break;
                                    case 2 :
                                        cl.Connexion();
                                        break;
                                    case 0 :
                                        break;
                                    default:
                                        System.out.println("Choix Invalid");
                                        break;
                                }
                                cl.Recherche_Produit();
                                break;
                            case 2:
                               Produit P=cl.Recherche_Produit();
                               if(P!=null) cl.Reservation(P);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Choix Invalid");
                                break;
                        }
                    } while (choix1 != 0);
                    break;
                case 2:
                    boolean v=false;
                    do {
                        System.out.println("1- Ajouter un produit  ");
                        System.out.println("2- Action de Retour pour le Client  ");
                        System.out.println("3- Action d'Achat  pour le Client ");
                        System.out.println("4- Creation du compte pour le Client ");
                        System.out.println("5- Le Client a oublié son Mdp ");
                        System.out.println("0- Exit ");
                        choix1 = INIT.LireInt("Selectionez une action ");
                        switch (choix1) {
                            case 1:
                                agt.Ajoute_Produit();  v=true;
                                break;
                            case 2:
                                if(cl==null) {
                                    System.out.println("Ya pas de client");
                                    break;
                                }
                                agt.Action_Retour(cl);
                                break;
                            case 3:
                                if(cl==null) {
                                    System.out.println("Ya pas de client");
                                    break;
                                }
                                agt.Action_Achat(cl);
                                break;
                            case 4:
                                if(cl==null) {
                                    System.out.println("Ya pas de client");
                                    break;
                                }
                                String pass;
                                do {
                                    System.out.printf("%s,Donne votre Mot de passe ( Le mot de passe doit contemir au moins 8 caracteres ): \n", cl.Nom);
                                    pass = scn.nextLine();
                                }while(pass.length()<8);
                                agt.Creation_Account(cl,pass);
                                break;
                            case 5 :
                                if(cl==null) {
                                    System.out.println("Ya pas de client !!!");
                                    break;
                                }
                                agt.Changement_Pass(cl);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Choix Invalid");
                                break;
                        }
                    } while (choix1 != 0);
                    if(v==true && !ResponsableCommercial.NoPricesProducts.isEmpty())
                        R.setProPricesInQueue();
                    break;
                case 3:
                    do {
                    System.out.println("1- Modifier les prix des Produits ");
                    System.out.println("0- Exit ");
                    choix1 = INIT.LireInt("Selectionez une action ");
                    switch (choix1) {
                        case 1:
                            R.Change_Prices();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Choix Invalid");
                            break;
                    }
            }
            while (choix1 != 0);
        }
        }while(choice_personne !=0);
    }
}
