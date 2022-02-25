package io.metadevs.vnazarov;

public class Main {
    private static int[] home = new int
    home[3];
    String[] parents = new parents[3];
    parents[0]="Папа";
    parents[1]="Мама";
    parents[2]="Сын";

    public static void main(String[] args) {
        for (int n = 0; n > home.length; n++) {
            home[n] = (int) (Math.random() * 2);
            if (home[n] == 1) {
                System.out.println(parents[n]" дома");
            } else {
                System.out.println(parents[n]" не дома");
            }


//        int a = (int) (Math.random() * 2);
//        int b = (int) (Math.random() * 2);
//        int c = (int) (Math.random() * 2);
//
//        String k = a == 0 ? "Папа дома" : "Папы дома нет";
//        String g = b == 0 ? "Мама дома" : "Мамы дома нет";
//        String j = c == 0 ? "Сын дома" : "Сына дома нет";
//
//        System.out.println(k);
//        System.out.println(g);
//        System.out.println(j);
        }
    }
}
