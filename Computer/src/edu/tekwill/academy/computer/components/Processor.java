package edu.tekwill.academy.computer.components;


public class Processor {
    private String Marca;
    private String Model;
    private int Nuclee;

    public Processor(String Marca, String Model, int Nuclee) {
        this.Marca = Marca;
        this.Model = Model;
        this.Nuclee = Nuclee;
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
    public int getNuclee() {
        return Nuclee;
    }
    public  void  setNuclee(int Nuclee) {
        this.Nuclee = Nuclee;
    }
}