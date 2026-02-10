package codwars;

import java.util.Arrays;

public class CountPositivesSumNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{0, 0};
        }

        int count = 0;
        int sum = 0;

        for (int j : input) {
            if (j > 0) {
                count++;
            } else if (j < 0) {
                sum += j;
            }
        }

        return new int[]{count, sum};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1, -2, 3, -4, 0, 6})));
    }
}
