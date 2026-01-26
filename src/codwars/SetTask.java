package codwars;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTask {

    public static int countUnique(List<String> items) {
        Set<String> res = new HashSet<>();

        for (String s : items) {
            if (res.contains(s)) {
                res.add(s);
            }
        }
        return res.size();
    }

    public static void main(String[] args) {
        System.out.println(countUnique(List.of("apple", "banana", "apple", "orange", "banana")));
    }

}
