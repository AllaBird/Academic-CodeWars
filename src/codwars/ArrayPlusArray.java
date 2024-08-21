package codwars;

public class ArrayPlusArray {
    //I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.
    //
    //P.S. Each array includes only integer numbers. Output is a number too.
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        for (int j : arr1) {
            sum1 += j;
        }
        int sum2 = 0;
        for (int j : arr2) {
            sum2 += j;
        }
        return sum1 + sum2;
    }
}