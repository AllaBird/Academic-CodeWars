package codwars;

public class Palindrome2 {

    public static boolean isPalindrome(String word) {
        String res = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            res += word.charAt(i);
        }
        if (res.equals(word)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("allac"));
    }
}
