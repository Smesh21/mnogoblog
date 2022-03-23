package io.metadevs.vnazarov;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("коза ", "Катя ", 3);
        Animal animal2 = new Animal("корова ", "Зорька ", 4);
        Animal animal3 = new Animal("свинка ", "Мотя ", 2);

        System.out.println("У бабушки живут:");
        System.out.println(animal1.anim +animal1.name +animal1.age +" года");
        System.out.println(animal2.anim +animal2.name +animal2.age +" года");
        System.out.println(animal3.anim +animal3.name +animal3.age +" года");
    }
}
