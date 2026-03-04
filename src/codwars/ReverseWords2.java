package codwars;

public class ReverseWords2 {
    public static String getReverse(String str) {
        String[] arr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >=0; j--) {
                stringBuilder.append(arr[i].charAt(j));
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(getReverse("Hello world"));
    }
}
