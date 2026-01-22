package codwars;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterList {
    //Нужно создать новый список, который содержит только числа больше 10.

//    public static List<Integer> getNewList(List<Integer> l) {
//        List<Integer> result = new ArrayList<>();
//        for (Integer n : l) {
//            if (n > 10) {
//                result.add(n);
//            }
//        }
//        return result;
//    }

    public static List<Integer> getNewList(List<Integer> l) {
        return l.stream()
                .filter(n -> n > 10)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(getNewList(List.of(1, 5, 10, 15, 20, 25)));
    }
}
