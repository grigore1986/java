public class CopyArray {
    public static void main(String[] args) {
        int array1[] = {2,4,6,8,9};
        int array2[]= new int[array1.length];

        // Copierea elementelor din array1 in array2
        for (int i = 0; i< array1.length; i++){
            array2[i] = array1[i];
        }
        // Afisarea lui array2
        for(int i = 0; i < array2.length;i++){
            System.out.println("Array2: " +array2[i]);

        }
    }
}