package com.company.logic05;

import java.util.Scanner;

public class Soal06Rekening {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan PIN  :");
        int pin = input.nextInt();
        //pin= 1234;

        if (pin != 1234){
            System.out.print("PIN SALAH");
            return;
        }

        System.out.print("Uang Yang Akan Disetor :");
        double saldoawal = input.nextInt();
        System.out.println("Pilihlah Menu Dibawah ini");

        System.out.println("1. Antar Rekening ");
        System.out.println("2. Antar Bank");
        System.out.print("Pilihan :");
        int pilihan =input.nextInt();

        int biayaAdmin =7500;

        switch (pilihan){
            case 1:
//                long batas = 9999999999L;
                System.out.print("Masukkan Rekening Tujuan :");
                long rekening1 = input.nextInt();
                if (rekening1 <=999999999 || rekening1 >= 9999999999L){
                    System.out.println("digit rekening tidak sesuai kemauan soal");
                    return;
                }

                System.out.print("Masukkan Nominal Transfer :");
                double saldotransfer1 = input.nextInt();
                if (saldotransfer1>saldoawal){
                    System.out.print("Saldo Anda Tidak Mencukupi ");
                }
                else {
                    System.out.print("Masukkan Pin :");
                    pin = input.nextInt();
                    if (pin == 1234){
                        saldoawal=saldoawal-saldotransfer1;
                        System.out.print("Transaksi berhasil, saldo anda saat ini Rp."+saldoawal);
                    }
                    else {
                        System.out.print("Pin Salah! Transaksi tidak terwujud");
                    }
                }
                break;

            case 2:
                System.out.print("Masukkan Kode Bank :");
                int kodebank = input.nextInt();

                System.out.print("Masukkan rekening tujuan :");
                long rekening2 = input.nextInt();
                if (rekening2 <=999999999 || rekening2 >= 9999999999L){
                    System.out.println("digit rekening tidak sesuai kemauan soal");
                    return;
                }

                System.out.print("Masukkan nominal transfer :");
                double saldotranfer2 = input.nextInt();
                if (saldotranfer2>saldoawal || saldotranfer2+biayaAdmin>saldoawal){
                    System.out.print("Saldo Anda Tidak Mencukupi ");
                }
                else{
                    saldoawal=saldoawal-saldotranfer2-biayaAdmin;
                    System.out.print("Transaksi berhasil, saldo anda saat ini Rp."+saldoawal);
                }

                break;
        }

    }


}
