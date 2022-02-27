package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {

        String[] students = { "Вася", "Петя", "Маша", "Оля", "Коля" };

        int[] grade = new int[5];

        for (int i = 0; i < grade.length; i++) {
            grade[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Оценки учеников:");
        for (int i = 0; i < grade.length; i++) {
            System.out.println(students[i] + " " + grade[i]);
        }
    }
}
