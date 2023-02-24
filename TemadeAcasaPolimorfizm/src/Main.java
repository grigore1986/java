public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.name();
        System.out.println("Culoarea lui este "+ Color.Albastru);

        Circle circle = new Circle();
         circle.name();
        System.out.println("Culoarea lui este "+Color.Rosu);

        Shape squareShape = new Square();
       squareShape.name();
        System.out.println("Culoarea lui este " +Color.Verde);

       Shape circleShape =  new Circle();
       circleShape.name();
        System.out.println("Culoarea lui este " +Color.Galben);



    }
}






