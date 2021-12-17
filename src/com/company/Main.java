package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("hell yeah");
        int value1 = 5;
        int value2 = 0;
        int sum = value1 + value2;
        System.out.println("Сумма " + sum);
        int multiply = value1 * value2;
        System.out.println("Произведение " + multiply);
        int difference = value1 - value2;
        System.out.println("Разность " + difference);
        Scanner scanner = new Scanner(System.in);
        //String userInput = scanner.next();
        String userInput = new Scanner(System.in).next();
        System.out.println(userInput);
        // write your code here
    }
}
