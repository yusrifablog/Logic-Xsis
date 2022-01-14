package com.company.logic05;

import java.util.Random;
import java.util.Scanner;

public class Soal07Kartu {
    public static void Resolve() {
        Scanner scanner = new Scanner(System.in);

        int gambar = 0;
        int taruhan = 0;
        int total = 0;

        String main = "y";

        String pilihan = "";

        //random untuk mengacak nomer
        Random random = new Random();

        System.out.print("Masukan Jumlah Gambaran : ");
        gambar = scanner.nextInt();

        while (true){
            //bound untuk menentukan nilai yg di acak
            //dan +1 untuk parameter angka acak dimulai
            int nilaiRandomA = 1 + random.nextInt(10);
            int nilaiRandomB = 1 + random.nextInt(10);

            System.out.print("Berapa Jumlah Taruhanmu? ");
            taruhan = scanner.nextInt();

            if (gambar < taruhan){
                System.out.println("Gambaran kurang");
                break;
            }else {
                System.out.println("Pilih Gambar A atau B?");
                System.out.print("Pilih : ");
                pilihan = scanner.next();
            }
            if (pilihan.equals("A") || pilihan.equals("a")){
                if (nilaiRandomA > nilaiRandomB){
                    System.out.println(" Menang");
                    gambar += taruhan;
                    System.out.println("A " + nilaiRandomA);
                    System.out.println("B " + nilaiRandomB);
                    System.out.println("Gambaran Bertambah Menjadi " + gambar);
                }else if (nilaiRandomA == nilaiRandomB){
                    System.out.println(" Seri");
                    System.out.println("A " + nilaiRandomA);
                    System.out.println("B " + nilaiRandomB);
                    System.out.println("Jumlah Gambaran tetap " + gambar);
                }else {
                    System.out.println("  Kalah");
                    gambar -= taruhan;
                    System.out.println("A " + nilaiRandomA);
                    System.out.println("B " + nilaiRandomB);
                    System.out.println("Sisa Gambaran " + gambar);
                }
            }else if (pilihan.equals("B") || pilihan.equals("b")){
                if (nilaiRandomB > nilaiRandomA){
                    System.out.println(" Menang");
                    gambar += taruhan;
                    System.out.println("A " + nilaiRandomA);
                    System.out.println("B " + nilaiRandomB);
                    System.out.println("Gambaran Bertambah Menjadi " + gambar);
                }else if (nilaiRandomA == nilaiRandomB){
                    System.out.println(" Seri");
                    System.out.println("A " + nilaiRandomA);
                    System.out.println("B " + nilaiRandomB);
                    System.out.println("Jumlah Gambaran tetap " + gambar);
                } else {
                    System.out.println("  Kalah");
                    gambar -= taruhan;
                    System.out.println("A " + nilaiRandomA);
                    System.out.println("B " + nilaiRandomB);
                    System.out.println("Sisa Gambaran " + gambar);
                }
            }
            if (gambar <= 0){
                System.out.println("Permainan Selesai");
                break;
            }
        }
    }
}
