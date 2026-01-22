package codwars;

import java.util.List;

public class DeleteEvenFromList {
    /*Нужно удалить все чётные числа из списка.

Вернуть изменённый список и вывести его на экран.

🔹 Требования

Используй ArrayList

Можно использовать цикл for или итератор

Не создавай новый список — удаляем прямо из существующего*/

    public static List<Integer> getRidOfEven(List<Integer> l) {
        return l.stream().filter(n -> n % 2 !=0).toList();

    }

    public static void main(String[] args) {
        System.out.println(getRidOfEven(List.of(2, 5, 8, 11, 14, 17)));
    }
}
