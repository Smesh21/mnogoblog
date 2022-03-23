package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите переменную 1:");
        double value1 = scan.nextDouble();
        System.out.println("Введите переменную 2:");
        double value2 = scan.nextDouble();
        System.out.println("Сумма переменных:" + (value1 + value2));
        System.out.println("Разность переменных:" + (value1 - value2));
        System.out.println("Произведение переменных: " + (value1 * value2));
        if (value2 != 0) {
            System.out.println("Частное переменных: " + (value1 / value2));
        } else {
            System.out.println("Ваш компуктер сча взорвется");
        }

        String firstName = "Иван ";
        String secondName = "Иванов ";
        int age = 66;
        System.out.println("Фамилия: " +secondName);
        System.out.println("Имя: " +firstName);
        System.out.println("Возвраст: " +age);

    }
}

