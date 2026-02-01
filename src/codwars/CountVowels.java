package codwars;

public class CountVowels {
    public static int countVowels(String text) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (char c : text.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello World"));
    }
}
