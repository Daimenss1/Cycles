package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int i = 1;

        System.out.println(" * Задача 1 ");

        while (i <= 10) {
            System.out.print(i++ + " ");
        }

        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int firstFriDay = 3;
        System.out.println( " * Задача 2 ");
        for (int g = firstFriDay; g <= 31; g = g + 7) {
            System.out.println("Сегодня пятница " + g + "-е число. Необходимо подготовить отчет");
        }

        System.out.println();

        int current = 2021;
        System.out.println( " * Задача 3" );
        for (int k = current - 200; k <= current + 100; k++) {
            if (k % 79 == 0) {
                System.out.println(k);
            }
        }
    }
}

