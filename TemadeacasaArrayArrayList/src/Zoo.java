import java.util.ArrayList;
import java.util.List;

public class Zoo {
    // definim o listă de animale (obiecte de tip Animal)
    private List<Animal> animals;
    // constructorul clasei
    public Zoo(){
        // inițializăm lista de animale cu un obiect nou de tip ArrayList
        this.animals = new ArrayList<>();
    }
    // metoda pentru adăugarea unui animal în listă
    public void addAnimal(Animal animals) {
        this.animals.add(animals);
    }
    // metoda pentru eliminarea unui animal din listă
    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }
    // metoda pentru returnarea listei de animale
    public List<Animal> getAnimal() {
        return animals;
    }
    // metoda pentru hrănirea animalelor din listă
    public void eatAnimal(String food) {
        for (Animal animal : animals) {
            animal.aadFood(food);
        }
    }
}
