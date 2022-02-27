package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int userInput = sc.nextInt();
        sc.close();
        if (userInput < 1 || userInput > 10) {
            System.out.println("Неверное число");
        } else {
            int[] array = new int[userInput];

            for (int i = 0; i < userInput; i++) {
                array[i] = (int) (Math.random() * 10 + 1);
                System.out.print(array[i]);
                if (i == (userInput - 1)) {
                    System.out.print(".");
                } else {
                    System.out.print(", ");
                }
            }
        }
    }
}