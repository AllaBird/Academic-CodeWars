package codwars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mixedSum {
//    Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
//Return your answer as a number.
public static int sum(List<?> mixed) {
    int sum = 0;
    for (Object element : mixed) {
        if (element instanceof Integer) {
            sum += (Integer) element;
        } else if (element instanceof String) {
            sum += Integer.parseInt((String) element);
        }
    }

    return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(5,"5")));
    }
}
