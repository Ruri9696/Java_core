package Lesson04;

import java.util.*;

public class Words {

    public static void main (String[] args) {
        List<String> words = Arrays.asList(
                "Яблоки", "Апельсины", "Собаки", "Собаки", "Коты", "Синий", "Красный",
                "Зеленый", "Красный", "Бананы", "Собаки"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Изначальный массив");
        System.out.println(words.toString());
        System.out.println(" ");
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println(" ");
        System.out.println("Часто встречающиеся слова");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
