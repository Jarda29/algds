package cz.uhk.fim.algds;

import java.util.Random;
import java.util.Scanner;

public class Lesson03GroupB {
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
        //example02b();
        //example03();
        //example04();
        //example04b();
        //example05();
        //example06();
        //example07();
        //example08();
        //example09();
        //example10();
        example11();
    }

    private static void example01() {
        print("Running example 01");

        boolean canDoIt = true;

        int a = 5;
        boolean b = a == 5;
        if (b) {

        }


        if (canDoIt) {

        } else {

        }


        if (!canDoIt) {

        } else {

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
            print("A je stejné jako B");
        } else {
            if (a > b) {
                min = b;
                max = a;
            }
            print("Min: " + min + ", max: " + max);
        }
    }

    private static void example02b() {
        print("Running example 02b");
        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a == b) {
            print("A je stejné jako B");
        } else {
            if (a > b) {
                print("A je větší než B");
            } else {
                print("B je větší než A");
            }
        }
    }

    private static void example03() {
        print("Running example 03");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double min, mid, max;

        if (a == b && b == c) {
            print("A je stejné jako B a C");
            return;
        } else if (a < b && a < c && b < c) {
            min = a;
            mid = b;
            max = c;
        } else if (a < b && a < c && c < b) {
            min = a;
            mid = c;
            max = b;
        } else {
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

    private static void example04b() {
        print("Running example 04");
        boolean next = true;
        int x = input.nextInt();
        int min = x;
        int max = x;

        while (next) {
            if (x == -1) {
                next = false;
            } else {
                if (x > max) {
                    max = x;
                }
                if (x < min) {
                    min = x;
                }
                x = input.nextInt();
            }
        }
        print("min: " + min + ", max: " + max);
    }

    private static void example04c() {
        print("Running example 04");

        int x = input.nextInt();
        int min = x;
        int max = x;

        while (x != -1) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            x = input.nextInt();
        }
        print("min: " + min + ", max: " + max);
    }

    private static void example05() {
        print("Running example 05");
        int counterEven = 0; // sudá
        int counterOdds = 0; // lichá
        int x = input.nextInt();
        while (x != -1) {
            if (x % 2 == 0) {
                counterEven++;
            } else
                counterOdds++;
            x = input.nextInt();
        }
        print("evens: " + counterEven + ", odds: " + counterOdds);
    }

    private static void example06() {
        print("Running example 06");
        int evens = 0; // sudá
        int odds = 1; // lichá
        int x = input.nextInt();
        while (x != -1) {
            if (x % 2 == 0) {
                evens += x;     // stejny zapis jako: evens = evens + x;
            } else
                odds *= x;
            x = input.nextInt();
        }
        print("evens: " + evens + ", odds: " + odds);
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
            sum += x;
            multi *= x;
            totalNumbers++;
            if (x < min)
                min = x;
            if (x > max)
                max = x;
            x = input.nextInt();
        }
        print("sum: " + sum);
        print("multi: " + multi);
        print("total numbers: " + totalNumbers);
        print("min: " + min);
        print("max: " + max);
    }

    private static void example08() {
        print("Running example 08");
        int price = 69;
        int paid = 0;
        while (paid < price) {
            int x = input.nextInt();
            paid += x;          // paid = paid + x;
        }
        int diff = paid - price;
        if (diff == 0) {
            print("No money to return");
        } else {
            print("Money to return: " + diff);
        }
    }

    private static void example08c() {
        print("Running example 08");
        int price = 69;
        int paid = 0;
        while (paid < price) {
            int x = input.nextInt();
            paid += x;          // paid = paid + x;
        }
        if (paid == price) {
            print("No money to return");
        } else {
            print("Money to return: " + (paid - price));
        }
    }

    private static void example09() {
        print("Running example 09");
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        print("Náhodné číslo je: " + randomNumber);
        int x = input.nextInt();
        while (x != randomNumber) {
            print("Ne");
            x = input.nextInt();
        }
        print("Našel si ho");
    }

    private static void example10() {
        print("Running example 10");
        int max = 500;
        int sum = 0;
        while (sum < max) {
            int x = input.nextInt();
            if (sum + x > max) {
                print("To je moc");
            } else {
                sum += x;
            }
            print("Mezivýsledek: " + sum);
        }
        print("Dosaženo: " + sum);
    }

    private static void example11() {
        int i = 1;
        while (i<=10) {
            print("Číslo: " + i);
            i++;
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
