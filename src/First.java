import java.lang.reflect.Array;
import java.util.Arrays;

public class First {

    //Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
//
//Note: input will never be an empty string
    public static String fakeBin(String numberString) {
        StringBuilder my = new StringBuilder(numberString.length());
        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            if (digit < 5) {
                my.append("1");

            } else {
                my.append("0");
            }

        }
        return my.toString();
    }

    public static void main(String[] args) {
        String a = "45385593107843568";
        System.out.println(fakeBin(a));
    }
}
//}//public class FakeBinary {
//    public static String fakeBin(String numberString) {
//        StringBuilder my = new StringBuilder(numberString.length());
//        for (int i = 0; i < numberString.length(); i++) {
//            int digit = Character.getNumericValue(numberString.charAt(i));
//            if (digit < 5) {
//                my.append("1");
//            } else {
//                my.append("0");
//            }
//        }
//        return my.toString();
//    }