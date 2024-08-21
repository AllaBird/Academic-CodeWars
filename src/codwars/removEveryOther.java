package codwars;

import java.util.ArrayList;
import java.util.List;

public class removEveryOther {
    //Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.
    //
    //Example:
    //["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object>result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                result.add(arr[i]);

        }

        }
        return result.toArray();
    }

    public static void main(String[] args) {
        Object[] a = { "Hello", "Goodbye", "Hello Again" };
        Object[] result = removeEveryOther(a);
        for (Object obj : result) {
            System.out.print(obj + " ");
        }
    }
}