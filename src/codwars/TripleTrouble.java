package codwars;

import java.util.ArrayList;
import java.util.List;

public class TripleTrouble {
    //Create a function that will return a string that combines all of the letters of the three inputed strings in groups. Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example below!
    //
    //E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
    //
    //Note: You can expect all of the inputs to be the same length.
    public static String tripleTrouble(String one, String two, String three) {
      StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < one.length(); i++) {
            stringBuilder.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));

        }
            return stringBuilder.toString();
        }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));

    }

}
