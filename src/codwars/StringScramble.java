package codwars;

public class StringScramble {

    public static String scramble(String str, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = str.charAt(i);
        }

        return String.valueOf(res);
    }

    public static void main(String[] args) {
        System.out.println(scramble("abcd", new int[]{0, 3, 1, 2}));
    }
}
