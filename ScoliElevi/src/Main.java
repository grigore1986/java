import elevi.Elevi;
import invatatori.Invatatori;
import scoli.Scoli;

public class Main {
    public static void main(String[] args) {
        Scoli scoala = new Scoli("Liceul Kirill si Mefodii", "Str. Petru Hasdeu, nr. 23");

        Invatatori profesor1 = new Invatatori("Popescu", "Ion", "Matematica", 35, 10);
        Invatatori profesor2 = new Invatatori("Ionescu", "Maria", "Fizica", 40, 15);

        Elevi elev1 = new Elevi("Dumitrescu", "Andrei", 16, 10);
        Elevi elev2 = new Elevi("Georgescu", "Ana", 15, 9);
        Elevi elev3 = new Elevi("Borta", "Timofei",10,4);

        scoala.adaugaProfesor(profesor1);
        scoala.adaugaProfesor(profesor2);
        scoala.adaugaElev(elev1);
        scoala.adaugaElev(elev2);
        scoala.stergeElev(elev1);
        scoala.adaugaElev(elev3);

        // Exemplu de afișare a profesorilor din școală
        System.out.println("Profesori în școală:");
        for (Invatatori profesor : scoala.getProfesori()) {
            System.out.println(profesor.getNume() + " " + profesor.getPrenume() + " - " + profesor.getSpecializare());
        }

        // Exemplu de afișare a elevilor din școală
        System.out.println("\nElevi în școală:");
        for (Elevi elevi : scoala.getElevi()) {
            System.out.println(elevi.getNumeElev() + " " + elevi.getFamiliaElev() + " - Clasa " + elevi.getClasa());
        }
    }
}