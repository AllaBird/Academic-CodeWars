package codwars;

import java.util.Arrays;

public class GetSum {

    public static int getSum(int[] b) {
       return Arrays.stream(b).sum();
    }

    public static void main(String[] args) {
        System.out.println(getSum(new int[]{1,2,3,4}));
    }
}
