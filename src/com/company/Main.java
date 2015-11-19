package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner wpisz = new Scanner(System.in);// tworzymy nowy Scanner
        System.out.println("1.Start programu.");// wywołujemy napis startu programu
        System.out.println("2.Wpisz,wyraz ciągu Fibonacci'ego.");// wywołujemy napis pomocniczy
        int wyraz = wpisz.nextInt();// deklarujemy zmienną
        wpisz.close();// zamykamy Scanner



        if(wyraz<=40){
            //Tworzymy instrukcję warunkową.
            System.out.print(wyraz + " wyraz ciągu obliczony rekurencyjnie: ");
            System.out.println(metoda_rekurencyjna(wyraz));
            System.out.println("Koniec programu.");
        }
        else
        // Instrukcja do wykonania w przypadku sprzeczności z warunkiem if .
            System.out.println("Koniec programu!");
    }
    public static int metoda_rekurencyjna(int n){
        //Tworzymy metodę do obliczenia
        if(n==1 || n==0){
            return n;
        }
        else
        // Instrukcja do wykonania w przypadku sprzeczności z warunkiem if.
            return metoda_rekurencyjna(n - 2) + metoda_rekurencyjna(n - 1);
    }

}


