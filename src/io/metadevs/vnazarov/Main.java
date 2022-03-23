package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {

            Stud student1 = new Stud("Вася ");

            Stud student2 = new Stud("Петя ");

            Stud student3 = new Stud("Саша ");

            double mediumMarks = (double) (student1.mark + student2.mark + student3.mark) / 3;

            System.out.println(student1.name + student1.mark);
            System.out.println(student2.name + student2.mark);
            System.out.println(student3.name + student3.mark);
            System.out.println("Средняя оценка:" + mediumMarks);
    }
}
