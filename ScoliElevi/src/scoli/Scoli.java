package scoli;

import elevi.Elevi;
import invatatori.Invatatori;

import java.util.ArrayList;
import java.util.List;

public class Scoli {
    private String denumirea;
    private String adresa;
    private List<Invatatori> profesori;
    private List<Elevi> elevi;

    // Constructor
    public Scoli(String denumire, String adresa) {
        this.denumirea = denumire;
        this.adresa = adresa;
        this.profesori = new ArrayList<>();
        this.elevi = new ArrayList<>();
    }

    // Metoda pentru adăugarea unui profesor
    public void adaugaProfesor(Invatatori profesor) {
        profesori.add(profesor);
    }

    // Metoda pentru ștergerea unui profesor
    public void stergeProfesor(Invatatori profesor) {
        profesori.remove(profesor);
    }

    // Metoda pentru adăugarea unui elev
    public void adaugaElev(Elevi elev) {
        elevi.add(elev);
    }

    // Metoda pentru ștergerea unui elev
    public void stergeElev(Elevi elev) {
        elevi.remove(elev);
    }

    // Metoda pentru a returna lista de profesori
    public List<Invatatori> getProfesori() {
        return profesori;
    }

    // Metoda pentru a returna lista de elevi
    public List<Elevi> getElevi() {
        return elevi;
    }
}
