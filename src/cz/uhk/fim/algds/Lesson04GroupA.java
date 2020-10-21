package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson04GroupA {
    /*
        definice a inicializace objektu Scanner pro nacitani vstupu od uzivatele
        - cele cislo:       int a = input.nextInt();
        - desetinne cislo:  double b = input.nextDouble();
        - desetinne cislo:  float c = input.nextFloat();
        - textovy retezec:  String d = input.nextLine();
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //example01();
        //example02();
        example03();
    }

    private static void example01() {
        print("Running example 01");
        int number = input.nextInt();
        int result = 0;
        while (number > 0) {
            result = result + number % 10;
            number = number / 10;
        }
        print("Výsledek je: " + result);
    }

    private static void example02() {
        print("Running example 02");
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int a = input.nextInt();
            if (a == 3)
                count++;
        }
        print("Počet trojek: " + count);
    }

    private static void example03() {
        print("Running example 03");
        int min = 0;
        int max = 0;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < 10; i++) {
            int a = input.nextInt();
            if (i == 0) {
                min = a;
                max = a;
            }
            if (min >= a) {
                min = a;
                minIndex = i;
            }
            if (max <= a) {
                max = a;
                maxIndex = i;
            }
        }
        print("Min je " + min + " a je na " + (minIndex + 1) + ". miste");
        print("Max je " + max + " a je na " + (maxIndex + 1) + ". miste");

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
