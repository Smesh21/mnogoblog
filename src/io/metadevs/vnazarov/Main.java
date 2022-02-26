package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10:");
        int userInput = sc.nextInt();
        sc.close();
        if (userInput < 10 & userInput > 1) {
            for (int i = 1; i < userInput+1; i++) {
                System.out.println("Квадрат " + i + " равен " + (i * i));
        }
        } else {
System.out.println("Введено некоректное число");
        }
    }
}
