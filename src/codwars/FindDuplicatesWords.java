package codwars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesWords {

    public static List<String> findDuplicateWords(String text) {
        String[] arr = text.toLowerCase().split(" ");
        Set<String> allNotDuplicates = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String s : arr) {
            if (!allNotDuplicates.add(s)) {
                duplicates.add(s);

            }
        }
        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        System.out.println(findDuplicateWords("Java is great and java is fun"));
    }
}
