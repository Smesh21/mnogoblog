package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {
    private static int number;

    public static void main(String[] args) {
        int mounth = (int) ((Math.random() * 12) + 1);
        switch (mounth) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            default:
                System.out.println("Осень");
                break;
        }

        String[] mounth1 = new String[]{"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        int numberOfMounth = (int) Math.floor(Math.random() * mounth1.length+1);
        switch (numberOfMounth) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                System.out.println(mounth1[numberOfMounth]);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                System.out.println(mounth1[numberOfMounth]);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                System.out.println(mounth1[numberOfMounth]);
                break;
            default:
                System.out.println("Осень");
                System.out.println(mounth1[numberOfMounth]);
                break;
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число i:");
        int i = scan.nextInt();
        System.out.println("Введите число ''number'':");
        number = scan.nextInt();
        if (number < i) {
            for (int j = number; j < i; j++) {
                number = number + 1;
                System.out.println(number + " + любая фраза");
            }
        } else {
            System.out.println("Заданное число больше или равно i");
        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = ((a == 0) || (a == 2)) ? (a + 7) : (a / 10);
        System.out.println(a);
        String s = ((a > 0) && (a < 5)) ? "Верно" : "Неверно";
        System.out.println(s);

    }

}

