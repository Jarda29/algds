package cz.uhk.fim.algds;

import java.util.Random;
import java.util.Scanner;

public class Lesson03GroupA {
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
        //example04c();
        //example05();
        //example06();
        //example07();
        //example08();
        //example09();
        //example10();
    }

    private static void example01() {
        boolean canDoIt = true;
        if (canDoIt) {
            print("I can do it");
        } else {

        }


        if (!canDoIt) {
            print("I cant do it");
        }

        int a = 5;
        boolean b = (a == 5);
        if (b) {

        }
    }

    private static void example02() {
        print("Running example 02");
        double a = input.nextDouble();
        double b = input.nextDouble();

        double min, max;
        min = a;
        max = b;

        if (a == b) {
            print("A = B");
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

        double max, min, mid;
        min = a;
        mid = b;
        max = c;

        if (a == b && b == c) {
            print("A = B a C");
            return;
        }
        if (a < b && a < c && b < c) {
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
                if (x < max) {
                    min = x;
                }
            }
        }
        print("min: " + min + ", max: " + max);
    }

    private static void example04b() {
        print("Running example 04");
        boolean next = true;
        int min = 0;
        int max = 0;

        int x = input.nextInt();
        min = x;
        max = x;
        while (next) {
            if (x == -1) {
                next = false;
            } else {
                if (x > max) {
                    max = x;
                }
                if (x < max) {
                    min = x;
                }
                x = input.nextInt();
            }
        }
        print("min: " + min + ", max: " + max);
    }

    private static void example04c() {
        print("Running example 04");
        int min = 0;
        int max = 0;

        int x = input.nextInt();
        min = x;
        max = x;
        while (x != -1) {
            if (x > max) {
                max = x;
            }
            if (x < max) {
                min = x;
            }
            x = input.nextInt();
        }
        print("min: " + min + ", max: " + max);
    }

    private static void example05() {
        print("Running example 05");
        int eventCount = 0; // sudé
        int oddsCount = 0;  // liché

        int x = input.nextInt();
        while (x != -1) {
            if (x % 2 == 0)
                eventCount++;
            else
                oddsCount++;

            x = input.nextInt();
        }
        print("evens: " + eventCount + ", odds: " + oddsCount);
    }

    private static void example06() {
        print("Running example 06");
        int even = 0; // sudé
        int odds = 1;  // liché

        int x = input.nextInt();
        while (x != -1) {
            if (x % 2 == 0)
                even += x;
            else
                odds *= x;

            x = input.nextInt();
        }
        print("evens: " + even + ", odds: " + odds);
    }

    private static void example07() {
        print("Running example 07");
        int sum = 0;
        int multi = 1;
        int totalNumbers = 0;
        int min, max;
        int x = input.nextInt();
        min = x;
        max = x;
        while (x != -1) {
            totalNumbers++;
            sum += x;
            multi *= x;
            if (x < min)
                min = x;
            if (x > max)
                max = x;
            x = input.nextInt();
        }
        print("sum: " + sum);
        print("multi: " + multi);
        print("total number: " + totalNumbers);
        print("min: " + min);
        print("max: " + max);

    }

    private static void example08() {
        print("Running example 08");
        double price = 66;
        double penize = 0;
        while (penize < price) {
            penize += input.nextDouble();
        }

        if (penize > price) {
            print("Zbytek: " + (penize - price));
        } else
            print("není cop vracet");
    }

    private static void example09() {
        print("Running example 09");
        Random rand = new Random();
        int randomNum = rand.nextInt(10);

        int x = input.nextInt();
        while (x != randomNum) {
            print("Ne");
            x = input.nextInt();
        }
        print("Našel si ho");
    }

    private static void example10() {
        print("Running example 10");

        int max = 500;
        int a = 0;
        while (a < max) {
            int x = input.nextInt();
            if (a + x > max) {
                print("To je moc");
            } else {
                a += x;
            }
            print("Mezivýsledek: "+a);
        }
        print("Doaženo " + a);
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
