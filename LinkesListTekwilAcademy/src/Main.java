import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
// Punctul 1
        LinkedHashMap<Integer,String>linkedHashMap = new LinkedHashMap<>();
        // Adaugam elementele
        linkedHashMap.put(1,"Valuarea 1");
        linkedHashMap.put(2,"Valuarea 2");
        linkedHashMap.put(3,"Valuarea 3");
        // Afisarea LinkedHashMap
        System.out.println("LinkedHashMap este " + linkedHashMap);
        // Punctul 2
        LinkedHashSet<String>linkedHashSet = new LinkedHashSet<>();
        //Parcurgeți LinkedHashMap și adăugați valorile în LinkedHashSet
        for (Map.Entry<Integer,String> entry : linkedHashMap.entrySet()) {
          linkedHashSet.add(entry.getValue());
        }
        // Afisarea LinkedHashSet
        System.out.println("LinkedHashSet este " + linkedHashSet);
        // Punctul 3
        LinkedList<Integer>linkedList = new LinkedList<>();
        // Parcurgeți LinkedHashMap și adăugați cheile în LinkedList
        for (Map.Entry<Integer,String> entry : linkedHashMap.entrySet()) {
          linkedList.add(entry.getKey());
        }
        // Afisarea LinkedList
        System.out.println("LinkedList este " + linkedList);

    }
}
/*
    1. Creați un LinkedHashMap
    2. Parcurgeți linkedHashMap creat și adăugați valorile în un LinkedHashSet
    3. Parcurgeți linkedHashMap creat și adăugați cheile în un LinkedList
    4. Calculați complexitatea acestor operațiuni
Punctul 1:
Crearea unui LinkedHashMap și adăugarea elementelor: O(1) pentru fiecare element adăugat.
În acest caz, adăugăm 3 elemente, deci complexitatea este O(3), dar în notația Big O se reduce la O(1).
Punctul 2:
Parcurgerea LinkedHashMap și adăugarea valorilor într-un LinkedHashSet: O(n), deoarece trebuie să parcurgem fiecare element
 din LinkedHashMap. În acest caz, avem 3 elemente, deci complexitatea este O(3), dar în notația Big O se reduce la O(n).
Punctul 3:
Parcurgerea LinkedHashMap și adăugarea cheilor într-un LinkedList: O(n), deoarece trebuie să
parcurgem fiecare element din LinkedHashMap. În acest caz, avem 3 elemente, deci complexitatea este O(3),
 dar în notația Big O se reduce la O(n).
Astfel, complexitatea totală a acestor operațiuni este O(1) + O(n) + O(n), care se poate simplifica la O(n),
 unde n reprezintă numărul de elemente din LinkedHashMap.
 */