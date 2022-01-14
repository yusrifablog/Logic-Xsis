package com.company.logic04;

import java.util.Scanner;

public class Pangrams {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan kalimat untuk di cek :");
        String kata = input.nextLine();

        int [] jumlahkata = new int[26];

        String ubahhurufkecil = kata.toLowerCase();

        //membuat variabel char dengan value inputan di convert ke char
        for (char ch : ubahhurufkecil.toCharArray()){//ch = nama charnya
            //jika char tidak sama dengan kosong maka jumlah kata char
            //itu dimulai dari a
            if (ch != ' '){
                jumlahkata[ch-'a']++;
            }
        }
        //count digunakan untuk menghitung atau menambah saat jumlah kata
        //dengan index j lebih dari 0
        int count = 0;
        for (int j = 0; j < 26; j++) {
            if (jumlahkata[j]>0){
                count++;
            }
        }
        //kodisi jika perhitungan count sama dengan 26
        //maka itu pangram
        if (count == 26){
            System.out.println("Ini Pangram");
        }else {
            System.out.println("Bukan Pangram");
        }


    }
}
