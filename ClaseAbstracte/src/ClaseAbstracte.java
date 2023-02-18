import auto.Limousine;
import auto.Hachtback;

public class ClaseAbstracte {
    public static void main(String[] args) {
        Limousine limousine = new Limousine();
        limousine.method(1, "Marca");  // overloading
        limousine.method(1);

        Hachtback hachtback = new Hachtback();



    }
}