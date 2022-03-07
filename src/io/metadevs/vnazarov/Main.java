package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int c;
        System.out.println("Введите число:");
        a = sc.nextInt();
        System.out.println("Введите число:");
        c = sc.nextInt();
        sc.close();
        if (a > c) {
            System.out.println("Число " +a +" больше " +c);
        } else if (a < c) {
            System.out.println("Число " +c +" больше " +a);
        } else {
            System.out.println("Числа равны: " +a +" = " +c);
        }
    }
}
