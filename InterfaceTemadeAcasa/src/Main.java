public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant("Jumbo", 20);
        System.out.println("Name: " + elephant.getName());
        System.out.println("Age: " + elephant.getAge());
        elephant.setName("Dumbo");
        elephant.setAge(10);
        System.out.println("New name: " + elephant.getName());
        System.out.println("New age: " + elephant.getAge());
        System.out.println("Type: " + elephant.getType());
        System.out.println("Numarul de picioare: " + Animal.picioare );
        System.out.println(Animal.getInfo());








    }
}