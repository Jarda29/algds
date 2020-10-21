package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson04 {
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
        //example03();
        //example04();
        //example04b();
        //example05();
        //example05b();
        //example06();
        //example07();
    }

    private static void example01() {
        print("Running example 01");
        int cislo = input.nextInt();
        int vysledek = 0;
        while (cislo > 0) {
            vysledek = vysledek + cislo % 10;
            cislo = cislo / 10;
        }
        print("Result: " + vysledek);
    }

    private static void example02() {
        print("Running example 02");
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int a = input.nextInt();
            if (a == 3) {
                count++;
            }
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
            if(i == 0){
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

    private static void example04() {
        print("Running example 04");
        int a = input.nextInt();
        for (int i = -a; i <= a; i++) {
            print(i + "");
        }
    }

    private static void example04b() {
        print("Running example 04b");
        int a = input.nextInt();
        for (int j = a; j >= -a; j--) {
            print(j + "");
        }
    }

    private static void example05() {
        print("Running example 05");
        int a = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            print(i * a + "");
        }
    }

    private static void example05b() {
        print("Running example 05b");
        int a = input.nextInt();
        int b = 0;
        for (int j = 0; j < 10; j++) {
            b += a;
            print(b + "");
        }
    }

    private static void example06() {
        print("Running example 06");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " - ");
            for (int j = 1; j < 11; j++) {
                System.out.print(i * j + " ");
            }
            print("");
        }
    }

    private static void example07() {
        print("Running example 07");

        int a = input.nextInt();
        int pom = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(pom * pom + " ");
                pom++;
            }
            print("");
        }
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
