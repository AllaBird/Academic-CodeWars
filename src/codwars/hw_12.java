package codwars;

import HW_7.Person;

import java.util.*;

public class hw_12 {
    public static void main(String[] args) {
        //Создать лист и добавить в него следующие слова:         //White.        //Tan.        //Yellow.        //Orange.
        //Red.        //Pink.        //Purple.        //Blue.
        //Затем удалить из этого списка все цвета в которых встречается буква “L”
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Tan");
        list.add("Yellow");
        list.add("Orange");
        list.add("Red");
        list.add("Pink");
        list.add("Purple");
        list.add("Blue");

        List<String> colors = new ArrayList<>();
        for (String color : list) {

            if (!color.toLowerCase().contains("l")) {
                colors.add(color);
            }

        }
        System.out.println(colors);

        List<Integer> hundredToTousend = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            hundredToTousend.add(i);
        }
        System.out.println(hundredToTousend);

        List<Integer> odd = new ArrayList<>();
        for (int result : hundredToTousend) {


            if (result % 2 != 0) {
                odd.add(result);
            }


        }

        System.out.print(odd);


        System.out.println("---------------------------------");


        Map<String, String> people = new HashMap<>();
        people.put("200x", "Vasya");
        people.put("100j", "Petr");

        System.out.println(people);
        System.out.println("+++++++++++++");
        for (String key:people.keySet()){
            System.out.println("Key = "+key + ", value = "+ people.get(key));
        }

        //есть строка и в ней много стмволов
        Map<Character, Integer> charCounts = new HashMap<>();
        String  string ="hchsyuhfodchujfisjchdfhffcuidhkfhcuhsfuihsufh";
        for (char c : string.toCharArray()) {
             int currentCount = charCounts.getOrDefault(c,0);
             charCounts.put(c,currentCount+1);

        }
        System.out.println(charCounts);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        //Задача со звездочкой
        //Создать список из 30 или более случайных слов (например, можно воспользоваться https://randomwordgenerator.com/ ).
        //Напечатать из этого списка самые длинные слова, начинающиеся на каждую букву. Т.е. если, к примеру, в списке есть слова,
        // начинающиеся на a, b, d, f, то надо напечатать самое длинное слово на a, самое длинное на b, на d и нa f.


        List<String> randomWordsList = List.of("swear", "sin", "oil", "alarm", "rate", "hostage", "nuclear",
                "distortion", "machinery", "mercy", "tract", "toll", "lease", "chocolate", "pop", "swing", "junior",
                "load", "deposit", "consumption", "epicalyx", "entertain", "bell", "performance", "prey", "cool",
                "insure", "federation", "mystery", "fence");

        Map<Character, String> longestWordsMap = new HashMap<>();
       /* Мы используем Map, потому что нам нужно сохранить наибольшее слово для каждой буквы алфавита.
       Ключом в нашей Map будет первая буква слова (Character), а значением будет само слово (String).
        */

        for (String word : randomWordsList) { //Мы проходим по нашему листу randomWordsList и каждый элемент записываем в переменную word типа String
            char firstChar = word.charAt(0); //У первого элемента извлекаем первую букву
            String longestWord = longestWordsMap.getOrDefault(firstChar, "");
            // Этот метод пытается получить значение из Map по ключу firstChar.
            // Если в Map есть запись с ключом firstChar, метод вернет соответствующее значение.
            // Если записи с таким ключом нет, метод вернет значение по умолчанию, которое мы
            // указали вторым параметром (в данном случае это пустая строка "").

            if (word.length() > longestWord.length()) {
                longestWordsMap.put(firstChar, word);
            }
        }
        System.out.println(longestWordsMap);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");





    }
    }




