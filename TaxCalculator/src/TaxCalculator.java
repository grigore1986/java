public class TaxCalculator {
    public static void main(String[] args) {
        double price = 14.456;
        double tax = 13.234;
        int quantity = 23;
        double total = 0;
        
        String message = "I want to buy " +quantity+ " shirt!";
        System.out.println(message);

        total = price * quantity * tax;
        System.out.println("Total cost with tax is: "+total );

    }
}