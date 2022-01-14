package com.magasin.GDProduits.Personnes;
public interface CompteFidélité {
    // taux de reduction
    double tauxPIM=5;
    double tauxPELE=10;
    double tauxPS=15;
    void Remise_a_Zero(String Cat);
    void Affiche_Points();
    void Increment_Points(double price,String Cat);
    void Decrement_Points(double price,String Cat);
}
