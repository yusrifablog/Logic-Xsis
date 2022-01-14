package com.company.logic04;

import java.util.Scanner;

public class Palindrome {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("Kata Yang Akan Di Check :");
        String kata = input.nextLine();
        String cekpalindrom ="";
        int panjang = kata.length();
        for (int i = panjang-1; i >=0 ; i--) { //i mulai dari yg terbesar
            cekpalindrom = cekpalindrom + kata.charAt(i);//untuk mengembalikan karakter pada indeks tertentu dalam sebuah string. Indeks dari karakter pertama adalah 0, karakter kedua adalah 1, dan seterusnya.
        }
        if (kata.equalsIgnoreCase(cekpalindrom) ){ //equalsIgnoreCase ini digunakan untuk ketika huruf besar dan kecil tidak masalah, kalo make equals doang eror
            System.out.print(kata + ": YES");
        }
        else {
            System.out.print(kata + ": NO");
        }
    }
}
