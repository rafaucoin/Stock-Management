package com.magasin.GDProduits.Exceptions;

public class NombreNegativeException extends  Exception{
    public NombreNegativeException() {
        super("Entrez un Prix Valide");
    }
    public NombreNegativeException(String msg) {
        super(msg);
    }
}
