package io.metadevs.vnazarov;

public class Main {

        public static void main(String[] args) {
            int first = (int) (Math.random() * 10+1);
            int second = (int) (Math.random() * 10+1);
            int third = (int) (Math.random() * 10+1);

            if (first > 4) {
                System.out.println("Хорошо");
            } else {
                System.out.println("Плохо");
            }
            if (second > 4) {
                System.out.println("Хорошо");
            } else {
                System.out.println("Плохо");
            }
            if (third == 4) {
                System.out.println("Хорошо");
            } else {
                System.out.println("Плохо");
            }
        }
    }