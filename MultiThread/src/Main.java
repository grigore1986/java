
import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // definim lista de afișat
        List<String>mylist = Arrays.asList("Unu", "Doi", "Trei", "Patru");
        System.out.println(mylist);
        // cream un obiect ListPrinter și îl folosim pentru a crea un Thread
        PrintareaListei<String>printareaListei = new PrintareaListei<>(mylist);
        System.out.println(printareaListei);
        Thread printareaListeiThread = new Thread(printareaListei);
        sleep(2000);
        // pornim thread-ul
        printareaListeiThread.start();


    }
}