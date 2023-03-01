public class Employee  {
    private String name;
    private long salariu;
    private int aniVechime;
    // constructor
    public Employee(String name, int salariu, int aniVechime){
        this.name = name;
        this.salariu = salariu;
        this.aniVechime = aniVechime;

    }
    // metode getter si setter pentru variabilele de instanta
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalariu() {
        return salariu;
    }

    public void setSalariu(long salariu) {
        this.salariu = salariu;
    }

    public int getAniVechime() {
        return aniVechime;
    }

    public void setAniVechime(int aniVechime) {
        this.aniVechime = aniVechime;
    }
}
