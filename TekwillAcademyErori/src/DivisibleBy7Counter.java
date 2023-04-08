// Clasa DivisibleBy7Counter contine o metoda care numara cate numere dintr-un interval sunt divizibile cu 7
public class  DivisibleBy7Counter{
    // Metoda care numara cate numere din intervalul [inferiorLimit, superiorLimit] sunt divizibile cu 7
    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        // Daca limita inferioara este mai mare decat limita superioara, arunca o exceptie InvalidRangeException
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Limita inferioara este mai mare decat limita superioara");
        }
        // Initializarea unui contor cu valoarea 0
        int count = 0;
        // Parcurgerea numerelor din intervalul dat si incrementarea contorului pentru fiecare numar divizibil cu 7
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        // Returnarea numarului de numere divizibile cu 7 din intervalul dat
        return count;
    }
}
