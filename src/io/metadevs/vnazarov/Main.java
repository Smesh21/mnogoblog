package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {

        String[] student = { "Маша", "Даша", "Паша", "Оля", "Коля" };
        String[] doing = { " смотрит", " учит", " читает", " мучит", " пишет" };
        String[] object = { " урок.", " тест.", " текст.", " задание.", " д/з." };

        int studentPosition = (int) (Math.random() * student.length);
        int doingPosition = (int) (Math.random() * doing.length);
        int objectPosition = (int) (Math.random() * object.length);

        System.out.println(student[studentPosition] + doing[doingPosition] + object[objectPosition]);

    }
}
