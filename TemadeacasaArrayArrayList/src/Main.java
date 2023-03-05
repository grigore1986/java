import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elefant jumbo = new Elefant("Jumbo", 13);
        Leu king = new Leu("King",10);
        Lup wolf = new Lup("Wolf",8);
        Jaguar jaguar = new Jaguar("Jaguar", 6);
        Zebra dido = new Zebra("Dido", 9);
   Zoo myzoo = new Zoo();
   myzoo.addAnimal(jumbo);
   myzoo.addAnimal(king);
   myzoo.addAnimal(wolf);
   myzoo.addAnimal(jaguar);
   myzoo.addAnimal(dido);
   myzoo.eatAnimal("Frunze");
   myzoo.eatAnimal("Carne");
        List<Animal> animals = myzoo.getAnimal();
        for (Animal animal : animals) {
            System.out.println("Numele animalului este: " + animal.getName());
            System.out.println("Varsta animalului este: " + animal.getAge());

            List<String> food = animal.getFood();
            System.out.println("Alimente:");
            for (String f : food) {
                System.out.println("- " + f);
            }
        }




    }
}