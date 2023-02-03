public class Student extends Person {
    public Student(String nume, int ani, String orasul, String munca) {
        super(nume, ani, orasul, munca);

    }

    public void gotoscholl() {
    }

    private String Namescholl = "Budesti";

    public String getNamescholl() {
        return this.Namescholl;
    }

    public void setNamescholl(String Namescholl) {
        this.Namescholl = Namescholl;
    }

}
