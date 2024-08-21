package codwars;

public class CartesiaWalk {
    public static boolean isValid(char[] walk) {
        if(walk.length!=10){
            return false;
        }

        int northSouth = 0;
        int eastWest = 0;
        for (char w: walk) {
            if(w=='n'){
                northSouth++;
            }
            if (w == 's') {

                northSouth--;
            }
            if(w=='w'){
                eastWest++;
            }
            if(w=='e'){
                eastWest--;
            }

        }

        return northSouth==0 && eastWest==0;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'} ));
    }
}
