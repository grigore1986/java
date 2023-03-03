import java.util.ArrayList;
import java.util.HashSet;
public class HashSeturi {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("Copac");
        liste.add("Iarba");
        liste.add("Copac");
        liste.add("Brandusa");
        liste.add("pasare");
        liste.add("Iarba");
        HashSet<String> colectieUnice = valoriUnice(liste);
        System.out.println(colectieUnice);
    }
    public static HashSet<String>valoriUnice(ArrayList<String>liste){
        HashSet<String>colectieUnice = new HashSet<String>(liste);
        return colectieUnice;
    }
}
