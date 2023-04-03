public class Main {
    public static void main(String[] args) {

        try {
            Person person = new Person("Grigore", "Borta", 37);
            Person person1 = new Person("", "Dirca", 36);
            Person person2 = new Person("Ana", null, 43);
            Person person3 = new Person("Artiom", "Stratulat", -5);
            Person person4 = new Person("Tatiana", "Borta", 200);
        } catch (InvalidNameException | InvalidAgeException e) {
           e.printStackTrace();
        }


    }
}