public interface Animal {
    void eat();

    void sunet();

    // metoda statică care returnează varsta maximă a unui animal
    static int virstaMax() {
        return 100;
    }

    // metoda default pentru a afișa că animalul aleargă
    default void alearga() {
        System.out.println("El alearga");
    }
}
