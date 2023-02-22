public class Elefant implements Animal {

    private String nume;

    public Elefant(String nume) {
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
    public void mananca() {
        System.out.println("Elefantul mananca iarba si frunze.");
    }

    @Override
    public void alearga() {
        System.out.println("Elefantul alearga in padure.");
    }
}
