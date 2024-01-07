package invatatori;

public class Invatatori {
    private String nume;
    private String prenume;
    private String specializare;
    private int varsta;
    private int aniExperienta;

    // Constructor
    public Invatatori(String nume, String prenume, String specializare, int varsta, int aniExperienta) {
        this.nume = nume;
        this.prenume = prenume;
        this.specializare = specializare;
        this.varsta = varsta;
        this.aniExperienta = aniExperienta;
    }

    // Metodele get pentru a obține valorile atributelor private
    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getSpecializare() {
        return specializare;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }
}
