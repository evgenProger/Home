public class ArrayFull {
    public static void printOddNumbers(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 ) {

                stringBuilder.append(arr[i] + ",");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        System.out.println(stringBuilder);

        //Твой код здесь
    }


    public static void main(String[] args) {
        int[] arr = new int[] {3,5,20,8,7,3,100};
        printOddNumbers(arr);
    }


}
