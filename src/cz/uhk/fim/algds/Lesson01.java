package cz.uhk.fim.algds; // podle struktury projektu

import java.util.Scanner;
// Toto je komentar na jeden radek
/*
Toto je komentar na vice radku
 */
/**
 * Definice tridy s nazvem "Lesson01"
 * Trida je nezbytna pro beh apliakce v Jave, jelikoz Java je objektove orientovany jazyk,
 *  vice informaci se postupne dozvite v UOMO a Programovani 1
 * Nazvy trid:
 * - zacinaji velkym pismenem, kazde dalsi slovo zacina take velkym pismenem
 * - nazev by mel odpovidat tomu, k cemu dana trida slouzi
 * Nazvy trid NEVYPADAJI nasledovne:
 * - nezacinaji cislem: pr. 3cviceni
 * - jednotliva slova nejsou oddelena mezerou, podtrzitkem, pomlckou, apod: pr. treti_cviceni_algoritmu
 * - nejsou napsana dohromady malymi pismeny: pr. treticvicenialgoritmu
 */
public class Lesson01 {
    /*
        definice a inicializace objektu Scanner pro nacitani vstupu od uzivatele
        - cele cislo:       int a = input.nextInt();
        - desetinne cislo:  double b = input.nextDouble();
        - desetinne cislo:  float c = input.nextFloat();
        - textovy retezec:  String d = input.nextLine();
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Pro spusteni prikladu odkomentujte radek

        //example01(); // volani metody ("funkce") example01 - spusti se tedy kod napsany nize
        //example02();
        //example3a();
        //example3b();
        //example04();
        //example05();
        //example06a();
        //example06b();
        //example07();
        //example08();
        //example09();
    }


    // Priklad 1 - nacteni promenne
    private static void example01() {
        print("Running example 01");
        int a;                          // deklarace promenne a
        print("Type a number");
        a = input.nextInt();            // nacteni promenne od uzivatele
        print("Your number is: " + a);
    }
    // Priklad 2 - nacteni promennych a jejich soucet
    private static void example02() {
        print("Running example 02");
        int a;
        int b;
        int c;
        print("Type the first number");
        a = input.nextInt();
        print("Type the second number");
        b = input.nextInt();
        c = a + b;
        print("The result is: " + c);
    }
    // Priklad 3a - deleni
    private static void example3a() {
        print("Running example 03a");
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        double result = a / b;
        print("The result is: " + result);
    }
    // Priklad 3b - modulo
    private static void example3b() {
        print("Running example 03b");
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        double result = a % b;
        print("The result is: " + result);
    }
    // Priklad 4
    private static void example04() {
        print("Running example 04");
        int a = 3;
        int b = 5;
        int c = 8;
        a = 5;
        b = c; // b = 8
        c = a + b; // c = 5 + 8
        print("The result is: " + c);
    }
    // Priklad 5
    private static void example05() {
        print("Running example 05");
        int a = 8;
        int b = -2;
        int c = 9;
        a = b;
        b = c + 2;
        c = (b + a) * 2;
        print("The result is: " + c);
    }
    // Priklad 6a - prohozeni promennych
    private static void example06a() {
        print("Running example 06");
        int a = 1;
        int b = 3;
        int pom;
        pom = a;
        a = b;
        b = pom;
        print("a: " + a + " | b:" + b);
    }
    // Priklad 6b - prohozeni promennych bez pomocne
    private static void example06b() {
        print("Running example 06b");
        int a = 1;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        print("a: " + a + " | b:" + b);
    }
    // Priklad 7 - vypocet rovnice
    private static void example07() {
        print("Running example 07");
        int r = 3;
        int v = 5;
        double result = 3.14 * r * r * v;
        print("The result is: " + result);
    }
    // Priklad 8 - ukazka podminky if
    private static void example08(){
        print("Running example 09");
        print("Type your age");
        int age = input.nextInt();

        if(age >= 18){
            print("You are an adult");
        }
        else {
            print("You are not adult");
        }
    }
    // Priklad 9 - Ukazka podminky if, kalkulacka
    private static void example09() {
        print("Running example 09");
        print("Type the first number");
        int a = input.nextInt();
        print("Type the second number");
        int b = input.nextInt();

        print("Type the operator: + - * /");
        input.nextLine();                   // je potreba zavolat pred nacitanim textu od uzivatele, v pripade ze se predtim nacitala cisla
        String operator = input.nextLine();

        double result = 0;
        if (operator.equals("+")) {         // v Jave je nutne puzit tento zapis misto klasickeho operator == "+"
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        } else if (operator.equals("*")) {
            result = a * (double) b;        // druhe cislo pretypujeme na double, aby byl vysledek double
        } else if (operator.equals("/")) {
            result = a / (double) b;        // jmenovatele pretypujeme na double, aby byl vysledek double
        } else {
            print("Unknown operator");
            return;                         // ukonceni, vypis vysledku se neprovede
        }
        print("The result is: " + result);
    }


    //Metody pro zkraceni vypisu, aby nebylo potreba psat System.out.println - staci zkracene print
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
