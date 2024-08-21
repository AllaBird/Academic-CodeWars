package school.redrover.stream;

import java.util.List;

public class NotStream {
    public static void main(String[] args) {
        System.out.println(findBest(List.of("aaa", "bb", "CCCC"), (first, second) -> first.length() - second.length()));
    }
    static interface Comparator<T> {
        int compare(T first, T second);
    }
    
    static <T> T findBest(List<T> elements, Comparator<T> comporator) {
        if (elements.isEmpty()) return null;
        T champion= elements.get(0);
        for (int i = 0; i < elements.size(); i++) {
            if (comporator.compare(champion, elements.get(i)) <0) {
                champion =elements.get(i);
            }
            
        }
        return champion;
    }


}
