public class EvenNumberArray {
    public int[] evenArray(int number) {
        int[] arr = new int[number / 2];
        int j = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j += 2;
        }
        return arr;
    }
}
