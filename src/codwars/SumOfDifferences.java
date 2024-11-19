package codwars;

import java.util.Arrays;
import java.util.Collections;

public class SumOfDifferences {
    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++){
            sum += arr[i+1] - arr[i];



        }
        return  sum;
    }


    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{10, 2, 1}));

    }

}
