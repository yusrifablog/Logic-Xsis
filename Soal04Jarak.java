package com.company.logic05;

import java.util.Scanner;

public class Soal04Jarak {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        double [] jarak = {2,0.5,1.5,2.5};
        double total =0;
        System.out.print("Masukkan jumlah tempat yang ingin di tuju : ");
        int n = input.nextInt();
        if (n > 4){
            System.out.println("Tempat tidak ada");
        }
        else {
            for (int i = 0; i < n; i++) {
                total = total +jarak[i];
            }
            double totaljarak = (total*2);
            System.out.println("Total perjalanan sampai kembali ke toko : ");
            System.out.println(totaljarak+ " KM");
            double totalbensin = totaljarak/2.5;
            System.out.print("Bensin yang diperlukan: "+totalbensin+"Liter");
//        }
//        int[] ArrTotal = new int[n];
//        for (int i = 0; i <n ; i++) {
//            int toko = 0, tempat1 = 2000, tempat2 = 500, tempat3 = 1500, tempat4 = 2500;
//            double total = 0;
//            System.out.print("masukkan tempat yang di tuju :\n" +
//                                "1. Toko\n" +
//                                "2. Tempat 1\n" +
//                                "3. Tempat 2\n" +
//                                "4. Tempat 3\n" +
//                                "5. Tempat 4\n" +
//                                "6. Kembali ke toko\n" +
//                                "Masukkan Pilihan : ");
//            int pilihan = input.nextInt();
//            System.out.println();
//            //maenin logikanya gih.. linear tpi klo dari T2 ke t4 susah wkwkwkwkw
//            if (pilihan == 1){
//                ArrTotal[i] = toko;
//            }
//            else if (pilihan == 2){
//                if (ArrTotal[i-1]==0) ArrTotal[i] = 2000;
//                else if (ArrTotal[i-1]-500 == 2000) ArrTotal[i] = ArrTotal[i-1]+500;
//            } else if (pilihan == 3){
//                if (ArrTotal[i-1] <= 2000)
//                    ArrTotal[i] = 500;
//                else
//                    ArrTotal[i] = ArrTotal[i-1]+500;
//            } else if (pilihan == 4){
//                if (ArrTotal[i-1] == 2500)
//                ArrTotal[i] = ArrTotal[i-1]+1500;
//                else ArrTotal[i]=  2000+500+1500;
//            } else if (pilihan == 5){
//                ArrTotal[i] = ArrTotal[i-1]+2500;
//            } else if (pilihan == 6){
//                for (int j : ArrTotal) {
//                    total = total+(j *2);
//                }
//                System.out.println("total km : "+total/1000+" KM");
//                System.out.println("Bensin yang diperlukan adalah "+(total/1000)/2.5+" liter");
//            }
        }
    }
}
