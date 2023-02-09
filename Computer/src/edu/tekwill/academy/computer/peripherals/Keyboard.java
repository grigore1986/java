package edu.tekwill.academy.computer.peripherals;

public class Keyboard {
    private String Marca;
    private String Model;
    private int Price;

    public Keyboard(String Marca, String Model, int Price) {
        this.Marca = Marca;
        this.Model = Model;
        this.Price = Price;
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
    public int getPrice() {
        return Price;
    }
    public  void  setPrice(int Price) {
        this.Price = Price;
    }
}
