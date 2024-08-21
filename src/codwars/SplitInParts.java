package codwars;

public class SplitInParts {
    /*Split the below string into other strings of size #3

'supercalifragilisticexpialidocious'

Will return a new string
'sup erc ali fra gil ist ice xpi ali doc iou s'
Assumptions:

String length is always greater than 0
String has no spaces
Size is always positive
} */
    public static String splitInParts(String s, int partLength) {
        char [] a = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < a.length; i += partLength) {
            for (int j = 0; j < partLength && i + j < a.length; j++) {
                stringBuilder.append(a[i + j]);
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
    }
    }