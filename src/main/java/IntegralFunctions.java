import java.util.function.DoubleUnaryOperator;

public class IntegralFunctions {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
       double width = Math.pow(10, -6);
       double sum = 0;
       while (a <= b) {
           sum = sum + f.applyAsDouble(a) * width;
           a = a + width;
       }



        return sum;
    }

    public static void main(String[] args) {

        System.out.println(integrate(x -> x + 2, 0, 10 ));
    }

}
