package io.metadevs.vnazarov;

public class Stud {
    public Stud(int mark) {
        this.mark = mark;
    }
    public Stud() {
        this.mark = (int) (Math.random() * 10) + 1;;
    }
    String name;
    int mark;
}
