package codwars;

public class IsSorted {

    public static boolean isSorted(int[] numbers) {
        if (numbers == null) {
            return false;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 2, 3, 4}));
        System.out.println(isSorted(new int[]{5, 3, 1}));
        System.out.println(isSorted(null));
    }
}
