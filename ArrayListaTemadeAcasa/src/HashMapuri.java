
import java.util.HashMap;
public class HashMapuri {
    public static void main(String[] args) {


        HashMap<String, String> dictionar = new HashMap<String, String>();
        dictionar.put("apple", "mar");
        dictionar.put("car","masina");
        dictionar.put("snow","zapada");
        dictionar.put("winter","iarna");
        dictionar.put("summer","vara");
        dictionar.put("cat","pisica");
        dictionar.put("dog","ciine");
        dictionar.put("mouse","soarece");
        dictionar.put("snake","sarpe");
        dictionar.put("saturday","simbata");

        System.out.println("Dictionar englez-roman");
        for(String cuvintEnglez : dictionar.keySet()){
            String cuvintRoman = dictionar.get(cuvintEnglez);
            System.out.println(cuvintEnglez + " - " + cuvintRoman);
        }
    }
}
