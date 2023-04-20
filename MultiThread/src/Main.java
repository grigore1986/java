
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // definim lista de afișat
        List<String>mylist = Arrays.asList("Unu", "Doi", "Trei", "Patru");

        // cream un obiect ListPrinter și îl folosim pentru a crea un Thread
        PrintareaListei<String>printareaListei = new PrintareaListei<>(mylist);
        Thread printareaListeiThread = new Thread(printareaListei);

        // pornim thread-ul
        printareaListeiThread.start();
    }
}