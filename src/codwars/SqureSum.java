package codwars;

import java.util.ArrayList;
import java.util.List;

public class SqureSum {
    //Complete the square sum function so that it squares each number passed into it and then sums the results together.
    //
    //For example, for [1, 2, 2] it should return 9 because
    public static int squareSum(int[] n) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int num : n) {
            int squaredNumber = num * num;
            sum += squaredNumber;


        }
        return sum;
    }

    public static void main(String[] args) {


        int[] a = {1, 2, 2};
        System.out.println(squareSum(a));
    }
}