package com.company.logic04;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan jumlah n: ");
        int n =input.nextInt();
        int counter = 0;//untuk menghitung jumlah abjad yang sama
        int [] arrayChar = new int[26];//tampungan abjad

        Set<Character> karakter = new HashSet<Character>(); //hashset kalau adayg double cuma 1 aja, Urut dari a -z

        System.out.println("masukkan huruf : ");
        for (int i = 0; i < n; i++) {
            String kata = input.next().toLowerCase();//kata kita input di taro di tampungan "kata"
            //looping untuk knampahin ke hashet
            for (int j = 0; j < kata.length(); j++) {
                char nampung = kata.charAt(j);//isinya nampung
                karakter.add(nampung);//nambahin ke hashset
            }
            //looping iterasi si hashet yang isinya karakter dan ditampung temp
            for (char temp : karakter){
                int nambah =(int) temp-'a';//a=97
                arrayChar[nambah]++;

                if (arrayChar[nambah] >= n){
                    counter++;
                }
            }
            karakter.clear();//tampungan karakter diapus
        }
        System.out.println(counter);
//
//        for (int i = 0; i < Gemstone.length(); i++) {
//            if (Gemstone.charAt(i)==Gemstone1.charAt(counter)){
//                counter +=1;
//            }
//        }
//        System.out.println("The Number of Gemstone " +counter);

    }

}
