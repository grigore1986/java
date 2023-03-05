import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elefant jumbo = new Elefant("Jumbo", 13);// Cream obiectele pentru animale
        Leu king = new Leu("King", 10);
        Lup wolf = new Lup("Wolf", 8);
        Jaguar jaguar = new Jaguar("Jaguar", 6);
        Zebra dido = new Zebra("Dido", 9);
        Zoo myzoo = new Zoo();// Cream obiectul pentru Zoo
        myzoo.addAnimal(jumbo);// Adaugam animalele in Zoo
        myzoo.addAnimal(king);
        myzoo.addAnimal(wolf);
        myzoo.addAnimal(jaguar);
        myzoo.addAnimal(dido);
        myzoo.eatAnimal("Frunze");// Hranim animalele cu frunze si carne
        myzoo.eatAnimal("Carne");
        List<Animal> animals = myzoo.getAnimal();// Obtinem o lista cu animalele din Zoo

        // Parcurgem lista de animale si afisam numele si varsta fiecaruia
        for (Animal animal : animals) {
            System.out.println("Numele animalului este: " + animal.getName());
            System.out.println("Varsta animalului este: " + animal.getAge());
        // Obtinem lista de alimente ale animalului si o afisam
            List<String> food = animal.getFood();
            System.out.println("Alimente:");
            for (String f : food) {
                System.out.println("- " + f);
            }
        }


    }
}