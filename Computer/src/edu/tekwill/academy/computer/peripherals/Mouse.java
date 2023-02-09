package edu.tekwill.academy.computer.peripherals;

public class Mouse {
    private String Marca;
    private String Model;
    private int DPi;

    public Mouse(String Marca, String Model, int DPi) {
        this.Marca = Marca;
        this.Model = Model;
        this.DPi = DPi;
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
    public int getDPi() {
        return DPi;
    }
    public  void  setDPi(int DPi) {
        this.DPi = DPi;
    }
}
