package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {

        int array[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
    }

