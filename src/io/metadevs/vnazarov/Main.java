package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {
        int[] home = new int[3];
        String[] family = new String[3];
        family[0]="Папа";
        family[1]="Мама";
        family[2]="Сын";
        for (int n = 0; n < home.length; n++) {
            home[n] = (int) (Math.random() * 2);
            if (home[n] == 1) {
                System.out.println(family[n]+" дома");
            } else {
                System.out.println(family[n]+" не дома");
            }
        }
    }
}
