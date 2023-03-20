import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       // Cream o lista Employee
        List<Employee>employees = new ArrayList<>();
        employees.add(new Employee("Grigore","Management", 37, true));
        employees.add(new Employee("Artiom", "IT", 36, false));
        employees.add(new Employee("Alina", "Management",24,true));
        employees.add(new Employee("Tatiana", "Management", 28, true));
        employees.add(new Employee("Cristina","Management", 29,true));
        employees.add(new Employee("Cristina","Management", 29,true));
        employees.add(new Employee("Mihail","IT",34,false));
        employees.add(new Employee("Nicolae","Management", 30,true));
        employees.add(new Employee("Ion", "IT", 31, false));
        employees.add(new Employee("Catalin","Management",31,true));
        employees.add(new Employee("Ionela","Software",32, true));
        employees.add(new Employee("Iura","Software", 41,false));
        employees.add(new Employee("Rodica", "Software",36,false));
        employees.add(new Employee("Eugen","Software",45,true));

        // filtram lista de employees care vor conduce interviul si primesc bani pe ora si au virsta dela 25 ani
        //Se utilizează metoda stream() pentru a transforma lista de angajați într-un flux de date (stream).
        List<Employee>filteredEmployees = employees.stream()
                //Se aplică metoda filter() de mai multe ori pentru a filtra angajații care îndeplinesc anumite condiții,
                // cum ar fi faptul că sunt plătiți pe oră, au peste 25 de ani și fac parte din departamentul "Management".
                .filter(e -> e.getDepartment().equals("Management")) //Filtram angajatii din departamentul management
                .filter(e -> e.isPayedPerHour()) //Filtram angajatii care sunt platiti pe ora
                .filter(e -> e.getAge() > 25) // Filtram angajatii care au peste 25 ani
                .distinct() // eliminam angajatii dublicati
                .limit(5) //limitam lista de afisare maxim 5 angajati
                .collect(Collectors.toList()); // afiseaza rezultatele filtrate intro lista

        //Se utilizează metoda forEach() pentru a afișa fiecare angajat din lista filtrată la consolă,
        // folosind referința de metodă System.out::println.
        filteredEmployees.forEach(System.out::println);

// filtram listă cu numele angajaților în ordine alfabetică care nu sunt plătiți pe oră și au vârsta mai mare de 30 de ani
List<String>filteredNames = employees.stream()//  stream cu lista de angajați
        .filter(e -> !e.isPayedPerHour())// filtrează angajații care nu sunt plătiți pe oră
        .filter(e -> e.getAge() > 30)// filtrează angajații care au vârsta mai mare de 30 de ani
        .map(Employee::getName)// mapam angajații rămași pentru a obține numele lor
       .sorted()// sortează numele în ordine alfabetică
       .collect(Collectors.toList());
        System.out.println("Numele angajatilor in ordine alfabetica care nu sunt platiti pe ora si virsta e mai mare de 30 ani");
        System.out.println(filteredNames); // afișează numele angajaților selectați

        Optional<Employee> result = employees.stream()// stream cu lista de angajați
                .filter(e -> e.getDepartment().equals("Software"))// filtrează angajații din departamentul Software
                .filter(Employee::isCanLeadInterviews)// filtrează angajații care pot conduce interviuri
                .filter(Employee::isCanAttendTraining)// filtrează angajații care pot participa la traininguri
                .findFirst();// găsim primul angajat care îndeplinește criteriile
        System.out.println("Afișează angajatul găsit");
        result.ifPresent(System.out::println);// afișează angajatul găsit
    }
}