import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height =  5;
        StringBuilder star = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j != width / 2 + 1) {
                    star.append(" ");

                }
                star.append("*");
            }
        }
        System.out.println(star);

    }
}
