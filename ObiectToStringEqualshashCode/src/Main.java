import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Adaugarea unor persoane într-un HashSet
        Set<Person> person = new HashSet<>();
        person.add(new Person("Grigore", 37));
        person.add(new Person("Artiom", 41));
        person.add(new Person("Victor", 65));
        person.add(new Person("Ion", 63));
        person.add(new Person("Timofei", 9));
//Parcurgerea HashSet-ului și afișarea persoanelor cu vîrsta mai mare de 60 de ani
        for (Person persons:person) {
       if(persons.getAge() > 60){
           System.out.println(persons.toString());
       }
        }

    }
}