import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private   int age;
    private List<String> food;

    public Animal(String name, int age){  // constructorul clasei
        this.name = name;
        this.age = age;
        this.food = new ArrayList<>();// inițializăm lista de alimente cu un obiect nou de tip ArrayList
    }

    public List<String> getFood() { // metoda pentru returnarea listei de alimente
        return food;
    }

    public void setFood(List<String> food) {// metoda pentru setarea listei de alimente
        this.food = food;
    }

    public String getName() {// metoda pentru returnarea numelui animalului
        return name;
    }

    public void setName(String name) { // metoda pentru setarea numelui animalului
        this.name = name;
    }

    public int getAge() {// metoda pentru returnarea vârstei animalului
        return age;
    }

    public void setAge(int age) {// metoda pentru setarea vârstei animalului
        this.age = age;
    }

    void aadFood(String food){// primește un nume de aliment și îl adaugă la lista
        this.food.add(food);
    }
    void removeFood(String food){//primește un nume de aliment și îl elimină din lista de alimente a animalului.
        this.food.remove(food);
    }


}
