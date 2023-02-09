public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println(circle.calculateLength());
        System.out.println(circle.calculateArea());
        Circle circle1 = new Circle(9);
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculateLength());
    }
}