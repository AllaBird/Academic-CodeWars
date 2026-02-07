package codwars;

public class IsConsecutive {
    public static boolean isConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) return false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isConsecutive(new int[]{1, 2, 3, 4}));
        System.out.println(isConsecutive(new int[]{1, 2, 5, 4}));
    }
}
