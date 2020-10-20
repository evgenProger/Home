public class Variable {
    public static boolean isPalindrome(String text) {
        boolean bool = true;
       String newtext = text.replaceAll("[^a-zA-Z0-9]", "");
       String sentense =  newtext.toLowerCase();
       char[] world = sentense.toCharArray();
        for (int i = 0; i < world.length / 2; i++) {
            if (world[i] != world[world.length - i -1]) {
                bool = false;
                break;

            }


        }



       return bool;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801."));
    }


}
