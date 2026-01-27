package codwars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteSameFromList {

    public static List<Integer> deleteRepeatNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : numbers) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(deleteRepeatNumbers( Arrays.asList(1, 2, 3, 2, 4, 1, 5)));
    }
}
