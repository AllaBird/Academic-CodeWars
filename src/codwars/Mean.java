package codwars;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Mean {
    //Find the mean (average) of a list of numbers in an array.
    public static int findAverage(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int num : nums) {
            sum += num;

        }
        return sum /nums.length;
    }

    public static void main(String[] args) {
        int[]a={1,3,5,7};
        System.out.println(findAverage(a));

        int[]b={};
    }
}
