package io.metadevs.vnazarov;

public class Main {

        public static void main(String[] args) {
            int petya = (int) (Math.random() * 3);
            int vasya = (int) (Math.random() * 3);

            if (petya == vasya) {
                System.out.println("Ничья");
            } else {

            switch (petya){
                case 0:
                    System.out.println("Петя выбросил камень");
                    if (vasya == 2) {
                        System.out.println("Вася выбросил бумагу");
                        System.out.println("Победил Вася");
                    } else {
                        System.out.println("Вася выбросил ножницы");
                        System.out.println("Победил Петя");
                    }
                    break;
                case 1:
                    System.out.println("Петя выбросил ножницы");
                    if (vasya == 0) {
                        System.out.println("Вася выбросил камень");
                        System.out.println("Победил Вася");
                    } else {
                        System.out.println("Вася выбросил бумагу");
                        System.out.println("Победил Петя");
                    }
                    break;
                case 2:
                    System.out.println("Петя выбросил бумагу");
                    if (vasya == 1) {
                        System.out.println("Вася выбросил ножницы");
                        System.out.println("Победил Вася");
                    } else {
                        System.out.println("Вася выбросил камень");
                        System.out.println("Победил Петя");
                    }
                    break;
            }
           }
        }
    }
