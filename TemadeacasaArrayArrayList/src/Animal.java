import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private   int age;
    private List<String> food;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        this.food = new ArrayList<>();
    }

    public List<String> getFood() {
        return food;
    }

    public void setFood(List<String> food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void aadFood(String food){
        this.food.add(food);
    }
    void removeFood(String food){
        this.food.remove(food);
    }


}
