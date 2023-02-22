public interface Animal {
    String getNume();
    void setNume(String nume);
    void mananca();
    void alearga();
    default void doarme() {
        System.out.println("Animalul doarme.");
    }
    static int varstaMaxima() {
        return 100;
    }
}
