package codwars;

public class IsDivisible {
    //Create a function that checks if the first argument n is divisible by all other arguments (return true if no other arguments)
    public static boolean isDivisible(int n, int... divisors) {
        for (int i = 0; i < divisors.length; i++) {
            if (n % divisors[i] != 0 &&divisors[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(3, 3, 4));
        System.out.println(isDivisible(12, 3, 4));
        System.out.println(isDivisible(8, 3, 4, 2, 5));
    }
}
