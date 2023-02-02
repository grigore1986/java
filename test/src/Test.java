public class Test {
    public static void main(String[] args) {

        Person andrian = new Person("Andrian", 27, "Gussago", "Software developer");
        Person tania = new Person("Tania", 38, "Chisinau", "Nails");
        Person grisa = new Person("Grisa", 37, "Chisinau", "Developer");

        andrian.celebrateBirthDay();
        tania.changeJob("Driver", 40000.0);
        andrian.celebrateBirthDay();
        grisa.studyJava();

    }
}

class Person {
    public String nume;
    public double retributie;
    private int ani;
    public String orasul;
    public String munca;

    public Person(String nume, int ani, String orasul, String munca) {
        this.nume = nume;
        this.ani = ani;
        this.orasul = orasul;
        this.munca = munca;
    }

    public void celebrateBirthDay() {
        this.ani = this.ani + 1;
        System.out.println("Happy " + this.ani + "th BirthDay " + this.nume);
    }

    public void changeJob(String newJob, Double newRetributie) {
        System.out.println(this.nume + " is changing job from " + this.munca + " to " + newJob);
        this.munca = newJob;
        this.retributie = newRetributie;
    }

    public void studyJava() {
        System.out.println(this.nume + " is studing Java");
    }

    public int getAni() {
        return ani;
    }
}
