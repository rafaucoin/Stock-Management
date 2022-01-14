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
    @Override
    public void Remise_a_Zero() {

    }
    @Override
    public void Affiche_Points() {
    System.out.println("Points ");
    }
}
