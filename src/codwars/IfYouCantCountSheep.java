package codwars;

public class IfYouCantCountSheep {
    public static String countingSheep(int num) {
        String result = "";
        for(int i = 1; i<=num; i++){
            result +=  i + " sheep...";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(5));
    }
}
