// clasa Main contine metoda main() care instantiaza obiecte din clasele Circle, Square, Sphere si Cube
// si afiseaza suprafata si volumul fiecarei figuri geometrice
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.getArea());

        Square square = new Square(6);
        System.out.println("Square area: " + square.getArea());

        Sphere sphere = new Sphere(4);
        System.out.println("Sphere area: " + sphere.getArea());
        System.out.println("Sphere volume: " + sphere.getVolume());

        Cube cube = new Cube(3);
        System.out.println("Cube area:" + cube.getArea());
        System.out.println("Cube volume:" + cube.getVolume());
    }
}