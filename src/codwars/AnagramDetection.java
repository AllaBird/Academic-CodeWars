package codwars;

import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;

        }
        String first = test.toLowerCase();
        String second = original.toLowerCase();

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("foefet", "toffee"));
    }
}