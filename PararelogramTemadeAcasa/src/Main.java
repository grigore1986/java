public class Main {
    // Metoda main pentru a crea și afișa obiecte de tipul Parallelogram
    public static void main(String[] args) {
        // Crearea unui obiect de tip dreptunghi cu lungimea 6 și lățimea 4
      Parallelogram parallelogram = new Parallelogram();
      int legth = 6 ;
      int width = 4;
      int perimetrparallelogram = parallelogram.calculatePerimeter(legth,width);
      double areaparallelogram = parallelogram.calculateArea(legth,width);
        System.out.println("Dreptunghi lungimea ="+legth+", latimea ="+width+ ", perimetrul ="+perimetrparallelogram+", area ="
        +areaparallelogram);
    }
}
