public class SumamedieArray {

    public static void main(String[] args) {
        int array1[] = {34, 36, 38};
        int array2[][] = {{23, 24, 25}, {56, 57, 58}, {61, 62, 63}};
        int sumaArray1 = 0, sumaArray2 = 0;
        double mediaArray1 = 0, mediaArray2 = 0;
        int inparArray1 = 0, nparArray1 = 0, inparArray2 = 0, nparArray2 = 0;

        // Calcularea sumei si numarului de elemente pare si impare pentru array1
        for (int i = 0; i < array1.length; i++) {
            sumaArray1 += array1[i];
            if (array1[i] % 2 == 0) {
                inparArray1++;
            } else {
                nparArray1++;
            }
        }
// calcularea mediei
        mediaArray1 = (double) sumaArray1 / array1.length;
// Calcularea sumei si numarului de elemente pare si inpare pentru array2
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sumaArray2 += array2[i][j];
                if (array2[i][j] % 2 == 0) {
                    nparArray2++;
                } else {
                    inparArray2++;
                }
            }
        }
        // calcularea mediei
        mediaArray2 = (double) sumaArray2 /(array2.length*array2[0].length);

        // Afisarea Array1
        System.out.println("Array1: ");
        System.out.println("Suma: "+sumaArray1);
        System.out.println("Media: "+mediaArray1);
        System.out.println("Inpar: " +inparArray1);
        System.out.println( "Pare: " +nparArray1);
        // Afisarea Array2
        System.out.println("Array2: ");
        System.out.println("Suma: "+sumaArray2);
        System.out.println("Media: "+mediaArray2);
        System.out.println("Inpar: " +inparArray2);
        System.out.println("Pare: "+nparArray2);
    }
}
