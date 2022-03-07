package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа считает гипотинузу треугольника при помощи двух катетов.");
        Scanner sc = new Scanner(System.in);
        double leg1;
        double leg2;
        System.out.println("Введите катет 1:");
        leg1 = sc.nextInt();
        System.out.println("Введите катет 2:");
        leg2 = sc.nextInt();
        sc.close();
        double hyp = Math.hypot(leg1, leg2);
        System.out.print("Гипотенуза треугольника с катетами ");
        System.out.println(leg1 +" и " +leg2 +" = " +hyp);
    }
}
