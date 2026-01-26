package codwars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstDuplicate {

    public static Integer findFirstDuplicate(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();

        for (Integer number : numbers) {
            if (seen.contains(number)) {
                return number;
            }
            seen.add(number);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(findFirstDuplicate(List.of(1,2,3,5,2)));
    }
}
