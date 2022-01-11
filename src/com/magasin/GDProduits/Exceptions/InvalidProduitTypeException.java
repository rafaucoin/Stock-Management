package com.magasin.GDProduits.Exceptions;

public class InvalidProduitTypeException extends Exception {
   public  InvalidProduitTypeException() {
        super("Ce Type de Produit n'existe pas");
    }
}
