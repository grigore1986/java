public class Main {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countDigits = 0; // Initializam count cu 0
        for (int i = 0; i < string.length(); i++) { // Trecem prin fiecare caracter
            if (Character.isDigit(string.charAt(i))) { // Daca symbolul e cifra
                countDigits++; // count +1
            }
        }
        return countDigits;// intoarcem cantitatea cifrelor gasite
    }

    public static int countLetters(String string) {
        int countLetters = 0;// Initializam count cu 0
        for (int i = 0; i < string.length(); i++) { // Trecem prin fiecare caracter
            if (Character.isLetter(string.charAt(i))) {// Daca symbolul e litera
                countLetters++;
            }
        }
        return countLetters; //intoarcem cantitatea literilor gasite
    }

    public static int countSpaces(String string) {
        int countSpace = 0;// Initializam count cu 0
        for (int i = 0; i < string.length(); i++) {// Trecem prin fiecare caracter
            if (Character.isWhitespace(string.charAt(i))) { // Daca symbolul e spatiu
                countSpace++;
            }
        }
        return countSpace; // intoarcem cantiatea spatiulor gasite
    }
}