package codwars;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("allo"));
        System.out.println("---------");
        System.out.println(isPalindrom("abaa"));

    }
    public static boolean isPalindrom(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;
        while (left <= right) {

            if (str[left] != str[right]) {
                return false;
            }
                left++;
                right--;

            }
            return true;
        }

//        char[] str = s.toCharArray();
//        for (int i = 0; i < str.length / 2; i++) {
//            if (str[0] == str[str.length - 1]) {
//                return true;
//
//            }
//
//        }
//
//        return false;


    }
