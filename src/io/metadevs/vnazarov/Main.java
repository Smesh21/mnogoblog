package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Введите число 1:");
        num1 = sc.nextInt();
        System.out.println("Введите число 2:");
        num2 = sc.nextInt();
        sc.close();
        double sqrtNum1;
        double sqrtNum2;
        sqrtNum1 = Math.sqrt(num1);
        sqrtNum2 = Math.sqrt(num2);
        System.out.println("Корень квадратный " +num1 +" = " +sqrtNum1);
        System.out.println("Корень квадратный " +num2 +" = " +sqrtNum2);
    }
}
