package codwars;

public class OpposotesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        if (flower1 % 2 == 0 && flower2 % 2 != 0 || flower1 % 2 != 0 && flower2 % 2 == 0) {
            return true;

        }
        return false;


    }
}
