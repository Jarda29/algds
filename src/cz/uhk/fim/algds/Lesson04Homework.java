package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson04Homework {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //priklad1();
        //priklad2();
        //priklad3();
        priklad4();
    }

    private static void priklad1() {
        int a;
        int soucet = 0;
        int soucin = 1;
        for (int i = 0; i < 5; i++) {
            a = input.nextInt();
            soucet += a;
            soucin *= a;
        }
        System.out.println("Součet čísel je: " + soucet + ", součin čísel je: " + soucin);
    }

    private static void priklad2() {
        int soucet = 0;
        int zbytek = 0;
        for (int i = 0; soucet < 100; i++) {
            int a = input.nextInt();
            soucet += a;
        }
        if (soucet > 100) {
            zbytek = soucet - 100;
            System.out.println("Zbytek je: " + zbytek + ".");
        }
    }

    private static void priklad3() {
        int cislo = input.nextInt();
        for (int i = cislo - 1; i > 0; i--) {
            cislo *= i;
        }
        System.out.println(cislo);
    }

    private static void priklad4() {
        int cislo = input.nextInt();
        int pocitadlo = cislo;
        for (int i = 0; i < cislo; i++) {
            for (int j = 0; j < cislo; j++) {
                System.out.print(pocitadlo + " ");
                pocitadlo *= 2;
            }
            System.out.println("");
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
