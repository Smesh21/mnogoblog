package io.metadevs.vnazarov;

public class Main {

    private static int[] home = new int[3];

    public static void main(String[] args) {
        String[] parents = new String[3];
        parents[0]="Папа";
        parents[1]="Мама";
        parents[2]="Сын";
        for (int n = 0; n < home.length; n++) {
            home[n] = (int) (Math.random() * 2);
            if (home[n] == 1) {
                System.out.println(parents[n]+" дома");
            } else {
                System.out.println(parents[n]+" не дома");
            }
        }
    }
}
