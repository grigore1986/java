public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ion", "I. Cebotari");
        Student student = new Student("Vasile", "M.eminescu", "PHP", 3, 6000);
        Staff staff = new Staff("Andrei", "V. Alexandrii", "Tekwill", 8000);

        
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}