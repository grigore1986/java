public abstract class Erbivor extends Elefant implements Animal {
    // definim o variabilă privată pentru numele erbivorului
    private String nume;

    // definim un constructor pentru a seta numele erbivorului
    public Erbivor(String nume) {

        this.nume = nume;
    }

    // definim o metodă cu corp de metodă pentru a afișa numele erbivorului
    public void afiseazaNume() {
        System.out.println("Numele erbivorului este" + nume);
    }

    // definim o metodă abstractă pentru a specifica ce plante mănâncă erbivorul
    public abstract void manincaPlante();
}
