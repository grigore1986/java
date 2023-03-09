import java.util.ArrayList;

public class Main {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        // Verificam, că argumentul name nu este null
        if (name == null) {
            return; // daca este null, iesim din metoda fara sa facem nimic
        }

        // Căutăm name în lista waitingEmployees
        int index = waitingEmployees.indexOf(name);
        if (index == -1) {
            return; // daca nu am gasit name in lista, iesim din metoda fara sa facem nimic
        }

        // Adăugăm name în lista alreadyGotSalaryEmployees
        alreadyGotSalaryEmployees.add(name);

        // Înlocuim name cu null în lista waitingEmployees
        waitingEmployees.set(index, null);
    }
}
