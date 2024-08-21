package school.redrover.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.SortedMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 5, 43, 2, 5, -23, 0);

        // найдем сумму этих чисел, используя reduce
        System.out.println(
                integers.stream()
                        .reduce(0, (acc, number) -> acc + number,
                                (sum1, sum2) -> sum1 + sum2
                        )
        );
        // same
        System.out.println(integers.stream().reduce((a, b) -> a + b));
        System.out.println(integers.stream().reduce(0, (a, b) -> a + b));

        List<String> words = List.of("some", "random", "list", "of", "words");
//        List<Integer> result = new ArrayList<>();
////        for (int i: integers) {
////            result.add(i*2);
//        for (String s : words) {
//            result.add(s.length());
//
//        }
//        System.out.println(result);

        /*List<Integer> lenghts = words.stream()//Straem <String>
                .map(new Function<String,Integer>() {
                    @Override
                    public Integer apply(String string) {
                        return string.length();  // берет стринг, возвращает интеджер
                    }
                })//Stream <Integer>
        //обратно перевести в список из стима
                .toList();
        System.out.println(lenghts);

    }
}
         */ //Мы лямбдой выражаеим единственный метод, который неимплемнтированный, который абстрактный в этом интерфэйсе
//        List<Integer> lenghts = words//list<string>
//                .stream() //Stream<String>
//                .map(s -> s.length())//Stream<Integer> //анонимная функция принимает параметр s и возвращает
//                .filter(i -> i < 3) //Stream<Integer>
//                .distinct() //Stream<Integer>
//                .collect(Collectors.toList());//list<Integer>
//        System.out.println(lenghts);
//
//
//        System.out.println(words.stream()
//                .flatMap(word -> word.chars().mapToObj(i ->(char)i))   //Stream<Character>
//                .allMatch(c -> Character.isAlphabetic(c))
//        );
//
//        System.out.println(words  //List<String>
//                .stream() // Stream<String>
//                .flatMap(word -> word.chars().mapToObj(i ->(char)i))   //Stream<Character>
//                .anyMatch(c -> c== 'x')
//        );
//
//        System.out.println(words  //List<String>
//                .stream() // Stream<String>
//                .flatMap(word -> word.chars().mapToObj(i ->(char)i))   //Stream<Character>
//                .allMatch(c -> {
//                    boolean isLetter = Character.isAlphabetic(c);
//                    boolean isNumber = Character.isDigit(c);
//                    return isLetter || isNumber;  //Boolean
//                })
//        );
        System.out.println(words
                .stream() //Stream<String>
                .reduce((a, b) -> a.length() > b.length() ? a : b));


        System.out.println(Stream.empty().reduce((a, b) -> a));

       /*OPTIONAL
//
//        System.out.println(Optional.ofNullable(null));
//        System.out.println(Optional.of("xxxxx").get());
//    }

//       System.out.println(stringLength("xxx").orElse(0));
//       System.out.println(stringLength("null").orElse(0));
//   }
//        static Optional<Integer> stringLength(String s){
//            return Optional.ofNullable(s).map(x -> x.length());
//
       */

        Stream<Integer> myStream = Stream.iterate(1, i -> i + 3)
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .map(i -> i * 3);
        System.out.println("------------");
        System.out.println(myStream.limit(20).collect(Collectors.toUnmodifiableList()));


        List<String> wordsNew = List.of("some", "random", "list", "34567");
        System.out.println(wordsNew
                .stream()
                .flatMap(s -> s.chars().mapToObj(i -> (char) i))
                .collect(Collectors.groupingBy(c -> c))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().size()))
        );
    }
}