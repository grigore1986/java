public class  DivisibleBy7Counter{
    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Limita inferioara este mai mare decat limita superioara");
        }
        int count = 0;
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        return count;
    }
}
