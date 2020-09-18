package cz.uhk.fim.algds;

import java.util.Scanner;

public class LessonTemplate {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        example01();
    }

    private static void example01(){
        print("Running example 01");

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
