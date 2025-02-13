package codwars;

public class RemoveTheTime {
    /*Input
Input will always be a string, e.g., "Friday May 2, 7pm".

Output
Output will be the shortened string, e.g., "Friday May 2".*/
    public static String shortenToDate(String longDate) {
        String [] result = longDate.split(",");
        return result[0];
    }

    public static void main(String[] args) {
        System.out.println(shortenToDate("Friday May 2, 7pm"));
    }

}
