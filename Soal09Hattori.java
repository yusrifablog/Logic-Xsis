package com.company.logic05;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Soal09Hattori {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan perjalan ninja hatori yang isinya cuma N sama T doang ya :");
        String journey = input.nextLine();

        int N = 0;
        int T = 0;
        int lembah= 0;
        int gunung= 0;
        for (int i = 0; i < journey.length(); i++) {
            if (journey.charAt(i) == 'N'){
                if (N == 0) {
                    N++;
                } else if(N != 0){
                    N++;
                }
                T++;
                if (T == 0 ) {
                    lembah++;
                }
            }else if (journey.charAt(i) == 'T'){
                if (T == 0) {
                    T--;
                } else if( T != 0) {
                    T--;
                }
                N--;
                if (N == 0) {
                    gunung++;
                }
            }
        }
        System.out.println("total gunung yang dinaiki : "+gunung+" gunung");
        System.out.println("total lembah yang dilewati : "+lembah+" Lembah");
//        System.out.println("Ninja Hatori Melewati "+gunung+" gunung dan "+lembah+" lembah");
//        int gunung =0 , lembah=0;
//        String huruf;
//        System.out.print("Masukkan jumlah perjalanan Ninja Hatori :");
//        int n = input.nextInt();

//        char jarak [] =kata.toCharArray();
//        String[] arraykata = new String[n];

//        System.out.println("Masukkan perjalan ninja hatori yang isinya cuma N sama T doang ya :");
//        huruf = input.nextLine();
//
//        char inputan[] = new char[100];
//
//        inputan=huruf.toCharArray();
//
//        System.out.print("isi array : ");
//
//        for (int i = 1; i <= inputan.length ; i++) {
//            if (inputan[i] == 'N'&& inputan[i+1] != 'N'){
//                gunung++;
////                System.out.print(inputan[i]);
//            } else if (inputan[i]== 'T' && inputan[i+1] != 'T' && inputan[i-1] == 'N'){
//                lembah++;
//            }
//            else  if (inputan[i] != 'T' || inputan[i] != 'N'){
//                System.out.println(/*"inputannya cuma bisa N sama T doang cuy!!!"*/inputan[i]);
//                break;
//            }
//        }
//        System.out.println("total gunung yang dinaiki : "+gunung+" gunung");
//        System.out.println("total lembah yang dilewati : "+lembah+" Lembah");
    }


}
