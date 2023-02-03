public class Person {
    private String nume;
    private double retributie;
    private int ani;
    private String orasul;
    private String munca;

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

    public void setnume(String newname) {
        this.nume = newname;
    }

    public String getnume() {
        return this.nume;
    }

    public double getretributie() {
        return this.retributie;
    }

    public void setRetributie(double retributie) {
        this.retributie = retributie;
    }

    public void setAni(int ani) {
        this.ani = ani;
    }

    public void setMunca(String munca) {
        this.munca = munca;
    }

    public String getmunca() {
        return this.munca;
    }
}
