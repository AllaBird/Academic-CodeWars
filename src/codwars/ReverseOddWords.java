package codwars;

public class ReverseOddWords {

    public static String reverseOddWords(String str) {
        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() % 2 != 0) {
                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    result.append(arr[i].charAt(j));

                }

            } else {
                result.append(arr[i]);
            }

            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseOddWords("Hello world"));
    }
}
