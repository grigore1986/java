public class Carte {
    private String denumire;

    public Carte(String denumire){
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "denumire='" + denumire + '\'' +
                '}';
    }
}
