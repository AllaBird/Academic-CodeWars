package codwars;

import java.sql.Array;
import java.util.Arrays;

public class AddLength {
    public static String[] addLength(String str) {
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + " " + arr[i].length();
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(addLength("apple ban"));
        System.out.println(Arrays.toString(addLength("you will win")));
        System.out.println(Arrays.toString(addLength("you")));
        System.out.println(Arrays.toString(addLength("y")));
    }
}
