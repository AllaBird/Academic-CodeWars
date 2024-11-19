package codwars;

public class Count {
    /*Define a method named countCharOccurrences that accepts a string and a char as inputs and returns the number of times
     the char occurs in the string as an int.*/
    static int countCharOccurrences(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCharOccurrences("Hello", 'l'));
    }
}
