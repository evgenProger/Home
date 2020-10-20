public class IsPowerOfTwo {

    public static boolean isPowerOfTwo(int value) {

        value = Math.abs(value);

        return Integer.bitCount(value) == 1;
    }

    public static void main(String[] args) {

        System.out.println(Integer.bitCount(4));
    }
}
