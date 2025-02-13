package codwars;

import java.util.Arrays;

public class ReversedSequence {
    /*Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]*/
    public static int[] reverse(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = n - i;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }
}
