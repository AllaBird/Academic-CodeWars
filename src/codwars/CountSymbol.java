package codwars;

public class CountSymbol {

    public static int getNumberOfSymbols(String str, char c) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getNumberOfSymbols("automation", 'o'));
    }
}
