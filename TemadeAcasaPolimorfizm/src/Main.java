public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.getName());
        System.out.println("Culoarea lui este "+ Color.Albastru);

        Circle circle = new Circle();
        System.out.println(circle.getName());
        System.out.println("Culoarea lui este "+Color.Rosu);

        Shape shape = new Square();
        System.out.println(square.getName());
        System.out.println("Culoarea lui este " +Color.Verde);

        Circle shape1 = new Square();



    }
}