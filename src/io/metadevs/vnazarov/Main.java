package io.metadevs.vnazarov;

public class Main {

        public static void main(String[] args) {
            int first = (int) (Math.random() * 2);
            int second = (int) (Math.random() * 2);
            int third = (int) (Math.random() * 2);
            int result = 0;

            if (first == 1) {
                System.out.println("Хорошо");
            } else {
                System.out.println("Плохо");
            }
            if (second == 1) {
                System.out.println("Хорошо");
            } else {
                System.out.println("Плохо");
            }
            if (third == 1) {
                System.out.println("Хорошо");
            } else {
                System.out.println("Плохо");
            }
        }
    }