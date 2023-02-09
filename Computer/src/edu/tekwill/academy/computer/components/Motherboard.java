package edu.tekwill.academy.computer.components;

public class Motherboard {
    private String Marca;
    private String Model;
    private int Kw;

    public Motherboard(String Marca, String Model, int Kw) {
        this.Marca = Marca;
        this.Model = Model;
        this.Kw = Kw;
    }

    public String getMarca() {
        return Marca;
    }
    public  void  setMarca(String Marca){
        this.Marca= Marca;
    }
    public String getModel() {
        return Model;
    }
    public  void  setModel(String Model) {
        this.Model = Model;
    }
    public int getKw() {
        return Kw;
    }
    public  void  setKw(int Kw) {
        this.Kw = Kw;
    }
}
