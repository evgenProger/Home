import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static int[] fillArray(int x) {
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(5)));
    }



}

