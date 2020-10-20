public class CounterS {
    public static void main(String[] args) {
        int i = 0;
        int s = 0;
        while (i < 99) {
            if (i % 2 == 0) {
                s = s + 3;
            }
            else {
                s = s + 2;
            }
            i += 1;
        }
        System.out.println(s);
    }
}
