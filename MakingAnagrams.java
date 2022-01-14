package com.company.logic04;

import java.util.Locale;
import java.util.Scanner;

public class MakingAnagrams {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("Teks pertama :");
        String kalimat1 = input.nextLine();

        System.out.print("Teks kedua :");
        String kalimat2 = input.nextLine();

        //merubah jika inputan yang hurufnya besar ke huruf kecil
        kalimat1 =kalimat1.toLowerCase();
        kalimat2 = kalimat2.toLowerCase();

        /* menghilangkan huruf yang sama*/
        int arrayTampung [] = new int[26]; // membuat tampungan dalam bentuk array
        for (int i = 0; i < kalimat1.length(); i++) {
            /* perulangan sebanyak huruf yang ada di kalimat 1*/
            arrayTampung[kalimat1.charAt(i)-'a']++;//a =97
            //menginilalisasikan huruf pada kalimat pertama ke dalam array tampung
        }
        for (int i = 0; i < kalimat2.length(); i++) {
            //perulangan sebanya huruf yang ada di kalimat 2
            arrayTampung[kalimat2.charAt(i)-'a']--;
            /*menginialisasikan huruf yang ada pada kalimat 2
            secara terbalik (misal abc di sini membaca menjadi cba
            dan ketika ada huruf yang tidak sama dengan kalimat 1
            pada arrayTampung
            */
        }

        int count =0; //membuat start penghitungan kalimat yang ada
        for (int i = 0; i < arrayTampung.length; i++) {
            // menghitung jumlah huruf yang ada di array tampung
            // sesuai yang ada pada kalimat 1 dan 2
            count = count +(Math.abs(arrayTampung[i]));//memulai penghitungan huruf yang sama
//            for (int j = 0; j < kalimat2.length(); j++) {
//                if (kalimat1.charAt(i) !=  kalimat2.charAt(j)){
//                    count = count +1 ;
//                }
//            }
        }
        System.out.print("Kata yang di remove ada sebanyak :" +count);
    }
}
