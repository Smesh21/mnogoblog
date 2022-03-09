package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {
        String text = "Папа дома, мама дома, сын дома, дочь дома.";
        System.out.println(text);
        String replaceText1 = text.replace("дома", "в школе");
        System.out.println(replaceText1);
        String replaceText2 = replaceText1.replace("сын", "Ваня");
        System.out.println(replaceText2);
        String replaceFinal = replaceText2.replace("дочь", "Оля");
        System.out.println(replaceFinal);
    }
}
