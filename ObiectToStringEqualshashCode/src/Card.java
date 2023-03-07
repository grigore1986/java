public class Card {
    private String rank; // definim variabila rank de tip String, private pentru a putea fi accesata doar in interiorul clasei
    private String suit; // definim variabila suit de tip String, private pentru a putea fi accesata doar in interiorul clasei

    public Card(String r, String s) { // definim constructorul clasei cu parametrii r si s
        if (r == null || s == null) // verificam daca r si s sunt nule
            throw new IllegalArgumentException(); // aruncam o exceptie daca r sau s sunt nule
        rank = r; // setam valoarea variabilei rank cu valoarea r primita ca parametru
        suit = s; // setam valoarea variabilei suit cu valoarea s primita ca parametru
    }

    public boolean equals(Object obj) { // suprascriem metoda equals din clasa Object
        if (!(obj instanceof Card)) return false; // verificam daca obiectul primit ca parametru este o instanta a clasei Card
        Card c = (Card) obj; // convertim obiectul primit ca parametru la tipul Card si il salvam in variabila c
        return rank.equals(c.rank) && suit.equals(c.suit); // returnam true daca rank si suit din obiectul curent sunt egale cu rank si suit din obiectul c
    }

    public int hashCode() { // suprascriem metoda hashCode din clasa Object
        return rank.hashCode(); // returnam valoarea hash pentru variabila rank
    }
}
