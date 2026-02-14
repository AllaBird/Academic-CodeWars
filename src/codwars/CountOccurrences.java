package codwars;

import java.util.List;

public class CountOccurrences {
    public static int countOccurrences(List<Integer> numbers, int value) {
        int count = 0;
        for (Integer n:numbers) {
            if(n == value) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences(List.of(1,2,3,4,2,3,6), 2));
    }
}
