package io.metadevs.vnazarov;

public class Main {

        public static void main(String[] args) {
            int testCAP = 3;
            for (int i = 0; i < testCAP; i++) {
                int test = (int) (Math.random() * 10+1);
                if (test > 4) {
                    System.out.println("Хорошо");
                } else {
                    System.out.println("Плохо");
            }
            }
        }
    }