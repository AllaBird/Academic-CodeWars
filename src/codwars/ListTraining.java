package codwars;

import java.util.ArrayList;
import java.util.List;

public class ListTraining {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));
        List<String> colorsWithL = new ArrayList<>();
        for (String color: colors) {
            if(color.toLowerCase().contains("l")){
                colorsWithL.add(color);
            }
        }
        System.out.println(colorsWithL);

    }
}
