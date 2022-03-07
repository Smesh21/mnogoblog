package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число для вычисления тригонометрических функций:");
        Scanner sc = new Scanner(System.in);
        double userInput = sc.nextInt();
        sc.close();
        double sinA, cosA, tanA, asinA, acosA, atanA;
        sinA = Math.sin(userInput);
        cosA = Math.cos(userInput);
        tanA = Math.tan(userInput);
        asinA = Math.asin(userInput);
        acosA = Math.acos(userInput);
        atanA = Math.atan(userInput);
        System.out.println("sin " + userInput + " = " + sinA);
        System.out.println("cos " + userInput + " = " + cosA);
        System.out.println("tan " + userInput + " = " + tanA);
        System.out.println("asin " + userInput + " = " + asinA);
        System.out.println("acos " + userInput + " = " + acosA);
        System.out.println("atan " + userInput + " = " + atanA);
    }
}
