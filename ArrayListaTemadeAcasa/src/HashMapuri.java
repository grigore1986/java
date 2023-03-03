
import java.util.HashMap;

public class HashMapuri {
    public static void main(String[] args) {
        // Se creeaza o instanta a clasei HashMap de tip String pentru
        // a stoca perechile cuvint englezesc -cuvint roman
        HashMap<String, String> dictionar = new HashMap<String, String>();
        // Se adauga cuvinte in dictionar
        dictionar.put("apple", "mar");
        dictionar.put("car", "masina");
        dictionar.put("snow", "zapada");
        dictionar.put("winter", "iarna");
        dictionar.put("summer", "vara");
        dictionar.put("cat", "pisica");
        dictionar.put("dog", "ciine");
        dictionar.put("mouse", "soarece");
        dictionar.put("snake", "sarpe");
        dictionar.put("saturday", "simbata");
          // Se afiseaza titlul dictionarului
        System.out.println("Dictionar englez-roman");
        // Se parcurge dictionarul si se afiseaza fiecare pereche cuvint englezesc - cuvint roman
        for (String cuvintEnglez : dictionar.keySet()) {
            String cuvintRoman = dictionar.get(cuvintEnglez);
            System.out.println(cuvintEnglez + " - " + cuvintRoman);
        }
    }
}
