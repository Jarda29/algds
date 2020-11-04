package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson05Homework {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        task02();
    }

    private static void task01(){
        print("Running 01");
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        while (a>b)
        {
            a = a - b;
        }
        System.out.println(a);
    }
    private static void task02(){
        print("Running 02");
        int [] pole = new int[10];
        int max = 0;
        int min = 0;
        int pozicemin = 0;
        int pozicemax = 0;
        for(int i = 0; i<=9; i++)
        {
            print("Načti číslo");
            int a = input.nextInt();
            if(i == 0) {
                min = a;
                pozicemin = i+1;
            }
            pole[i] = a;
            if(a > max){
                max = a;
                pozicemax = i+1;
            }
            if(a < min){
                min = a;
                pozicemin = i+1;
            }
        }
        for (int cisla : pole) {
            System.out.print(cisla + ", ");
        }
        System.out.print("Maximální: " + pozicemax +". " + max);
        System.out.print(" Minimální: " + pozicemin +". " + min);
    }
    private static void task03(){
        print("Running 04");

    }
    private static void task04(){
        print("Running 04");

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
