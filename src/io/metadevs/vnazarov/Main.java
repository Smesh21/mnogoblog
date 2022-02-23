package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от одного до пяти:");
        int number = scan.nextInt();
        scan.close();
        switch (number) {
            case 1:
                System.out.println("Вы ввели число один");
                break;
            case 2:
                System.out.println("Вы ввели число два");
                break;
            case 3:
                System.out.println("Вы ввели число три");
                break;
            case 4:
                System.out.println("Вы ввели число четыре");
                break;
            case 5:
                System.out.println("Вы ввели число пять");
                break;
            default:
                System.out.println("Неверное число");
        }
    }
}