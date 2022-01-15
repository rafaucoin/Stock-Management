package com.magasin.GDProduits.Exceptions;

public class PrixNegativeException extends  Exception{
    public PrixNegativeException() {
        super("Entrez un Prix Valide");
    }
}
