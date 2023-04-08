public class Main {
    public static void main(String[] args) {

        Joiners<String> joiners = new JoinersSpatiu();
        String s1 = "Buna ziua";
        String s2 = "lume";
        String lipim = joiners.join(s1, s2);
        System.out.println(lipim);
    }
}