package io.metadevs.vnazarov;

public class Main {

        public static void main(String[] args) {
            int exam = (int) (Math.random() * 10 + 1);

            switch (exam) {
                case 1:
                case 2:
                    System.out.println("Отметка: " + exam + "- ужасно");
                    break;
                case 3:
                case 4:
                    System.out.println("Отметка: " + exam + "- плохо");
                    break;
                case 5:
                case 6:
                    System.out.println("Отметка: " + exam + "- удовлетворительно");
                    break;
                case 7:
                case 8:
                    System.out.println("Отметка: " + exam + "- хорошо");
                    break;
                case 9:
                case 10:
                    System.out.println("Отметка: " + exam + "- отлично");
                    break;
            }
        }
    }

