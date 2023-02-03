
public class Test {

    public static String lastNameSerched = "";

    public static void main(String[] args) {

        Student andrian = new Student("Andrian", 27, "Gussago", "Software developer");
        Person tania = new Person("Tania", 38, "Chisinau", "Nails");
        Person grisa = new Person("Grisa", 37, "Chisinau", "Developer");
        andrian.setnume("dima");
        andrian.celebrateBirthDay();
        tania.changeJob("Driver", 40000.0);
        andrian.celebrateBirthDay();
        grisa.studyJava();
        andrian.getnume();
        andrian.getretributie();
        lastNameSerched = andrian.getnume();
        andrian.gotoscholl();
    }
}

