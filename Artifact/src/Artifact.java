public class Artifact {
    private int number;
    private String cultura;
    private int secol;

    public Artifact(int number) {
        this.number = number;
    }

    public Artifact(String cultura, int number) {
        this.cultura = cultura;
        this.number = number;
    }

    public Artifact(String cultura, int number, int secol) {
        this.cultura = cultura;
        this.number = number;
        this.secol = secol;
    }

    public int getNumber() {
        return number;
    }

    public String getCultura() {
        return cultura;
    }

    public int getSecol() {
        return secol;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(23);
        Artifact artifact2 = new Artifact("Samun",23);
        Artifact artifact3 = new Artifact("Samun",23,8);

        System.out.println(artifact1.getNumber());
        System.out.println(artifact2.getNumber()+"/" + artifact2.getCultura());
        System.out.println(artifact3.getNumber()+"/" + artifact3.getCultura()+"/"+artifact3.getSecol());


    }
}
