package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        userLoop:
        while (true) {
            System.out.println("Введите переменную 1:");
            double value1 = scan.nextDouble();
            System.out.println("Введите переменную 2:");
            double value2 = scan.nextDouble();
            System.out.println("Введите номер операции: \n1- Сложение 2- Вычитание 3- Умножение 4- Деление 5- Синусы чисел \n6- Косинусы чисел 7- Корни чисел 8- Квадраты чисел 666- Выход");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    System.out.println(value1+value2);
                    break;
                case 2:
                    System.out.println(value1-value2);
                    break;
                case 3:
                    System.out.println(value1*value2);
                    break;
                case 4:
                    if (value2 != 0) {
                        System.out.println(value1/value2);
                    }else {
                        System.out.println("Ваш компуктер сча взорвется");
                    }
                    break;
                case 5:
                    System.out.println("Синус переменной 1: "+Math.sin(value1)  +"\nСинус переменной 2: "+Math.sin(value2) );
                    break;
                case 6:
                    System.out.println("Косинус переменной 1: "+Math.cos(value1)  +"\nКосинус переменной 2: "+Math.cos(value2) );
                    break;
                case 7:
                    System.out.println("Корень переменной 1: "+Math.sqrt(value1)  +"\nКорень переменной 2: "+Math.sqrt(value2) );
                    break;
                case 8:
                    System.out.println("Корень переменной 1: "+Math.pow(value1,value1)  +"\nКорень переменной 2: "+Math.pow(value2,value2));
                    break;
                case 666:
                    break userLoop;
                default:
                    System.out.println("Операция не определена");
            }
        }
    }
}
