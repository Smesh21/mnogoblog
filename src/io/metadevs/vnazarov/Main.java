package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {
        for (int numbers = 1; numbers <= 10; numbers++) {
            System.out.print((numbers * numbers) + " ");
        }
        System.out.println(" ");
        for (int numbers = 10; numbers > 0; numbers--) {
            System.out.print((numbers * numbers) + " ");
        }
    }
}
