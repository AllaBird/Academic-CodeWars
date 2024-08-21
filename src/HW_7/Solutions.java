package HW_7;

import java.util.Arrays;

//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
//
//The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
//
//Mind the input validation.
//
//Example
//{ 6, 2, 1, 8, 10 } => 16
//{ 1, 1, 11, 2, 3 } => 6
class Solutions {
    public static int sum(int[] numbers) {


        if (numbers.length == 1 || numbers == null ||numbers.length == 0) {
        //   if (numbers == null || numbers.length == 0 || numbers.length == 1){
            return 0;
        } else {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];

                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }

            }

            return sum - min - max;
        }
    }
    public static void main(String[] args) {
        int [] a ={};
        System.out.println(sum(a));
    }}