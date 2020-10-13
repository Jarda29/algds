package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson03 {
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
        //example05();
        //example06();
        //example07();
        //example08();
    }

    private static void example01() {
        print("Running example 01");

        boolean canDoIt = true;
        if (canDoIt) {            // podminka se splni pokud je promenna true
            print("Doing something");
        }


        if (!canDoIt) {           // ! slouzi k negaci, tedy podminka se splni pokud je promenna false
            print("Cannot do it");
        }
    }

    private static void example02() {
        print("Running example 02");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double min = a;
        double max = b;

        if (a == b) {
            print("A je stejne jako B");
        } else {
            if (a > b) {
                min = b;
                max = a;
            }
            print("Min: " + min + ", max: " + max);
        }
    }

    private static void example03() {
        print("Running example 03");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double min = a;
        double mid = b;
        double max = c;


        if (a == b && b == c) {
            print("A je stejne jako B a C");
            return;
        } else if (a < b && a < c && b < c) {
            min = a;
            mid = b;
            max = c;
        } else if (a < b && a < c && c < b) {
            min = a;
            mid = c;
            max = b;
        } else if (b < a && b < c && c < a) {
            min = b;
            mid = c;
            max = a;
        }
        print("Min: " + min + ", mid: " + mid + ", max: " + max);
    }

    private static void example04() {
        print("Running example 04");
        boolean next = true;
        int min = 0;
        int max = 0;

        while (next) {
            int x = input.nextInt();
            if (x == -1) {
                next = false;
            } else {
                if (x > max) {
                    max = x;
                }
                if (x < min) {
                    min = x;
                }
            }
        }
        print("min: " + min + ", max: " + max);
    }

    private static void example05() {
        print("Running example 05");
        boolean next = true;
        int evenCount = 0; // sudé
        int oddsCount = 0; // liché

        while (next) {
            int x = input.nextInt();
            if (x == -1) {
                next = false;
            } else {
                if (x % 2 == 0)
                    evenCount++;
                else
                    oddsCount++;
            }
        }
        print("odds: " + oddsCount + ", even: " + evenCount);
    }

    private static void example06() {
        print("Running example 06");
        boolean next = true;
        int evenCount = 0; // sudé
        int oddsCount = 1; // liché

        while (next) {
            int x = input.nextInt();
            if (x == -1) {
                next = false;
            } else {
                if (x % 2 == 0)
                    evenCount += x;
                else
                    oddsCount *= x;
            }
        }
        print("odds: " + oddsCount + ", even: " + evenCount);
    }

    private static void example07() {
        print("Running example 07");
        boolean next = true;
        int sum = 0;        // soucet
        int multiply = 1;   // soucin
        int totalNumbers = 0;   // pocet cisel
        int min = 0;
        int max = 0;
        int x = input.nextInt();

        min = x;
        max = x;

        while (next) {
            if (x == -1) {
                next = false;
            } else {
                totalNumbers++;
                sum += x;
                multiply *= x;
                if (x < min)
                    min = x;
                if (x > max)
                    max = x;
                x = input.nextInt();
            }
        }
        print("sum: " + sum + ", multiply: " + multiply + ", total numbers: " + totalNumbers + ", min: " + min + ", max:" + max);
    }

    private static void example08() {
        print("Running example 08");
        int price = 66;
        int paid = 0;
        while (paid < price) {
            int x = input.nextInt();
            paid += x;
        }
        if(paid>price){
            print("money to return: "+(paid - price));
        }
        else{
            print("No money to return");
        }
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