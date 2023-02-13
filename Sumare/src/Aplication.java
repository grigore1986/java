public class Aplication {
    public static void main(String[] args) {
        double a= 1;
        double count = 0;
        for (int i = 3; i < 100; i += 2) {
            count += a / i;
            a += 2;
            System.out.println(count);
        }
    }
}

