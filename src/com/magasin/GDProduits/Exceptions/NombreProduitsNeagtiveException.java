package com.magasin.GDProduits.Exceptions;
public class NombreProduitsNeagtiveException extends Exception {
    public NombreProduitsNeagtiveException() {
        super("il faut un Nombre Positif");
    }
}
