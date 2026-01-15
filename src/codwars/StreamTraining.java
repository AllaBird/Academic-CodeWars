package codwars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTraining {
    public static void main(String[] args) {


        List<String> colors = new ArrayList<>(List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));
        List<String> colorsWithL = colors.stream()
                .filter(c -> c.toLowerCase().contains("l"))
                .toList();
        System.out.println(colorsWithL);


        List<Integer> intList = Stream.iterate(100, s -> s + 1)
                .limit(901)
                .filter(s -> s % 2 != 0)
                .toList();
        System.out.println(intList);


    }
}
