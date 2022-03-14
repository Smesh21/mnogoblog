package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {
        String[][] array = {{"Зима", "Весна", "Лето", "Осень"},
                {"Папа", "Мама", "Сын", "Дочь"},
                {"Холодно", "Тепло", "Жарко", "Комфортно"}};
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}