package org.hw03;

import static org.hw03.Calculator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первое задание");
        System.out.println(sum(4, 5.5));
        System.out.println(multiply(5, 5.0f));
        System.out.println(divide(8.0, 2));
        System.out.println(subtract(10, 0.5));

        System.out.println("\nВторое задание");
        System.out.println(compareArrays(new Integer[10], new Integer[12]));
        System.out.println(compareArrays(new Integer[10], new Integer[10]));
        System.out.println(compareArrays(new Integer[10], new String[10]));

        System.out.println("\nТретье задание");
        Pair<Double, String> pair = new Pair<>(5.6, "hi");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);


    }

    /**
     * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
     * и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
     * элементы одного типа.
     */
    static <F, S> boolean compareArrays(F[] first, S[] second) {
        return first.length == second.length && first.getClass() == second.getClass();
    }
}
