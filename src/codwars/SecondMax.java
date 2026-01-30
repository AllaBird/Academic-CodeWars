package codwars;

import java.util.List;

public class SecondMax {

           public static int secondMax(List<Integer> numbers) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

               for (int num : numbers) {
                   if (num > max) {
                       secondMax = max;
                       max = num;
                   } else if (num > secondMax) {
                       secondMax = num;
                   }
               }

            return secondMax;
        }

        public static void main(String[] args) {
            System.out.println(secondMax(List.of(1, 15, 15, 4 ,6 ,7, 9)));
        }
    }

