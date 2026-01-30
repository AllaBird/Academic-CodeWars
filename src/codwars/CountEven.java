package codwars;

public class CountEven {

    public static int getEvenCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getEvenCount(new int[]{1,2,3,4,5,6,10}));
    }
}
