package codwars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public static List<Integer> findDuplicates(List<Integer> numbers) {
        Set<Integer> seenNumbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer number : numbers) {
            if (!seenNumbers.add(number)) { //false
                duplicates.add(number);
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(List.of(1, 2, 3, 2, 4, 5, 1, 6)));
    }
}
