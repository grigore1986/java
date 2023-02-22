public class ElefantErbivor extends Erbivor {
    private String nume;

    public ElefantErbivor(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void manancaPlante() {
        System.out.println("Elefantul erbivor mananca plante.");
    }

    @Override
    public void mananca() {
        System.out.println("Elefantul erbivor mananca plante, iarba si frunze.");
    }

    @Override
    public void alearga() {
        System.out.println("Elefantul erbivor alearga in savana.");
    }
}
