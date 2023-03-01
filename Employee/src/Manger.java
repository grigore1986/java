public class Manger extends Employee implements Interview, Training {


    private String fullName;
    private String departament;

    // constructor
    public Manger(String name, int salariu, int aniVechime) {
        super(name, salariu, aniVechime);
    }

    // metode getter si setter pentru variabilele de instanta
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }


    @Override
    public void attendTraining() {

        System.out.println("Managerul " + getName() + " este in training");

    }


    @Override
    public void conductInterview() {
        System.out.println("Mangerul " + getName() + " conduce interviul");

    }
}
