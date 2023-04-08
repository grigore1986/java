import java.util.ArrayList;

public class Joiners<T> {
    //declară metoda statică generică fold, care primește un ArrayList și un obiect Joiner,
    public static <T> T fold(ArrayList<T> list, Joiner<T> joiner) {
        T result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = joiner.join(result, list.get(i));
        }
        return result;
    }

    //unește toate elementele din ArrayList într-un singur element folosind metoda join a obiectului Joiner.
    public String join(String s1, String s2) {
        return s1 + " " + s2;
    }
}