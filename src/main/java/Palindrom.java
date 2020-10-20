public class Palindrom {
    public static boolean isPalindrome(String text) {

        String newtext = text.replaceAll("[^a-zA-Z0-9]", "");

        return newtext.equalsIgnoreCase(new StringBuilder(newtext).reverse().toString());

    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("sl;gjkwktgo?"));
    }

}


