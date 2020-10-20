public class SqrtNegativeNumber {
    public static double sqrt(double x) {
        if (x > 0) {
            return Math.sqrt(x);
        }
        throw new IllegalArgumentException("Expected non-negative number, got" + x);

    }






    public static void main(String[] args) {
        SqrtNegativeNumber.sqrt(-2);
    }

}




