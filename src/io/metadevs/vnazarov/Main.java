package io.metadevs.vnazarov;

public class Main {

        public static void main(String[] args) {
            int season = (int) (Math.random() * 4);

            switch (season) {
                case 0:
                    System.out.println("Зима");
                    break;
                case 1:
                    System.out.println("Весна");
                    break;
                case 2:
                    System.out.println("Лето");
                    break;
                default:
                    System.out.println("Осень");
            }
        }
    }
