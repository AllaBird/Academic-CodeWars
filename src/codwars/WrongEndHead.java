package codwars;

import java.util.ArrayList;
import java.util.List;

public class WrongEndHead {
/*You're at the zoo... all the meerkats look weird. Something has gone terribly wrong -
someone has gone and switched their heads and tails around!

Save the animals by switching them back. You will be given an array which will have three values (tail, body, head).
 It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).

Same goes for all the other arrays/lists that you will get in the tests:
you have to change the element positions with the same exact logics

Simples!
 */
public static String[] fixTheMeerkat(String[] arr) {
    List<String>list=new ArrayList<>();

        list.add(arr[2]);
        list.add(arr[1]);
        list.add(arr[0]);



    return list.toArray(new String[0]);
}

    public static void main(String[] args) {
        String[]a = { "lower legs", "torso", "upper legs" };
        String[] result = fixTheMeerkat(a);
        for (Object obj : result) {
            System.out.print(obj + " ");
        }
    }
    }

