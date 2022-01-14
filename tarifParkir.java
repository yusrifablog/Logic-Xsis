package Pretest;

import java.util.Scanner;

public class tarifParkir {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tanggal dan Jam Masuk :");
        String inputMasuk = input.nextLine();
        System.out.println("Tanggal dan Jam Keluar : ");
        String inputKeluar = input.nextLine();

        // pembagian input
        String[] dataMasuk = inputMasuk.split(" ");
        String[] dataKeluar = inputKeluar.split(" ");

        // preprocc data
        int tanggalMasuk = Integer.parseInt(dataMasuk[0]);
        int tahunMasuk   = Integer.parseInt(dataMasuk[2]);
        int jamMasuk     = Integer.parseInt(dataMasuk[3].substring(0,2));
        int menitMasuk     = Integer.parseInt(dataMasuk[3].substring(3,5));
        String bulanMasuk = dataMasuk[1].toLowerCase();

        // preprocc bulan Masuk
        int bulan1 = 0;
        if (bulanMasuk.equals("januari")){
            bulan1 = 1;
        }if (bulanMasuk.equals("februari")){
            bulan1 = 2;
        }if (bulanMasuk.equals("maret")){
            bulan1 = 3;
        }if (bulanMasuk.equals("april")){
            bulan1 = 4;
        }if (bulanMasuk.equals("mei")){
            bulan1 = 5;
        }if (bulanMasuk.equals("juni")){
            bulan1 = 6;
        }if (bulanMasuk.equals("juli")){
            bulan1 = 7;
        }if (bulanMasuk.equals("agustus")){
            bulan1 = 8;
        }if (bulanMasuk.equals("september")){
            bulan1 = 9;
        }if (bulanMasuk.equals("oktober")){
            bulan1 = 10;
        }if (bulanMasuk.equals("november")){
            bulan1 = 11;
        }if (bulanMasuk.equals("desember")){
            bulan1 = 12;
        }
        int tanggalKeluar = Integer.parseInt(dataKeluar[0]);
        int tahunKeluar   = Integer.parseInt(dataKeluar[2]);
        int jamKeluar     = Integer.parseInt(dataKeluar[3].substring(0,2));
        String bulanKeluar = dataKeluar[1].toLowerCase();
        //Pre Proc Bulan Keluar
        int bulan2 = 0;
        if (bulanKeluar.equals("januari")){
            bulan2 = 1;
        }if (bulanKeluar.equals("februari")){
            bulan2 = 2;
        }if (bulanKeluar.equals("maret")){
            bulan2 = 3;
        }if (bulanKeluar.equals("april")){
            bulan2 = 4;
        }if (bulanKeluar.equals("mei")){
            bulan2 = 5;
        }if (bulanKeluar.equals("juni")){
            bulan2 = 6;
        }if (bulanKeluar.equals("juli")){
            bulan2 = 7;
        }if (bulanKeluar.equals("agustus")){
            bulan2 = 8;
        }if (bulanKeluar.equals("september")){
            bulan2 = 9;
        }if (bulanKeluar.equals("oktober")){
            bulan2 = 10;
        }if (bulanKeluar.equals("november")){
            bulan2 = 11;
        }if (bulanKeluar.equals("desember")){
            bulan2 = 12;
        }


        int biayaParkir=0;

        if (tanggalKeluar >= tanggalMasuk && bulan2 > bulan1 &&  jamKeluar >= jamMasuk ){
            if (jamKeluar-jamMasuk < 8){
                biayaParkir=(jamKeluar-jamMasuk)*1000;
            }else if(jamKeluar-jamMasuk > 8){
                biayaParkir=8000;
            }
            biayaParkir = (((bulan2-bulan1)*30*15000) +(tanggalKeluar-tanggalMasuk)*15000)+biayaParkir;
        }else {
            System.out.println("input parkir salah");
        }
        System.out.println("biaya parkir anda " +biayaParkir);
    }
}