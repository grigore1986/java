public class JoinersSpatiu extends Joiners<String> implements Joiner<String> {
    @Override
    public String join(String s1, String s2) {
        return s1 + " " + s2;
    }
}
