package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scan.nextInt();
        if (value > 10) {
            System.out.println("Число " + value + " больше 10");
        } else {
            if (value < 10) {
                System.out.println("Число " + value + " меньше 10");
            } else {
                System.out.println("Число " + value + " равно 10");
            }
        }


        boolean statement = true;
        int a = 10;
        int b = 5;
        statement = a > b;
        System.out.println(statement);
        a = 50;
        b = 25;
        statement = a > b;
        System.out.println(statement);
        a = 67;
        b = 23;
        statement = a < b;
        System.out.println(statement);
        a = 90;
        b = 80;
        statement = a == b;
        System.out.println(statement);
        System.out.println("Введите число:");
        a = scan.nextInt();
        b = 60;
        statement = a == b;
        System.out.println(statement);
        a = 100;
        System.out.println("Введите число больше 100:");
        b = scan.nextInt();
        statement = a < b;
        System.out.println(statement);
        b = 60;
        System.out.println("Введите число (ПРАВИЛЬНОЕ 30):");
        a = scan.nextInt() + b/2;
        statement = a == b;
        System.out.println(statement);
        b= 146;
        System.out.println("Введите число (ПРАВИЛЬНОЕ 73):");
        a = scan.nextInt() + b/2;
        statement = a == b;
        System.out.println(statement);

        
        System.out.println("Что говорит кошка?");
        String answer = scan.nextLine();
        String check = "мяу";
        if (answer.equalsIgnoreCase(check)) {
           System.out.println("Да, верно!");
        } else {
            System.out.println("Это говорит какое-то другое животное…");
        }


        System.out.println("Введите число 1:");
        int value1 = scan.nextInt();
        System.out.println("Введите число 2:");
        int value2 = scan.nextInt();
        boolean statement1 = value1 > value2;
        boolean statement2 = value1 < value2;
        if (statement1 == true) {
            System.out.println("Первое введённое число меньше второго");
            System.exit(0);
        }
        if (statement2 == true) {
            System.out.println("Первое введённое число больше второго");
            System.exit(0);
        }
        System.out.println("Числа равны. ");
    }
}
