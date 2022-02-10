package io.metadevs.vnazarov;

public class PussyFeeder {
    static final int MAXFOOD = 7;
    static int[] CATFOOD = {0, 0, 0, 0, 0, 0};
    static int foodSum = 0;

    public static void main(String[] args) {
        label:
        while (true) {
            System.out.println("1- Покормить или отобрать еду у конкретного кота");
            System.out.println("2- Покормить или отобрать еду у всех котов сразу");
            System.out.println("3- Покормить или отобрать еду у четных или нечетных котов");
            System.out.println("Введите цифрой ваш выбор");
            String userInput = sc.nextLine();
            switch (userInput) {
                case "1":
                    feedOneCat();
                    break;
                case "2":
                    feedAllCats();
                    break;
                case "3":
                    feedSomeCats();
                    break;
                case "666":
                    System.exit(0);
                default:
                    System.out.println("Ввод некоректный. Повторите попытку");
                    break label;
            }
        }
    }
    public static void feedOneCat(){
        //base
    }

    public static void feedAllCats(){
        //base
    }

    public static void feedSomeCats(){
        //base
    }
}


