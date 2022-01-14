package com.company.logic04;

import java.util.Scanner;

public class MarsExploration {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputan SOS  :");
        String kata = input.nextLine(); //inputan SOS nya ditampung di variabel kata
        int hitung =0;//count untuk menghitung jika ada perbedaan


        //Kamus = SOS
        for (int i = 0; i < kata.length(); i++) {
            if (i % 3 == 1) { //mod 3 karena huruf O berada di i yang bisa mod 3 =1
                if (kata.charAt(i) != 'O'){ //isi dari arraynya apakah O apa bukan,kalau bukan ditambahkan
                    hitung ++;
                }
            }
            else {
                if (kata.charAt(i) != 'S'){//isi dari arraynya apakah S apa bukan,kalau bukan ditambahkan
                    hitung++;
                }
            }
        }
        System.out.print("Perbedaannya Adalah :" +hitung);
    }
}
