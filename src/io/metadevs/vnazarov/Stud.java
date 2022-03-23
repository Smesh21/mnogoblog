package io.metadevs.vnazarov;

public class Stud {
    public Stud(String name) {
        this.name = name;
        this.mark = (int) (Math.random() * 10) + 1;

    }
    String name;
    int mark;
}
