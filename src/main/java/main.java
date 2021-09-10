import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main<sout> {
    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = 12;
        z = x + y;
        System.out.println("wynik dodawania 2 licz " + z);

        //Obwod trójkata
        int a, b, c;
        a = 5;
        b = 6;
        c = 9;
        int obwodTrojkata1 = a + b + c;
        System.out.println("Obwod trójkata wynosi " + obwodTrojkata1);

        //aktualna data
        int dzien = 7;
        int miesiac = 9;
        int rok = 2021;
        System.out.println("Dzisaj jest " + dzien + "-" + miesiac + "-" + rok);

        //Liczba miesiecy w roku
        final int liczbaMesiecywRoku = 12;
        System.out.println("liczba miesiecy w roku to " + liczbaMesiecywRoku);

        //wypisz swoje inicjały
        char T = 'T';
        char P = 'P';
        System.out.println("Inicjały " + T + "." + P);

        /*Napisz program, który pobierze od użytkownika trzy boki trójkąta, policzy jego obwód
        i wypisze wynik na ekran.*/
        int k, l, p;

        System.out.println("Podaj pierwszy bok trójkata");
        k = getInt();
        System.out.println("Podaj drugi bok trójkata");
        l = getInt();
        System.out.println("Podaj trzeci bok trójkata");
        p = getInt();
        int obwodTrójkataa = k + l + p;
        System.out.println("Obwod trojkata wynosi " + obwodTrójkataa);
        //Napisz program ktory po wprowadzeniu 3 stringow, wydrukuje je od tylu.

        String word1,word2,word3;
        System.out.println("Podaj pierwsze słowo ");
        word1=getString();
        System.out.println("Podaj pierwsze słowo ");
        word2=getString();
        System.out.println("Podaj pierwsze słowo ");
        word3=getString();
        String rev=word3+word2+word1;
        System.out.println("Stringi od tyłu "+rev);

    }
    public static String getString(){
        return new Scanner(System.in).next();
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();

    }
}



