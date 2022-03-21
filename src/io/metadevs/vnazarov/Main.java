package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {
            int mark1 = (int) (Math.random() * 10) + 1;
            int mark2 = (int) (Math.random() * 10) + 1;
            int mark3 = (int) (Math.random() * 10) + 1;
            double mediumMarks;

            Stud student1 = new Stud();
            student1.name = "Вася ";
            student1.mark = mark1;

            Stud student2 = new Stud();
            student2.name = "Петя ";
//            student2.mark = mark2;

            Stud student3 = new Stud();


            mediumMarks = (double) (student1.mark + student2.mark + student3.mark) / 3;

            System.out.println(student1.name + student1.mark);
            System.out.println(student2.name + student2.mark);
            System.out.println(student3.name + student3.mark);
            System.out.println("Средняя оценка:" + mediumMarks);
    }
}
