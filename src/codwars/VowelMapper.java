package codwars;

import java.util.ArrayList;
import java.util.List;

public class VowelMapper {

    public static List<Object> isVow(List<Integer> a) {
        List<Object> result = new ArrayList<>();
        for (Integer integer : a) {
            if (integer.equals((int) 'a')) {
                result.add("a");
            } else if (integer.equals((int) 'e')) {
                result.add("e");
            } else if (integer.equals((int) 'i')) {
                result.add("i");
            } else if (integer.equals((int) 'o')) {
                result.add("o");
            } else if (integer.equals((int) 'u')) {
                result.add("u");
            } else {
                result.add(integer);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isVow(List.of(101,121,110,113,113,103,121,121,101,107,103)));
    }
}
