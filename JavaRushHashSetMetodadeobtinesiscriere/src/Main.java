import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Definim un array de String-uri cu 8 elemente
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
// Parcurgem array-ul cu un for loop si afisam fiecare element pe rand
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
// Afisam o linie separatoare pentru a delimita afisajul
        System.out.println("___________________________________");


        // Apelam metoda arrayToHashSet cu array-ul ca argument si salvam rezultatul in hashSet
        HashSet<String> hashSet = arrayToHashSet(array);
        // Parcurgem HashSet-ul cu un for-each loop si afisam fiecare element pe rand
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        // Cream un nou obiect HashSet de tip String
        HashSet<String> str = new HashSet<>();
        // Parcurgem array-ul cu un for loop si adaugam fiecare element in HashSet
        for(int i = 0; i < strings.length; i++){
            str.add(strings[i]);
        }
        // Returnam HashSet-ul completat
        return str;
    }
}
    
