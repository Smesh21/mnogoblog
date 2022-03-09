package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {
        String[] family = { "папа", "мама", "сын", "дочь" };

        for (String hello : family) {
            System.out.println("Здравствуй, " + hello);
        }
        for (String bye : family) {
            System.out.println("Пока, " + bye);
        }
    }
}
