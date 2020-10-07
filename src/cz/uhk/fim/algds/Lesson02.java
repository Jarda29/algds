package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson02 {
    /*
        definice a inicializace objektu Scanner pro nacitani vstupu od uzivatele
        - cele cislo:       int a = input.nextInt();
        - desetinne cislo:  double b = input.nextDouble();
        - desetinne cislo:  float c = input.nextFloat();
        - textovy retezec:  String d = input.nextLine();
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //example00();
        //example01();
        //example02();
        //example03();
        //example04();
        //example05();
        //example06();
        //example06b();
        //example07();
        //example07b();
    }

    private static void example00() {
        int a = 5;
        int b = 10;
        if (a < b) {

        }


        if (a > b) {

        } else {

        }


        if (a > b) {

        } else if (a == b) {

        } else {

        }
    }

    private static void example01() {
        print("Running example 01");
        int a = input.nextInt();
        int b = input.nextInt();

        int result1 = a + b;
        print("result 1: " + result1);

        print("result 2: " + (a - b));

        int result3 = a * b;
        print("result 3: " + result3);

        double result4 = a / (double) b;
        print("result 4: " + result4);
    }

    private static void example02() {
        print("Running example 02");
        int a = input.nextInt();
        if (a % 2 == 0)
            print("even"); // sude
        else
            print("odd"); // liche
    }

    private static void example03() {
        print("Running example 03");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int result = 0;
        if (a == 3)
            result = result + 1;
        if (b == 3)
            result += 1;
        if (c == 3)
            result++;
        if (d == 3)
            result += 1;
        print("Count of 3: " + result);
    }

    private static void example04() {
        print("Running example 04");
        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a > b)
            print("The first number is bigger");
        else if (a == b)
            print("Numbers are equal");
        else
            print("The second number is bigger");
    }

    private static void example05() {
        print("Running example 05");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int result;
        if (x > z)
            result = y + z;
        else
            result = y * x;
        print("Result: " + result);
    }

    private static void example06() {
        print("Running example 06");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c) {
            if (b + c > a) {
                if (c + a > b) {
                    print("ok");
                    return;
                }
            }
        }
        print("not ok");
    }

    private static void example06b() {
        print("Running example 06b");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c &&
                b + c > a &&
                c + a > b) {
            print("ok");

        } else {
            print("not ok");
        }
    }

    private static void example07() {
        print("Running example 07");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a < 5 || b < 5) {
            print("failed");
            return;
        }
        if ((a + b) < 12) {
            print("failed");
            return;
        }
        print("passed");
    }
    private static void example07b() {
        print("Running example 07b");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a < 5 || b < 5 || (a + b) < 12) {
            print("failed");
        }
        else
            print("passed");
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