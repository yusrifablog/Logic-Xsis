package com.company.logic05;

import java.util.Scanner;

public class Soal01AngkaGanjilGenap {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan n :");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            if ( i % 2 ==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 1; i <= n ; i++) {
            if ( i % 2 ==0){
                System.out.print(i+" ");

            }
        }
    }
}