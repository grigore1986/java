import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Creați un HashSet de automobile care vor fi sortate ascendent după anul producerii
         */
        HashSet<Automobil> automobile = new HashSet<>();
        automobile.add(new Automobil(2018, "Mitsubishi"));
        automobile.add(new Automobil(2019, "Skoda"));
        automobile.add(new Automobil(2017, "Ford"));
        automobile.add(new Automobil(2012, "Toyota"));
/*Pentru a sorta obiectele din HashSet după anul de producție, am creat mai întâi o listă numită automobileSort și
am copiat obiectele din HashSet în această listă utilizând constructorul care primește o colecție ca parametru
*/
        List<Automobil> automobileSort = new ArrayList<>(automobile);
        /*
        Am apelat metoda sort din clasa Collections pentru a sorta lista automobileSort
        în ordine ascendentă, bazată pe implementarea metodei compareTo din clasa Automobil.
         */
        Collections.sort(automobileSort);

        System.out.println("Automobile sortate dupa anul de productie");
        /*
        Am afișat obiectele din lista automobileSort utilizând o buclă for-each și metoda println
         */
        for (Automobil automobil : automobileSort) {
            System.out.println(automobil.toString());
        }
/*
am creat un TreeSet numit automobile și am utilizat un constructor care primește un obiect de tip Comparator ca parametru.
Am definit acest comparator prin crearea unei clase anonime care implementează interfața Comparator<Automobil>
și suprascrie metoda compare în așa fel încât să sorteze obiectele după denumire.
 */
        Set<Automobil> automobils = new TreeSet<>(new Comparator<Automobil>() {
            @Override
            public int compare(Automobil o1, Automobil o2) {
                return o1.getDenumire().compareTo(o2.getDenumire());
            }
        });
        //Am adăugat câteva obiecte de tip Automobil în TreeSet.
        automobils.add(new Automobil(2018,"Mitsubishi"));
        automobils.add(new Automobil(2019,"Skoda"));
        automobils.add(new Automobil(2017,"Ford"));
        automobils.add(new Automobil(2012,"Toyota"));

        System.out.println("Automobile sortate dupa denumire");
        //Am afișat obiectele din TreeSet utilizând o buclă for-each și metoda println
        for(Automobil auto : automobils){
            System.out.println(auto.toString());
        }
    }

}