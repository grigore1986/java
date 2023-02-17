public class Invoice {
    private String model; // modelul dispozitivului
    private String description; // descrierea produsului
    private int quantity; // cantitatea de produse achiziționate
    private double price; // prețul pentru un produs

    // Constructorul clasei Invoice inițializează atributele cu valorile primite ca argumente
    public Invoice(String model, String description, int quantity, double price) {
        this.model = model;
        this.description = description;
        this.setQuantity(quantity);  // inițializarea cantității prin apelarea metodei setQuantity()
        this.setPrice(price);        // inițializarea prețului prin apelarea metodei setPrice()
    }

    // Metodele getter și setter pentru fiecare atribut al clasei
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        // Se asigură că valoarea cantității este pozitivă sau zero
        this.quantity = quantity < 0 ? 0 : quantity;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // Se asigură că valoarea prețului este pozitivă sau zero
        this.price = price < 0.0 ? 0.0 : price;
    }

    // Metoda getAmount calculează și returnează suma facturei ca un double
    public double getAmount() {
        return this.price * this.quantity;
    }
}