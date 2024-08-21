package codwars;

public class GetTheMiddleCharacter {
    //You are going to be given a word. Your job is to return the middle character of the word.
    // If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

    public static String getMiddle(String word) {

        if (word.length() % 2 == 0) {
            int middle =word.length() / 2;
            return word.substring(middle - 1, middle + 1);
        } else {
            int middle = word.length() / 2;
            return String.valueOf(word.charAt(middle));
        }
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("hello"));
    }
}
