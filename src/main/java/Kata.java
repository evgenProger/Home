public class Kata {
    public static int[] multiples(int m, int n) {
        int[] arr = new int[m];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n * count;
            count++;
        }
        return arr;
    }

}
