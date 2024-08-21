package codwars;

import java.util.Arrays;

public class SimpleMathsTest {

    public static boolean[] numberProperty(int n) {
        boolean isPrime = isPrime(n);
        boolean isEven = isEven(n);
        boolean isMultipleOf10 = isMultipleOf10(n);

        return new boolean[] {isPrime, isEven, isMultipleOf10};
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number==2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isMultipleOf10(int number) {
        return number % 10 == 0;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberProperty(2)));
    }
}
