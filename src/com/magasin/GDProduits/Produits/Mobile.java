package com.magasin.GDProduits.Produits;
public class Mobile extends Produit {
    //caract
    private int Ram,Stockage,Cam_Ar,Cam_Av;
    private String Cpu,Gpu;
    public Mobile(String Pro_Typ, String Name, String Ref, String Descriptive, double Price) {
        super(Pro_Typ, Name, Ref, Descriptive, Price);
    }
    public int getRam() {
        return Ram;
    }
    public void setRam(int ram) {
        Ram = ram;
    }
    public int getStockage() {
        return Stockage;
    }
    public void setStockage(int stockage) {
        Stockage = stockage;
    }
    public int getCam_Ar() {
        return Cam_Ar;
    }
    public void setCam_Ar(int cam_Ar) {
        Cam_Ar = cam_Ar;
    }
    public int getCam_Av() {
        return Cam_Av;
    }
    public void setCam_Av(int cam_Av) {
        Cam_Av = cam_Av;
    }
    public void setCpu(String cpu) {
        Cpu = cpu;
    }
    public String getGpu() {
        return Gpu;
    }
    public void setGpu(String gpu) {
        Gpu = gpu;
    }
    public String getCpu() {
        return Cpu;
    }
}
//done! ana ni nseyi nfhem f la class categorie