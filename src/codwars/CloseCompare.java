package codwars;

public class CloseCompare {
    public static int closeCompare(double a, double b) {
        if(a < b) {
            return -1;
        }
        else if(a > b) {
            return 1;
        }
        return 0;
    }

    public static int closeCompare(double a, double b, double margin) {
        if(margin >= (Math.abs(a-b))){
            return 0;
        }
        else if(a < b) {
            return -1;
        }
        else if(a > b) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(closeCompare(4, 5));
        System.out.println(closeCompare(5, 5));
        System.out.println(closeCompare(6, 5));
        System.out.println(closeCompare(-6, -5));

        System.out.println(closeCompare(2, 5, 3));
        System.out.println(closeCompare(8.1, 5, 3));
        System.out.println(closeCompare(1.99, 5, 3));
    }
}
