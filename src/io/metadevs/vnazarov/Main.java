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

        Float aFloat = (float) a;
        Float bFloat = (float) b;
        Float cFloat = (float) c;
        Float dFloat = (float) d;

        System.out.println("Double to float: " +aFloat +" " +bFloat +" " +cFloat +" "  +dFloat);

        double aFtD = (double) aFloat;
        double bFtd = (double) bFloat;
        double cFtd = (double) cFloat;
        double dFtd = (double) dFloat;

        System.out.println("Float to duble: " +aFtD +" " +bFtd +" " +cFtd +" "  +dFtd);
    }
}
