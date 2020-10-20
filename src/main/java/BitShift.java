import java.util.BitSet;

public class BitShift {
    public static int flipBit(int value, int bitIndex) {
        int x =  1 << (bitIndex - 1);
        int res = value ^ x;
        return   res;
    }

    public static void main(String[] args) {

       int result =  flipBit(0, 1);
        System.out.println(result);
    }
    
}