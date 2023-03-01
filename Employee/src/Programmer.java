public class Programmer extends Employee implements Training{

    private String ocupatie;

    public Programmer(String name, int salariu, int aniVechime) {
        super(name, salariu, aniVechime);
    }


    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    @Override
    public void attendTraining() {
        System.out.println("Programatorul " +getName() +" este in training");
    }
}
