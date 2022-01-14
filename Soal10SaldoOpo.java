package com.company.logic05;

import java.util.Scanner;

public class Soal10SaldoOpo {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input saldo OPO:");
        int bayarOpo = input.nextInt();

        int hargaKopi=18000;
        double sisaSaldo = 0;
        double diskon=0.5;
        double cashback=0.1;
        int cup = 1;
        int saldoOpo = 0;

        if (bayarOpo>=40000 && bayarOpo<=100000){
            while (hargaKopi*diskon*cup<bayarOpo ){
                cup++;
            }
            cup=cup-1;
            double totalBayar = cup*hargaKopi*diskon;
            sisaSaldo = (bayarOpo-totalBayar)+(totalBayar*cashback);
            System.out.println("Jumlah cup : "+cup+ " Sisa saldo " +(int) sisaSaldo);
        }
        else if (bayarOpo>100000) {
            while (hargaKopi*diskon*cup<bayarOpo ){
                cup++;
            }
            cup=cup-1;
            double totalBayar = (cup*hargaKopi)-100000;
            sisaSaldo = (bayarOpo-totalBayar)+30000;
            System.out.println("Jumlah cup : "+cup+ " Sisa saldo " +(int) sisaSaldo);
        }
        else{
            System.out.print("Saldo Nggak cukup untuk dapetin cashback kopi ");
        }
//
//
//        int gelas = 18000, saldo, jumlah_cup = 0, min_discount = 40000, max_discount = 100000;
//        int temp = 0;
//
//        System.out.print("masukkan jumlah saldo opo : ");
//        saldo = input.nextInt();
//
//        int array[] = new int[saldo];
//
//        //perhitungan harga per gelas
//        //harga gelas diskon 50% - harga gelas setelah diskon 50% mendapatkan cashback
//
//        for (int i = 1; i <=saldo; i++) {
//            if (gelas*i <= saldo){
//                temp =gelas*i;
//                if (temp >=min_discount && temp <=max_discount){
//                    temp = (temp/2) - ((temp/2)*10)/100;
////                    System.out.println(temp);
//                    saldo = saldo-temp;
////                    System.out.println(saldo);
//                }
//            }
//        }
//        System.out.println(saldo);
////        System.out.println("jumlah gelas = "+jumlah_cup);
//
////        for (int i = 0; i <=saldo ; i++) {
////            hargacup_final = hargacup_final+hargacup_final;
////            if (hargacup_final <=saldo){
////                System.out.println(hargacup_final);
////            }
////        }

    }
}
