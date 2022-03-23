package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {

            Stud student1 = new Stud();
            student1.name = "Вася ";

            Stud student2 = new Stud();
            student2.name = "Петя ";

            Stud student3 = new Stud();
            student3.name = "Саша ";

            double mediumMarks = (double) (student1.mark + student2.mark + student3.mark) / 3;

            System.out.println(student1.name + student1.mark);
            System.out.println(student2.name + student2.mark);
            System.out.println(student3.name + student3.mark);
            System.out.println("Средняя оценка:" + mediumMarks);
    }
}
