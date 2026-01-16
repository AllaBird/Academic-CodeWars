package codwars;

public class Grader {
    public static char grader(double score) {
        if (score > 1 || score < 0.6) {
            return 'F';
        } else if (score >= 0.9) {
            return 'A';
        } else if (score >= 0.8) {
            return 'B';
        } else if (score >= 0.7) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public static void main(String[] args) {
        System.out.println(grader(0.65));
    }
}
