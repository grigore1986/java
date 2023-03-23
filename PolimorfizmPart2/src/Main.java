public class Main {
    public static void main(String[] args) {
//        // instantiem un obiect de tip Animal si il initializam cu valoarea 1
//        Animal animal = new Animal(1);
//        // instantiem un obiect de tip Person si il initializam cu numele "Bob"
//        Person person = new Person("Bob");
//        // apelam metoda sleep a obiectului animal
//        animal.sleep();
//        // apelam metoda sayHello a obiectului person
//        person.sayHello();
//        // apelam metoda showInfo a obiectului animal
//        animal.showInfo();
//        // apelam metoda showInfo a obiectului person
//        person.showInfo();
//
//
//        // instantiem un obiect de tip Info si il initializam cu obiectul animal
//        Info info = new Animal(1);
//        // instantiem un obiect de tip Info si il initializam cu obiectul person
//        Info info1 = new Person("Bob");
//        info.showInfo();
//        info1.showInfo();

       Dog dog = new Dog();
       Cat cat = new Cat();
       Animal animal = new Animal();
        System.out.println("Aici este polimorfizm");
       test(animal);
       test(dog);
       test(cat);

    }

    public static void test(Animal animal) {
        animal.sleep();
    }
}