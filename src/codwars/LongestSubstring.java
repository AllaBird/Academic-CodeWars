package codwars;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int getLongestUniqueSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0; // левая граница окна

        for (int end = 0; end < str.length(); end++) {
            char current = str.charAt(end);

            // если символ уже есть в окне, двигаем start вправо, пока символ не станет уникальным
            while (set.contains(current)) {
                set.remove(str.charAt(start));
                start++;
            }

            set.add(current); // добавляем новый уникальный символ
            maxLength = Math.max(maxLength, end - start + 1); // обновляем максимум
        }

        return maxLength;
    }
}
