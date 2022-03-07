package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {
        String array[][] = {{"Зима", "Весна", "Лето", "Осень"},
                {"Папа", "Мама", "Сын", "Дочь"},
                {"Холодно", "Тепло", "Жарко", "Комфортно"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}