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
        try {
            DivisibleBy7Counter counter = new DivisibleBy7Counter();
            int count = counter.countDivisibleBy7Numbers(10, 50);
            System.out.println("Numerele divizibile cu 7 din intervalul dat sunt: " + count);
        } catch (InvalidRangeException e) {
            e.printStackTrace();
        }
    }

    }
