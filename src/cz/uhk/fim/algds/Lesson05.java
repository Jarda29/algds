package cz.uhk.fim.algds;

import java.util.Scanner;

public class Lesson05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        example01();
        //example02();
        //example03a();
        //example03b();
        //example04();
        //example05();
        //example06();
        //example07();
        //example08();
        //example09();
        //example10();
        //example11();
    }

    private static void example01() {
        print("Running example 01");
        print("Zadej cislo A: ");
        int a = input.nextInt();
        print("Zadej cislo B: ");
        int b = input.nextInt();
        print("Zadej cislo C: ");
        int c = input.nextInt();

        int soucet = a + b;
        int soucin = (a * c) * -b;
        int deleni = c / b;
        int modulo = a % c;

        print("Zadana cisla: a = " + a + ", b = " + b + ", c = " + c);
        print("Soucet: " + soucet + ", soucin: " + soucin + ", deleni: " + deleni + ", modulo: " + modulo);
    }

    private static void example02() {
        print("Running example 02");
        int a = 5;
        int b = 12;
        int c = b / a;
        if (c % 2 == 0) {
            a = a + 3;
            b *= 3;
        } else {
            a++;
            b = a;
            c = -a * 2;
        }
        print("A: " + a + ", B: " + b + ", C: " + c);
    }

    // varianta s for
    private static void example03a() {
        print("Running example 03a - for");

        print("Zadej pocet nacitanych cisel: ");
        int pocetZadavanychCisel = input.nextInt();
        for (int i = 0; i < pocetZadavanychCisel; i++) {
            print("Zadej cislo: ");
            int cislo = input.nextInt();
            if (cislo % 2 == 0 && cislo < 10) {
                print("Nalezene cislo: " + cislo);
                break; // break ukoncuje cyklus
            }
        }
    }

    // varianta s while
    private static void example03b() {
        print("Running example 03b - while");
        print("Zadej pocet nacitanych cisel: ");
        int pocetZadavanychCisel = input.nextInt();
        int i = 0;
        boolean cisloNalezeno = false;
        while (i < pocetZadavanychCisel && !cisloNalezeno) {
            print("Zadej cislo: ");
            int cislo = input.nextInt();
            if (cislo % 2 == 0 && cislo < 10) {
                print("Nalezene cislo: " + cislo);
                cisloNalezeno = true;
            }
            i++;
        }
    }

    private static void example04() {
        print("Running example 04");
        int poradi = 1;
        double soucet = 0;
        double soucin = 1;
        boolean dalsiCislo = true;
        while (dalsiCislo) {
            print("Zadej " + poradi + ". cislo: ");
            double cislo = input.nextDouble();
            if (cislo > 0) {
                if (poradi % 2 == 1) {
                    soucet += cislo;
                } else {
                    soucin *= cislo;
                }
                poradi++;
            } else {
                dalsiCislo = false;
                print("Soucet: " + soucet + ", soucin: " + soucin);
            }
        }
    }

    private static void example05() {
        print("Running example 05");
        int pocetCisel = 0;
        for (int i = 0; i < 13; i++) {
            print("Zadej cislo: ");
            int cislo = input.nextInt();
            if (cislo % 10 == 0) {
                pocetCisel++;
            }
        }
        print("Pocet cisel koncicich 0 je " + pocetCisel);
    }

    private static void example06() {
        print("Running example 06");
        print("Zadej pocet nacitanych cisel: ");
        int pocetCisel = input.nextInt();
        int suda = 0;
        int licha = 0;
        for (int i = 0; i < pocetCisel; i++) {
            print("Zadej cislo: ");
            int cislo = input.nextInt();
            if (cislo % 2 == 0) {
                suda++;
            } else {
                licha++;
            }
        }
        int modulo = suda % licha;
        print("Modulo 'suda % licha' je " + modulo);
    }

    private static void example07() {
        print("Running example 07");
        int pocetLichychCisel = 1;
        int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0, x8 = 0, x9 = 0;
        while (pocetLichychCisel <= 9) {
            print("Zadej " + pocetLichychCisel + ". cislo: ");
            int cislo = input.nextInt();
            if (cislo % 2 == 1) {
                if (pocetLichychCisel == 1) {
                    x1 = cislo;
                } else if (pocetLichychCisel == 2) {
                    x2 = cislo;
                } else if (pocetLichychCisel == 3) {
                    x3 = cislo;
                } else if (pocetLichychCisel == 4) {
                    x4 = cislo;
                } else if (pocetLichychCisel == 5) {
                    x5 = cislo;
                } else if (pocetLichychCisel == 6) {
                    x6 = cislo;
                } else if (pocetLichychCisel == 7) {
                    x7 = cislo;
                } else if (pocetLichychCisel == 8) {
                    x8 = cislo;
                } else {
                    x9 = cislo;
                }
                pocetLichychCisel++;
            }
        }
        print("|" + x1 + " " + x2 + " " + x3 + "|");
        print("|" + x4 + " " + x5 + " " + x6 + "|");
        print("|" + x7 + " " + x8 + " " + x9 + "|");
    }

    private static void example08() {
        print("Running example 08");
        print("Zadej pocet kreditu: ");
        int pocetKreditu = input.nextInt();
        print("Studovany rocnik: ");
        int rocnik = input.nextInt();
        print("Muzu pokracovat do dalsiho rocniku?");
        if (rocnik * 40 <= pocetKreditu) {
            print("Ano");
        } else {
            print("Ne");
        }
    }

    private static void example09() {
        print("Running example 09");
        print("Zadej pocet kreditu predmetu: ");
        int soucet = 0;
        while (soucet < 40) {
            int kredityPredmetu = input.nextInt();
            soucet += kredityPredmetu;
        }
        print("Tohle ti staci.");
    }

    private static void example10() {
        print("Running example 10");
        double soucin = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Zadej cislo: ");
            double cislo = input.nextDouble();
            if (i % 2 == 1) {
                soucin *= cislo;
            }
        }
        print("Soucin cisel je " + soucin);
    }

    private static void example11() {
        print("Running example 11");
        int nasPin = 2663;
        int pocetPokusu = 3;
        boolean zablokovanyUcet = false;
        boolean uspesnePrihlaseni = false;
        while (pocetPokusu > 0 && !uspesnePrihlaseni) {
            print("Zadej PIN: ");
            int zadanyPin = input.nextInt();
            if (zadanyPin > 999 && zadanyPin < 10000) {
                if (zadanyPin == nasPin) {
                    print("Prihlaseni uspesne.");
                    uspesnePrihlaseni = true;
                } else {
                    print("Nespravny PIN.");
                    pocetPokusu--;
                }
            } else {
                print("Zadany PIN ma nespavny pocet znaku.");
                pocetPokusu--;
            }
            if (pocetPokusu == 0) {
                zablokovanyUcet = true;
            }
        }
        if (uspesnePrihlaseni) {
            print("Vitejte ve svem uctu.");
        }
        if (zablokovanyUcet) {
            print("Vas ucet byl zablokovan.");
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
