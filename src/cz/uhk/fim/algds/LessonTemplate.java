package cz.uhk.fim.algds;

import java.util.Scanner;
// Toto je komentář na jeden řádek
/*
Toto je komentář na více řádků
 */
/**
 * Definice tridy s nazvem "LessonTemplate"
 * Nazvy trid:
 * - zacinaji velkym pismenem, kazde dalsi slovo zacina take velkym pismenem
 * - nazev by mel odpovidat tomu, k cemu dana trida slouzi
 * Nazvy trid NEVYPADAJI nasledovne:
 * - nezacinaji cislem: pr. 3cviceni
 * - jednotliva slova nejsou oddelena mezerou, podtrzitkem, pomlckou, apod: pr. treti_cviceni_algoritmu
 * - nejsou napsana dohromady malymi pismeny: pr. treticvicenialgoritmu
 */
public class LessonTemplate {
    /*
        definice a inicializace objektu Scanner pro nacitani vstupu od uzivatele
        - cele cislo:       int a = input.nextInt();
        - desetinne cislo:  double b = input.nextDouble();
        - desetinne cislo:  float c = input.nextFloat();
        - textovy retezec:  String d = input.nextLine();
     */
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        example01();
    }

    private static void example01(){
        print("Running example 01");

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
