package edu.tekwill.academy.computer.components;

public class HardDrive {
    private String Marca;
    private String Model;
    private int Volume;

    public HardDrive(String Marca, String Model, int Volume) {
        this.Marca = Marca;
        this.Model = Model;
        this.Volume = Volume;
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
    public int getVolume() {
        return Volume;
    }
    public  void  setVolume(int Volume) {
        this.Volume = Volume;
    }

}
