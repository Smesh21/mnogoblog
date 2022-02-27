package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {
        String[] home = { "папа", "мама", "сын", "дочь" };

        for (String a : home) {
            System.out.println("Здравствуй, " + a);
        }
        for (String b : home) {
            System.out.println("Пока, " + b);
        }
    }
}
