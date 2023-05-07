import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String file = "text.txt";
        // Punctul 1: Creați fișierul și adăugați textele, fiecare pe un rând nou
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            // Adăugăm textele în fișier
            writer.write("Textul 1");
            writer.newLine();
            writer.write("Textul 2");
            writer.newLine();
            writer.write("Textul 3");
            writer.newLine();
            writer.write("Textul 4");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Fișierul a fost creat și textele au fost adăugate.");
        // Punctul 2: Utilizați fluxurile pentru a citi textul din fișier
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            // Citim și afișăm fiecare linie din fișier
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Punctul 3: Utilizați buffer la citire
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line1;
            // Citim fiecare linie din fișier și o adăugăm la conținutul StringBuilder
            StringBuilder content = new StringBuilder();
            while ((line1 = reader.readLine()) != null){
                content.append(line1).append("\n");
            }
            System.out.println(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Punctul 4: Salvați textele într-o listă
        List<String> textList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String list;
            // Citim fiecare linie din fișier și o adăugăm în lista de texte
            while ((list = reader.readLine()) != null){
                textList.add(list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Textele au fost salvate in lista");
        System.out.println("Lista de texte " +textList);
        // Punctul 5: Modificați textele pentru a fi cu litere mari
        List<String>upperCaseTextList = new ArrayList<>();
        for(String text : textList) {
            // Convertim fiecare text la litere mari și le adăugăm în lista de texte cu litere mari
            String upperCaseText = text.toUpperCase();
            upperCaseTextList.add(upperCaseText);
        }
        System.out.println("Textul este modificat si este cu litere mari");
        System.out.println("Lista de text cu litere mari " + upperCaseTextList);
        // Punctul 6: Scrieți conținutul listei într-un fișier folosind buffer și flux
        String outFilePath = "text_uppercase.txt";
        try(BufferedWriter upWrite = new BufferedWriter(new FileWriter(outFilePath))){
            // Scriem fiecare text cu litere mari în fișier, fiecare pe un rând nou
            for (String text : upperCaseTextList) {
               upWrite.write(text);
               upWrite.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Continutul Listei a fost scris in fisier");
    }
}
/*
    1. Creați pe disk un fișier care va conține texte, fiecare text fiind din rînd nou
    2. Folosiți fluxurile pentru a citi textul din fișier
    3. Folosiți Buffer la citire
    4. Salvați textele în o listă
    5. Modificați textele așa ca toate să fie cu litere mari
    6. Scriți conținutul liste în un fișier folosind Buffer și Flux
 */