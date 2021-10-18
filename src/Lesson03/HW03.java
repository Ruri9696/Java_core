package Lesson03;

import java.util.Arrays;

public class HW03 {
    public static void main(String [] args) {
        String [] arr = {"asd", "ab", "cat", "123"};
        System.out.println("Задание 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");

        System.out.println("Задание 2\n");

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i<4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i =0; i<6; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weight = orangeBox1.getWeight();
        Float orange2Weight = orangeBox2.getWeight();
        Float appleWeight = appleBox.getWeight();
        System.out.println("Вес 1 коробки с апельсинами: " + orange1Weight);
        System.out.println("Вес 2 коробки с апельсинами: " + orange2Weight);
        System.out.println("Вес коробки с яблоками: " + appleWeight);

        System.out.println("Сравнить вес 1 коробки с апел-ми и коробки с яблоками: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес 2 коробки с апел-ми и коробки с яблоками: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
