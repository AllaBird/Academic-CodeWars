import java.util.Arrays;

public class hw_4 {

                public static int[] countBy(int x, int n){
                    int[] result = new int[n];
                    int j = 0;
                    for (int i = 1; j < n; i++) {
                        if (i % x == 0) {
                            result[j] = i;
                            j++;
                        }
                    }
                    return result;
                }
            }
