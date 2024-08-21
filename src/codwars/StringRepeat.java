package codwars;

public class StringRepeat {
    //Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
    //
    //Examples (input -> output)
    //6, "I"     -> "IIIIII"
    //5, "Hello" -> "HelloHelloHelloHelloHello"
    public static String repeatStr(final int repeat, final String string) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            stringBuilder.append(string);

        }
        //stringBuilder.append(String.valueOf(string).repeat(Math.max(0, repeat)));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(5, "Hello"));
    }
}