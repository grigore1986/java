public class Automobil implements Comparable<Automobil> {
    private int anProducere;
    private String denumire;
    public Automobil(int anProducere,String denumire){
        this.anProducere = anProducere;
        this.denumire = denumire;
    }

    public int getAnProducere() {
        return anProducere;
    }

    public void setAnProducere(int anProducere) {
        this.anProducere = anProducere;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    // Sortăm mai întâi după anul de producție și apoi după denumire
    public int compareTo(Automobil automobil) {
        int compareAni = Integer.compare(this.anProducere,automobil.anProducere);
        if(compareAni ==0){
            return denumire.compareTo(automobil.denumire);
        }
        return compareAni;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "anProducere=" + anProducere +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
/*
Creați o clasă Automobil care va extinde Comparable și va avea parametrii: anProducere, denumire
 */
/*
Explicații:

Clasa Automobil implementează interfața Comparable cu genericul Automobil, ceea ce înseamnă că putem utiliza metoda compareTo
 pentru a compara două obiecte de tip Automobil.
Clasa Automobil are doi parametri de instanță: anProducere și denumire. Aceștia sunt stocați în câmpurile private
cu același nume.
Constructorul clasei Automobil primește ca parametri un an de producție și o denumire și inițializează câmpurile corespunzătoare.
Clasa Automobil are și getteri și setteri pentru cei doi parametri de instanță.
Metoda compareTo compară două obiecte de tip Automobil. Mai întâi, sortăm obiectele după anul de producție,
iar apoi după denumire. Metoda compareTo trebuie să returneze un număr negativ, zero sau pozitiv,
 în funcție de relația de ordine dintre cele două obiecte.
Clasa Automobil are și o metodă toString pentru a ne permite să afișăm obiectele într-un mod ușor de citit.
 */