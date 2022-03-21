package io.metadevs.vnazarov;

public class Stud {
    public Stud(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    public Stud() {
        this.name = "defaultName ";
        this.mark = (int) (Math.random() * 10) + 1;;
    }
    String name;
    int mark;
}
