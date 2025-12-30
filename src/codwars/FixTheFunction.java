package codwars;

public class FixTheFunction {
    //    I created this function to add five to any number that was passed in to it and return the new value.
//    It doesn't throw any errors but it returns the wrong number.
//
//    Can you help me fix the function?
    public static int addFive(int num) {
        return num + 5;
    }

    public static void main(String[] args) {
        System.out.println(addFive(5));//10
    }
}
