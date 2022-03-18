package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа считает гипотинузу треугольника при помощи двух катетов.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите катет 1:");
        double side1 = sc.nextDouble();
        System.out.println("Введите катет 2:");
        double side2 = sc.nextDouble();
        sc.close();
        double hyp = Math.hypot(side1, side2);
        System.out.print("Гипотенуза треугольника с катетами ");
        System.out.println(side1 +" и " +side2 +" = " +hyp);
    }
}
