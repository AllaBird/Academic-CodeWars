package codwars;

import java.util.ArrayList;
import java.util.List;

public class AbbreviateName {
    //Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
    //
    //The output should be two capital letters with a dot separating them.
    //
    //It should look like this:
    //
    //Sam Harris => S.H
    //
    //patrick feeney => P.F
    public static String abbrevName(String name) {
        List<String> initials = new ArrayList<>();

        // Split the name into two parts
        String[] parts = name.split(" ");

        // Extract the first character of each part and convert to uppercase
        for (String part : parts) {
            initials.add(String.valueOf(part.charAt(0)).toUpperCase());
        }

        // Join the initials with a dot
        return String.join(".", initials);

        //  String[] names = name.split(" ");
        //    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();

    }
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }
}
