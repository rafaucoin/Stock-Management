package com.magasin.GDProduits.Personnes;
public interface CompteFidélité {
    void Remise_a_Zero(String Cat);
    void Affiche_Points();
    void Increment_Points(double price,String Cat);
    void Decrement_Points(double price,String Cat);
}
