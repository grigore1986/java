public class Main {
    public static void main(String[] args) {

        Elefant elefant = new Elefant();
        elefant.sunet();
        elefant.eat();
        elefant.alearga();
        int virstaMaxima = Animal.virstaMax();
        System.out.println("Virsta maxima a animalului este " + virstaMaxima);


    }
}