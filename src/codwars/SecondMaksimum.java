package codwars;

public class SecondMaksimum {

    public static int secondMax(int[] arr) {
        int max = arr[0];
        int secMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
            else if (arr[i] > secMax && arr[i] < max) {
                    secMax =arr[i];
                }
            }

        return secMax;
    }

    public static void main(String[] args) {
        System.out.println(secondMax(new int[]{2,15, 12, 3,4,5,6,7}));
    }
}
