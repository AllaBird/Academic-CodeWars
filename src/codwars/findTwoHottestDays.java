package codwars;

import java.util.Arrays;

public class findTwoHottestDays {
    public static void main(String[] args) {

        int[] temps = {28, 30, 25, 31, 18, 22};
        System.out.println(Arrays.toString(getTwoHottestDays(temps)));

    }
    public static int[] getTwoHottestDays(int[] temps) {
        int hottest = Integer.MIN_VALUE;//31
        int secondHottest = Integer.MIN_VALUE;//30
        for (int i = 0; i < temps.length; i++) {
            int currentDayTemp = temps[i];
            if (currentDayTemp > hottest) {
                secondHottest = hottest;
                hottest = currentDayTemp;
            } else if (currentDayTemp > secondHottest) {
                secondHottest = currentDayTemp;
            }
        }
        return new int[] {hottest, secondHottest};
    }
}


