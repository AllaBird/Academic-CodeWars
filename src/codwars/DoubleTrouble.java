package codwars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleTrouble {
    public static int[] trouble(int[] x, int t) {
        List<Integer> origin = new ArrayList<>();
        for (int num : x) {
            origin.add(num);
        }

        for (int i = 0; i < origin.size() - 1; ) {
            if (origin.get(i) + origin.get(i + 1) == t) {
                origin.remove(i + 1);
            }
            else {
                i++;
            }

        }

        return origin.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(trouble(new int[]{1, 3, 5, 6, 7, 4, 3}, 7)));
        System.out.println(Arrays.toString(trouble(new int[]{4, 1, 1, 1, 4}, 2)));
        System.out.println(Arrays.toString(trouble(new int[]{2, 6, 2}, 8)));
        System.out.println(Arrays.toString(trouble(new int[]{2, 2, 2, 2, 2, 2}, 4)));
    }
}
