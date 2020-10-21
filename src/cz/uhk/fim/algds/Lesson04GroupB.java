package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson04GroupB {
    /*
        definice a inicializace objektu Scanner pro nacitani vstupu od uzivatele
        - cele cislo:       int a = input.nextInt();
        - desetinne cislo:  double b = input.nextDouble();
        - desetinne cislo:  float c = input.nextFloat();
        - textovy retezec:  String d = input.nextLine();
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //example00();
        //example01();
        //example02();
    }

    private static void example00() {
        for (int i = 1; i <= 10; i++) {
            print(i);
        }
    }

    private static void example01() {
        print("Running example 01");
        int cislo = input.nextInt();
        int vysledek = 0;

        while (cislo > 0) {
            int zbytek = cislo % 10;
            vysledek = vysledek + zbytek;
            cislo = cislo / 10;
        }
        print("Výsledek je: " + vysledek);
    }

    private static void example02() {
        print("Running example 02");

        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (input.nextInt() == 3)
                count++;
        }

        print("Počet trojek: " + count);
    }

    //Metody pro zkracení vypisu, aby nebylo potreba psat System.out.println - staci zkracene print
    private static void print(String text) {
        System.out.println(text);
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void print(double number) {
        System.out.println(number);
    }
}
