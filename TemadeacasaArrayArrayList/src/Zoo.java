import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(){
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animals) {
        this.animals.add(animals);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }
    public List<Animal> getAnimal() {
        return animals;
    }

    public void eatAnimal(String food) {
        for (Animal animal : animals) {
            animal.aadFood(food);
        }
    }
}
