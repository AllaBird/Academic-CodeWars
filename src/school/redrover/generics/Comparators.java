package school.redrover.generics;
import java.util.List;

public class Comparators {

    public static final GenericComparator<Integer> MORE = new GenericComparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            if (a > b) return 1;
            if (a < b) return -1;
            return 0;
        }
    };

    public static final GenericComparator<Integer> ABS_MORE = new GenericComparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return MORE.compare(Math.abs(a), Math.abs(b));
        }
    };

    public static final GenericComparator<String> LONGEST_STRING = new GenericComparator<String>() {
        @Override
        public int compare(String a, String b) {
            if (a.length() > b.length()) return 1;
            if (a.length() < b.length()) return -1;
            return 0;
        }
    };

    public static <T> T findBest(List<T> elements, GenericComparator<T> comparator) {
        if (elements.size() == 0) return null;
        T champion = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (comparator.compare(elements.get(i), champion) > 0) {
                champion = elements.get(i);
            }
        }
        return champion;
    }

}