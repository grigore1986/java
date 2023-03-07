import java.util.Objects;

public class Person {
    // declararea variabilelor private
    private String name;
    private int age;

    // constructorul pentru clasa Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // metodele getter si seter pentru ele
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ege) {
        this.age = age;
    }

    // metoda equals - compara doua obiecte de tip Person
    @Override
    public boolean equals(Object obj) {
        // verificam daca cele doua obiecte sunt identice
        if (obj == this) {
            return true;
        }
        // verificam daca obiectul comparat este de tip Person
        if (!(obj instanceof Person)){
            return false;
        }
        // castam obiectul la tipul Person
        Person altul =(Person) obj;
        // verificam daca cele doua obiecte au aceleasi variabile pentru name si age
        return this.name.equals(altul.name)&&this.age == altul.age;
    }
    // metoda hashCode - calculeaza valoarea hash a obiectului

    @Override
    public int hashCode() {
        int result = 21;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.age;
        return result;
    }
    // metoda toString - afiseaza reprezentarea string a obiectului


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}