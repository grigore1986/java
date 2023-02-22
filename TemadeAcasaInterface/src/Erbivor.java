public abstract class Erbivor implements Animal {
    protected int greutate;

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void afiseazaGreutate() {
        System.out.println("Greutatea este " + greutate + " kg.");
    }

    public abstract void manancaPlante();
}
