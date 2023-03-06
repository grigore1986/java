import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {//AICI SUNT 2 METODE DE REZOLVARE
//        List<Animal> animal = new ArrayList<>();
//        animal.add(new Elefant("Jumbo", 13));
//        animal1.add(new Leu("King", 10));
//        animal1.add(new Lup("Wolf", 8));
//        animal1.add(new Jaguar("Jaguar", 6));
//        animal1.add(new Zebra("Dido", 9));


        Zoo myzoo = new Zoo();
        myzoo.addAnimal(new Elefant("Jumbo", 13));
        myzoo.addAnimal(new Leu("King", 10));
        myzoo.addAnimal(new Lup("Wolf",8));
        myzoo.addAnimal(new Jaguar("Jaguar",6));
        myzoo.addAnimal(new Zebra("Dido", 9));

        Elefant jumbo = new Elefant("Jumbo", 13);// Cream obiectele pentru animale
        Leu king = new Leu("King", 10);
        Lup wolf = new Lup("Wolf", 8);
        Jaguar jaguar = new Jaguar("Jaguar", 6);
        Zebra dido = new Zebra("Dido", 9);
//        Zoo zoo = new Zoo();// Cream obiectul pentru Zoo
        myzoo.addAnimal(jumbo);// Adaugam animalele in Zoo
        myzoo.addAnimal(king);
        myzoo.addAnimal(wolf);
        myzoo.addAnimal(jaguar);
        myzoo.addAnimal(dido);
      myzoo.eatAnimal("Frunze");// Hranim animalele cu frunze si carne
        myzoo.eatAnimal("Carne");
//        List<Animal> animals = myzoo.getAnimal();// Obtinem o lista cu animalele din Zoo

        // Parcurgem lista de animale si afisam numele si varsta fiecaruia
        // for (Animal animal : animals) {
        for (Animal animal : myzoo.getAnimal()) {
            System.out.println("Numele animalului este: " + animal.getName());
            System.out.println("Varsta animalului este: " + animal.getAge());
            // Obtinem lista de alimente ale animalului si o afisam
            List<String> food = animal.getFood();
            System.out.println("Alimente:");
            for (String f : food) {
                System.out.println("- " + f);
            }
        }

//            List<String> food = animal.getFood();
//            System.out.println("Alimente:");
//            if (food.isEmpty()) {
//                System.out.println("- Nicio alimentație specificată");
//            } else {
//                for (String f : food) {
//                    System.out.println("- " + f);
//                }
//            }

        }
    }