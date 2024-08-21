package codwars;

public class Isograms {
    /*An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false
}
     */
    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        for (int i = 0; i< chars.length; i++){
            for (int j = 1; j<chars.length; j++){
                if(chars[i] == chars[j] && i != j)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
    }
}