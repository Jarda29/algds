package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson01 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //example01();
        //example02();
        //example3a();
        //example3b();
        //example04();
        //example05();
        //example06();
        //example06b();
        //example07();
    }

    private static void example01(){
        print("Running example 01");
        int a;
        print("Type a number");
        a = input.nextInt();
        print(a);
    }
    private static void example02(){
        print("Running example 02");
        int a;
        int b;
        int c;
        print("Type the first number");
        a = input.nextInt();
        print("Type the second number");
        b = input.nextInt();
        c = a + b;
        print(c);
    }
    private static void example3a(){
        print("Running example 03a");
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        double result = a / b;
        print(result);
    }
    private static void example3b(){
        print("Running example 03b");
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        double result = a % b;
        print(result);
    }
    private static void example04(){
        print("Running example 04");
        int a = 3;
        int b = 5;
        int c = 8;
        a = 5;
        b = c;
        c = a + b;
        print("The result is: " + c);
    }
    private static void example05(){
        print("Running example 05");
        int a = 8;
        int b = -2;
        int c = 9;
        a = b;
        b = c + 2;
        c = (b + a) * 2 ;
        print("The result is: " + c);
    }
    private static void example06(){
        print("Running example 06");
        int a = 1;
        int b = 3;
        int pom;
        pom = a;
        a = b;
        b = pom;
        print("a: " + a + " | b:" + b);
    }
    private static void example06b(){
        print("Running example 06b");
        int a = 1;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        print("a: " + a + " | b:" + b);
    }
    private static void example07(){
        print("Running example 07");
        int r = 3;
        int v = 5;
        double result = 3.14 * r*r * v;
        print("The result is: " + result);
    }
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
