package com.magasin.GDProduits.Personnes;
public interface CompteFidélité {
    double tauxPIM=5;
    double tauxPELE=10;
    double tauxPS=15;
    void Affiche_Points();
    void Increment_Points(double price,String Cat);
    void Decrement_Points(double price,String Cat);
    double Return_PointCat(String Cat);
}
