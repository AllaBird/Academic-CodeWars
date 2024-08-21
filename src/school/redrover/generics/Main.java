package school.redrover.generics;

//import comparators.Comparators;
//import static animals.Animals.*;

import java.util.List;

import static school.redrover.generics.Animals.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Comparators.findBest(
                List.of(TIGER, ELEPHANT, BEAR, ANT, DUNG_BEETLE),
                STRONGEST
        ).getName());
    }
}
