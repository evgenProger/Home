import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int value) {
        return (value == 0 || value == 1) ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial(value - 1));
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}


