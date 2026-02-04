package codwars;

public class CountChar {

    public static int countChar(String text, char ch) {
        int count = 0;
        if (text == null) return 0;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==ch){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countChar(null, 's'));
    }
}
