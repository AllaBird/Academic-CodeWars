package codwars;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        // Convert the integer to a string
        String numberString = String.valueOf(num);

        // Convert the string to a character array
        char[] digits = numberString.toCharArray();
        Arrays.sort(digits);
        // Reverse the sorted array to get the digits in descending order
        StringBuilder sortedNumberBuilder = new StringBuilder(new String(digits)).reverse();

        // Convert the sorted string back to an integer
        int sortedNumber = Integer.parseInt(sortedNumberBuilder.toString());

        return sortedNumber;
    }

    public static void main(String[] args) {
        int number = 154987;
        System.out.println(sortDesc(number));

    }
}