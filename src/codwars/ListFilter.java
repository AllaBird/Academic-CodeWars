package codwars;

import java.util.Arrays;


public class ListFilter {
    //Given an array/list [] of integers , Find the product of the k maximal numbers.
    public static long maxProduct(int[] numbers, int sub_size)
    {
        Arrays.sort(numbers);
        int result = 1;
        for (int i = numbers.length-1; i >=numbers.length-sub_size; i--) {
            result*=numbers[i];

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{4,3,5}, 2));
    }
}
