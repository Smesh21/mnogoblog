package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {
        double a = 1.55;
        double b = 1.77;
        double c = 1.88;
        double d = 1.12345678901;

        System.out.println("Double: " +a +" " +b +" " +c +" " +d);

        int aInt = (int) a;
        int bInt = (int) b;
        int cInt = (int) c;
        int dInt = (int) d;

        System.out.println("Double to int: " +aInt +" " +bInt +" " +cInt +" " +dInt);

        String aString = a +"";
        String bString = b +"";
        String cString = Double.toString(c);
        String dString = Double.toString(d);

        System.out.println("Double to string: " +aString +" " +bString +" " +cString +" "  +dString);

        float aFloat = (float) a;
        float bFloat = (float) b;
        float cFloat = (float) c;
        float dFloat = (float) d;

        System.out.println("Double to float: " +aFloat +" " +bFloat +" " +cFloat +" "  +dFloat);

        double aFtD = aFloat;
        double bFtd = bFloat;
        double cFtd = cFloat;
        double dFtd = dFloat;

        System.out.println("Float to duble: " +aFtD +" " +bFtd +" " +cFtd +" "  +dFtd);
    }
}
