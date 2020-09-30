package cz.uhk.fim.algds; // podle struktury projektu

import java.util.Scanner;
// Toto je komentář na jeden řádek
/*
Toto je komentář na více řádků
 */
/**
 * Definice tridy s nazvem "AlgdsCviceni"
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
        //Pro spuštění příkladu odkomentujte řádek

        //example01();
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


    // Příklad 1 - načtení proměnné
    private static void example01() {
        print("Running example 01");
        int a;                          // deklarace proměnné a
        print("Type a number");
        a = input.nextInt();            // načtení proměnné od uživatele
        print("Your number is: " + a);
    }
    // Příklad 2 - načtení proměnných a jejich součet
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
    // Příklad 3a - dělení
    private static void example3a() {
        print("Running example 03a");
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        double result = a / b;
        print("The result is: " + result);
    }
    // Příklad 3b - modulo
    private static void example3b() {
        print("Running example 03b");
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        double result = a % b;
        print("The result is: " + result);
    }
    // Příklad 4
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
    // Příklad 5
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
    // Příklad 6a - prohození proměnných
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
    // Příklad 6b - prohození proměnných bez pomocné
    private static void example06b() {
        print("Running example 06b");
        int a = 1;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        print("a: " + a + " | b:" + b);
    }
    // Příklad 7 - výpočet rovnice
    private static void example07() {
        print("Running example 07");
        int r = 3;
        int v = 5;
        double result = 3.14 * r * r * v;
        print("The result is: " + result);
    }
    // Příklad 8 - ukázka podmínky if
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
    // Příklad 9 - Ukázka podmínky if, kalkulačka
    private static void example09() {
        print("Running example 09");
        print("Type the first number");
        int a = input.nextInt();
        print("Type the second number");
        int b = input.nextInt();

        print("Type the operator: + - * /");
        input.nextLine();                   // je potřeba zavolat před načítáním textu od uživatele, v případě že se předtím načítala čísla
        String operator = input.nextLine();

        double result = 0;
        if (operator.equals("+")) {         // v Javě je nutné pužít tento zápis místo klasického operator == "+"
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        } else if (operator.equals("*")) {
            result = a * (double) b;        // druhé číslo přetypujeme na double, aby byl výsledek double
        } else if (operator.equals("/")) {
            result = a / (double) b;        // jmenovatele přetypujeme na double, aby byl výsledek double
        } else {
            print("Unknown operator");
            return;                         // ukončení, výpis výsledku se neprovede
        }
        print("The result is: " + result);
    }


    //Metody pro zkrácení výpisu, aby nebylo potřeba psát System.out.println - stačí zkráceně print
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
