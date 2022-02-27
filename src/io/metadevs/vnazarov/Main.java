package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива. Программа определяет количество определенного числа в массиве от одного до 10");
        int userInput = sc.nextInt();
        int[] array = new int[userInput];
        System.out.println("Введите искомое число");
        int desiredNumber = sc.nextInt();
        sc.close();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        int numOut = 0;
        for (int n : array) {
            if (n == desiredNumber) {
                numOut = numOut + 1;
            }
        }
        System.out.println("Число "+desiredNumber +"встречается " +numOut +" Раз(а)");

}
}
