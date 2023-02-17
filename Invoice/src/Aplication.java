public class Aplication {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("ABC123", "Televizor Samsung 50 inch", 2, 1999.99);
        System.out.println("Suma facturii este: " + invoice.getAmount());
    }
}