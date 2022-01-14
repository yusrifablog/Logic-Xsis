package com.company.logic05;

import java.util.Scanner;

public class Soal08Penjumlahan {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input nilai n :");
        int n = input.nextInt();
        int[] arrayFibonancy = new int[n];
        int[] arrayPrima = new int[n];

        //bilangan prima
        int k = 0;
        int bilangan = 0;
        while (k < n) {
            int check = 0; //counter
            for (int j = 2; j <= bilangan; j++) {
                if (bilangan % j == 0) {
                    check++;
                }
            }
            if (check == 1) {
                arrayPrima[k] = bilangan;
                System.out.print(arrayPrima[k]+" ");
                k++;
            }
            bilangan++;
        }
        System.out.println();

        //bilangan fibonancy
        int bilanganAwal = 0;
        int bilanganAkhir = 1;
        for (int i = 0; i < n; i++) {
            arrayFibonancy[i] = bilanganAkhir;
            int bilanganFibonansi = bilanganAwal + bilanganAkhir;
            bilanganAwal = bilanganAkhir;
            bilanganAkhir = bilanganFibonansi;
            System.out.print(arrayFibonancy[i] + " ");
            int result = arrayFibonancy[i];

        }

        System.out.println();
        //untuk cetak penambahan
        for (int j = 0; j < n ; j++) {
            int fibonancy = arrayFibonancy[j];
            int prima = arrayPrima[j];
            int total = fibonancy+prima;
            System.out.print(total);
            if (j<n-1){
                System.out.print(",");
            }
            else {
                System.out.println(".");
            }

        }

    }

}
