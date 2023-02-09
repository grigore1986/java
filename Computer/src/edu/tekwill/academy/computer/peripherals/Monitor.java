package edu.tekwill.academy.computer.peripherals;

public class Monitor {
    private String Marca;
    private String Model;
    private int Diagonala;

    public Monitor(String Marca, String Model, int Diagonala) {
        this.Marca = Marca;
        this.Model = Model;
        this.Diagonala = Diagonala;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getDiagonala() {
        return Diagonala;
    }

    public void setDiagonala(int Diagonala) {
        this.Diagonala = Diagonala;
    }
}
