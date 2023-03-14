import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Cream primul Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Unul", 1);
        map.put("Doi", 2 );
        map.put("Trei", 3);
        // Afisarea Mapului
        System.out.println("Afisarea Mapului");
        System.out.println(map);

        // Crearea al doilea Map
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);
        // Afisarea Mapului 2
        System.out.println("Afisarea Mapului 2");
        System.out.println(map2);

        // Crearea unului Queue și copierea valorilor Map-ului în Queue prin tipul Integer

        Queue<Integer> queue = new LinkedList<Integer>(map2.values());
        // Afisarea valorilor Queue
        System.out.println("Afisarea valorilor Queue");
        for(Integer value : queue) {
            System.out.println(value);
        }

        // Crearea unului Queue și copierea valorilor Map-ului în Queue prin tipul String
        Queue<String>queue2 = new LinkedList<>();
        for(Integer value1 : map2.values()){
            queue2.add(value1.toString());
        }
        // Afisarea valorilor Queue
        for (String value: queue2) {
            System.out.println( "Afisarea valorilor queue2 - "+ value);
        }

        // Crearea unui Stack și copierea valorilor Map-ului în Stack prin tip Integer
        // Si prin tip String este la fel
        Stack<Integer> stack = new Stack<>();
        for (Integer value: map.values()) {
            stack.push(value);
            
        }
        // Afisarea lui Stack
        System.out.println("Afisarea valorilor Stack");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        //Creare unui Queue cu valori
        Queue<String>stringQueue = new LinkedList<>();
        stringQueue.add("Primul");
        stringQueue.add("Doi");
        stringQueue.add("Trei");

        // Afisarea Queue stringQueue
        System.out.println("Afisarea valorilor stringQueue");
        System.out.println(stringQueue);

        //Crearea Mapului si copiera in el a Queue-lui
        Map< String,Integer> map3 = new HashMap<>();
        int key = 1;
        while (!stringQueue.isEmpty()){
            String value = stringQueue.poll();
            map3.put( value, key);
            key++;
        }
        // Afisarea Mapului
        System.out.println("Afisarea valorilor Map3");
        System.out.println(map3);

    }
}