package com.magasin.GDProduits.Personnes;
public class CompteFDL implements CompteFidélité {
    private String Password;
    private double PIM,PELE,PS;
    public CompteFDL(String Password) {
        this.Password = Password;
        this.PIM =0;
        this.PELE =0;
        this.PS =0;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public void Remise_a_Zero(String Cat) {
        switch (Cat) {
            case "Mobiles":
            case "Informatiques" :
                PIM=0;
                break;
            case "Electromenager":
            case "Electroniques":
                PELE=0;
                break;
            case "Kits solaires" :
                PS=0;
                break;
        }
    }
    public void Affiche_Points() {
    System.out.println("Vos Points :");
    System.out.println("Cumule de produits informatiques et mobiles: "+PIM);
    System.out.println("Cumule de produits électronique et électroménager: "+PELE);
    System.out.println("Cumule de kits solaires: "+PS);
    }
    public void Increment_Points(double price,String Cat) {
        switch (Cat) {
            case "Mobiles":
            case "Informatiques" :
                PIM+=price;
                break;
            case "Electromenager":
            case "Electroniques":
                PELE+=price;
                break;
            case "Kits solaires" :
                PS+=price;
                break;
        }
    }
    public void Decrement_Points(double price, String Cat) {
        switch (Cat) {
            case "Mobiles":
            case "Informatiques" :
                PIM-=price;
                break;
            case "Electromenager":
            case "Electroniques":
                PELE-=price;
                break;
            case "Kits solaires" :
                PS-=price;
                break;
        }
    }
}
