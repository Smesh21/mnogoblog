package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String checkWord = "аккумулятор";
        System.out.println("В слове 'акамулятор' есть ошибки, исправьте ошибки.");
        System.out.println("Введите слово правильно:");
        String userInput = sc.nextLine();
        sc.close();

        if (userInput.equals(checkWord)) {
            System.out.println(checkWord + " Вы ввели без ошибок");
        } else {
            System.out.println(checkWord + " Ошибки присутствуют");
        }
    }
    }

