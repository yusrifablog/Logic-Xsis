package com.company.logic05;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02UrutkanHuruf {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat :");
        String kata = input.nextLine();
        char arrayChar[] = kata.toCharArray();
        Arrays.sort(arrayChar);

        String nampung= "";
        String hurufvokal;
        String hurufkonsonan;
        //dibikini kecil semua hurufnya
        String kalimat = kata.toLowerCase();
        System.out.print("Huruf Vokal :" );


        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if ( huruf >='a' && huruf<='z' ){
                if (huruf =='a'|| huruf=='i' || huruf=='u'||huruf=='e'||huruf=='o'){
                    hurufvokal = huruf + nampung;
                    System.out.print(hurufvokal +" ");
                }
            }
        }

        System.out.println();
        System.out.print("Huruf Konsonan :");
        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if ( huruf >='a' && huruf<='z' ){
                if (huruf !='a'&& huruf !='i' && huruf !='u'&& huruf!='e'&& huruf!='o'){
                    hurufkonsonan = huruf + nampung;
                    System.out.print(hurufkonsonan+" ");
                }
            }
        }
    }
}
