package elevi;

public class Elevi {
    private String numeElev;
    private String familiaElev;
    private int virstaElev;
    private int clasa;

    // Constructor
    public Elevi(String nume, String familia, int virsta, int clasa) {
        this.numeElev = nume;
        this.familiaElev = familia;
        this.virstaElev = virsta;
        this.clasa = clasa;
    }

    // Metodele get pentru a obține valorile atributelor private
    public String getNumeElev() {
        return numeElev;
    }

    public String getFamiliaElev() {
        return familiaElev;
    }

    public int getVirstaElev() {
        return virstaElev;
    }

    public int getClasa() {
        return clasa;
    }

    // Metodele set pentru a seta valorile atributelor private
    public void setNumeElev(String numeElev) {
        this.numeElev = numeElev;
    }

    public void setFamiliaElev(String familiaElev) {
        this.familiaElev = familiaElev;
    }

    public void setVirstaElev(int virstaElev) {
        this.virstaElev = virstaElev;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    // Metoda care returnează denumirea completă a elevului
    public String getDenumireElev() {
        return this.getNumeElev() + " " + getFamiliaElev();
    }
}
