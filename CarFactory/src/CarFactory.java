public class CarFactory {

    String name;
    int age;
    int carsCount;

    public CarFactory(String name, int age, int carsCount) {
        this.name = name;
        this.age = age;
        this.carsCount = carsCount;
    }

    public void printFactoryInfo() {
        System.out.println("Наша автомобильная фабрика называется " + this.name);
        System.out.println("Она была основана " + this.age + " лет назад");
        System.out.println("За это время на ней было произведено " + this.carsCount +  " автомобилей");
        if (this.age > 0) {
            System.out.println("В среднем она производит " + (this.carsCount/this.age) + " машин в год");
        } else {
            System.out.println("Фабрика еще не начала производство");
        }
    }

    public static void main(String[] args) {
        CarFactory ford = new CarFactory("Amigo Motors", 0 , 1000);
        ford.printFactoryInfo();
    }
}