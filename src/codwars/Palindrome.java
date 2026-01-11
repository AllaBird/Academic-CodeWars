package codwars;

public class Palindrome {
    public static Boolean isPalindrome(String x) {
        char[] chars = x.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
          result += chars[i];

        }
        return result.equalsIgnoreCase(x);
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("a"));
        System.out.println(Palindrome.isPalindrome("aba"));
        System.out.println(Palindrome.isPalindrome("Abba"));
        System.out.println(Palindrome.isPalindrome("hello"));
        System.out.println(Palindrome.isPalindrome("Bob"));
        System.out.println(Palindrome.isPalindrome("Madam"));
        System.out.println(Palindrome.isPalindrome("AbBa"));
        System.out.println(Palindrome.isPalindrome(""));
    }

}
