public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.name();
        System.out.println("Culoarea lui este "+ Color.Albastru);

        Circle circle = new Circle();
        circle.name();
        System.out.println("Culoarea lui este "+Color.Rosu);

        Shape shape = new Square();
       shape.name();
        System.out.println("Culoarea lui este " +Color.Verde);

        Circle square1 = new Square();
        square1.name();
        System.out.println("Culoarea lui este " +Color.Galben);



    }
}