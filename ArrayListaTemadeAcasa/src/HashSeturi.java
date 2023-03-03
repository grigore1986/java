import java.util.ArrayList;
import java.util.HashSet;
public class HashSeturi {
    public static void main(String[] args) {
        // Se creeaza o instanta a clasei ArrayList de tip String
        ArrayList<String> liste = new ArrayList<String>();
        // Se adauga elemente de tip String in lista
        liste.add("Copac");
        liste.add("Iarba");
        liste.add("Copac");// element duplicat
        liste.add("Brandusa");
        liste.add("pasare");
        liste.add("Iarba"); // element duplicat
        // Se apeleaza metoda valoriUnice cu lista de mai sus ca argument
        HashSet<String> colectieUnice = valoriUnice(liste);
        // Se afiseaza colectia unica rezultata dupa eliminarea duplicatelor
        System.out.println(colectieUnice);
    }
    // Definirea metodei valoriUnice ce va elimina elementele
    // duplicate din lista de intrare si va returna o colectie unica
    public static HashSet<String>valoriUnice(ArrayList<String>liste){
        // Se creeaza o instanta a clasei HashSet de tip String, cu lista de intrare ca argument,
        // astfel incat sa se elimine elementele duplicate
        HashSet<String>colectieUnice = new HashSet<String>(liste);
        return colectieUnice;
    }
}
