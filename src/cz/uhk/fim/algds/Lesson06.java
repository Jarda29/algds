package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson06 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //task01();
        //task02();
        //task03();
        //task04();
    }

    private static void task01(){
        print("Running 01");
        print("Zadej x1: ");
        int x1 = input.nextInt();
        print("Zadej x2: ");
        int x2 = input.nextInt();
        print("Zadej x3: ");
        int x3 = input.nextInt();
        print("Zadej x4: ");
        double x4 = input.nextDouble();
        print("Zadej x5: ");
        double x5 = input.nextDouble();

        int moduloCela = (x2 % x3) % x1;
        double deleniRealna = x5 / x4;

        double soucin = moduloCela * deleniRealna;
        print("Vysledek je "+soucin);
    }
    private static void task02(){
        print("Running 02");
        print("Zadej rok narozeni: ");
        int rokNarozeni = input.nextInt();
        if ((2020 - rokNarozeni) < 18) {
            print("Ne");
        } else {
            print("Ano");
        }
    }
    private static void task03(){
        print("Running 04");
        boolean nactiDalsi = true;
        while (nactiDalsi) {
            print("Zadej cislo: ");
            int cislo = input.nextInt();
            if (cislo >= 0 && cislo <= 100) {
                if (cislo % 2 == 0) {
                    print("Cislo "+cislo+" je sude.");
                } else {
                    print("Cislo "+cislo+" je liche.");
                }
            } else {
                nactiDalsi = false;
            }
        }
    }
    private static void task04(){
        print("Running 04");
        print("Zadej 1. citatele: ");
        int citatelA = input.nextInt();
        print("Zadej 1. jmenovatele: ");
        int jmenovatelA = input.nextInt();
        print("Zadej 2. citatele: ");
        int citatelB = input.nextInt();
        print("Zadej 2. jmenovatele: ");
        int jmenovatelB = input.nextInt();

        print(citatelA+"/"+jmenovatelA+" + "+citatelB+"/"+jmenovatelB);
        int scitaniCitatel = (citatelA * jmenovatelB) + (citatelB * jmenovatelA);
        int scitaniJmenovatel = jmenovatelA*jmenovatelB;
        print("("+(citatelA * jmenovatelB)+" + "+citatelB * jmenovatelA+") / "+scitaniJmenovatel+" = "+scitaniCitatel+"/"+scitaniJmenovatel);

        print(citatelA+"/"+jmenovatelA+" - "+citatelB+"/"+jmenovatelB);
        int odcitaniCitatel = (citatelA * jmenovatelB) - (citatelB * jmenovatelA);
        int odcitaniJmenovatel = jmenovatelA * jmenovatelB;
        print("("+citatelA * jmenovatelB+" - "+citatelB * jmenovatelA+") / "+odcitaniJmenovatel+" = "+odcitaniCitatel+"/"+odcitaniJmenovatel);

        print(citatelA+"/"+jmenovatelA+" * "+citatelB+"/"+jmenovatelB);
        int nasobeniCitatel = citatelA * citatelB;
        int nasobeniJmenovatel = jmenovatelA * jmenovatelB;
        print("("+citatelA+" * "+citatelB+") / "+nasobeniJmenovatel+" = "+nasobeniCitatel+"/"+nasobeniJmenovatel);

        print(citatelA+"/"+jmenovatelA+" : "+citatelB+"/"+jmenovatelB);
        int deleniCitatel = citatelA * jmenovatelB;
        int deleniJmenovatel = jmenovatelA * citatelB;
        print("("+citatelA+" * "+jmenovatelB+") / "+deleniJmenovatel+" = "+deleniCitatel+"/"+deleniJmenovatel);
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
