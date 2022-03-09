package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println("Введите что либо, если ничего не введете, программа проинформирует.");
        userInput = sc.nextLine();
        sc.close();
        if (userInput.isEmpty()) {
            System.out.println("Вы ничего не ввели");
        } else {
            System.out.println(userInput);
        }
    }
}
