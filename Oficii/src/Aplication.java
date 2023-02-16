import oficce.Angajat;
import oficce.Companie;

public class Aplication {
    public static void main(String[] args) {

        Companie companie = new Companie();

        Angajat angajati[] = new Angajat[20];
        angajati[0] = new Angajat("Ion", 15000);
        angajati[1] = new Angajat("Vasile", 10000);

        companie.addNewOffice("Oficiul 1", "Back Office", angajati);

        Angajat angajati2[] = new Angajat[20];
        angajati2[0] = new Angajat("Mihai", 20000);
        angajati2[1] = new Angajat("Gheorghe", 30000);

        companie.addNewOffice("Oficiul 2", "IT Department", angajati2);

        System.out.println("Salariu mediu per angajat: " + companie.calculeazSalariuMediuAngajat());

    }
}