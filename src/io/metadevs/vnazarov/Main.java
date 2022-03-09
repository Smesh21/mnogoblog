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
                    if (vasya == 2) {
                        System.out.println("Победил Вася");
                    } else {
                        System.out.println("Победил Петя");
                    }
                    break;
                case 1:
                    if (vasya == 3) {
                        System.out.println("Победил Вася");
                    } else {
                        System.out.println("Победил Петя");
                    }
                    break;
                case 2:
                    if (vasya == 1) {
                        System.out.println("Победил Вася");
                    } else {
                        System.out.println("Победил Петя");
                    }
                    break;
            }
        }
    }
}