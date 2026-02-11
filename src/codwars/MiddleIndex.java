package codwars;

public class MiddleIndex {
    public static int middleIndex(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int e : numbers) {
            if (e < min) min = e;
            if (e > max) max = e;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != min && numbers[i] != max) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(middleIndex(new int[]{5, 10, 7}));
    }
}
