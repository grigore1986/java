public class Animale {
    private String nume;
    private String food;
    // cream constructorul Animalului
    public Animale(String nume,String food){
        this.nume = nume;
        this.food = food;
    }
// cream getere pentru nume si food
    public String getNume() {
        return nume;
    }

    public String getFood() {
        return food;
    }
    // cream metoda de hrana cum sa fie afisata
    public void feed(){
        System.out.println("Animalul "+ nume +" se aliminteaza cu " + food);
    }
}
