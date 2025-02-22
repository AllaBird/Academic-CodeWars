package codwars;

import java.util.Arrays;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i] % i == 0) {
                    result[i] = array[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25})));
    }

}
