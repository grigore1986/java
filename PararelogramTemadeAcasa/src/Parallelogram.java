public class Parallelogram {
    // Metoda pentru calcularea perimetrului pentru un dreptunghi sau un paralelogram
    // luând în considerare lungimea și lățimea
    public int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    // Metoda pentru calcularea perimetrului pentru un pătrat sau un romb
    // luând în considerare lungimea laturii
    public int calculatePerimeter(int sideLength) {
        return 4 * sideLength;
    }

    // Metoda pentru calcularea ariei pentru un dreptunghi sau un paralelogram
    // luând în considerare lungimea și lățimea
    public double calculateArea(int length, double width) {
        return length * width;
    }

    // Metoda pentru calcularea ariei pentru un pătrat sau un romb
    // luând în considerare lungimea laturii
    public int calculateArea(int sideLength) {
        return sideLength * sideLength;
    }
}