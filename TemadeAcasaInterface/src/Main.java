public class Main {
    public static void main(String[] args) {

        Animal animal = new Elefant("Dumbo");
        animal.setNume("Mickey");
        System.out.println("Numele animalului este " + animal.getNume());
        animal.mananca();
        animal.alearga();
        animal.doarme();
        System.out.println("Varsta maxima a unui animal este " + Animal.varstaMaxima());


        Erbivor erbivor = new ElefantErbivor("Dumbo Jr.");
        erbivor.setGreutate(2000);
        erbivor.afiseazaGreutate();
        erbivor.setNume("Minnie");
        System.out.println("Numele animalului este " + erbivor.getNume());
        erbivor.mananca();
        erbivor.manancaPlante();
        erbivor.alearga();
        erbivor.doarme();
        System.out.println("Varsta maxima a unui animal este " + Animal.varstaMaxima());
    }


}
