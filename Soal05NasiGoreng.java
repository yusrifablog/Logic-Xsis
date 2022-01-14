package com.company.logic05;

import java.util.Scanner;

public class Soal05NasiGoreng {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        /*
        hint. 1 org dewasa laki = 2 piring nasi goreng
        1 org dewasa perempuan = 1 piring mie
        2 org remaja = 2 mie ayam
        1 org anak2 = makan 1/2 nasgor
        1 org balita = 1 mangkok
        Jika total yg makan jumlahnya ganjil lebih dari 5 maka setiap perempuan nambah 1 piring
         */

        System.out.print("Laki - Laki :");
        int laki = input.nextInt();

        System.out.print("Perempuan :");
        int perempuan = input.nextInt();

        System.out.print("Remaja:");
        int remaja = input.nextInt();

        System.out.print("anak-anak :");
        double anak = input.nextInt();

        System.out.print("Balita :");
        int balita = input.nextInt();


        double jumlahorang = laki + perempuan + remaja + anak  + balita;
        System.out.println("jumlah orang : "+jumlahorang);

        if (jumlahorang >5 && jumlahorang % 2 == 1){
            if (laki > 0){
                laki = laki * 2;
            }
            if (perempuan > 0){
                perempuan = perempuan * 2 ;
            }
            if (anak > 0){
                anak = anak * 0.5 ;
            }
        }
        else {
            if (laki > 0){
                laki = laki * 2;
            }
            if (anak > 0){
                anak = anak * 0.5 ;
            }
        }

        double porsi = laki+perempuan+anak+remaja+balita;
        System.out.print("Total Porsinya adalah : " +porsi+" porsi");

    }
}
