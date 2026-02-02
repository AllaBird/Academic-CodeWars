package codwars;

public class FindMaxLength {

    public static String findMaxLength(String str) {
        String res = "";

        for (String s : str.replaceAll("[.,!?]", "").split("\\s+")) {
            if (s.length() > res.length()) {
                res = s;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findMaxLength("Hello, wanderful wonderful, world!"));
    }
}
