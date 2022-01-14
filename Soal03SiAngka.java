package com.company.logic05;

import java.util.Scanner;

public class Soal03SiAngka {

    public static void Resolve() {
        Scanner input = new Scanner(System.in);

//        System.out.println("Masukkan n :");
//        int n = input.nextInt();
//
//        int seratus = 100;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++) {
//                if (i==0){
//                    seratus = j;
//                }
//                else if(i==1){
////                    seratus =  Math.pow(n);
//                }
//            }
//            System.out.println();
//        }
//

        System.out.println("Input nilai n :");
        int n = input.nextInt();
        int flag= 0;
        int angka = 100;

        while (flag < n) {
            String angkaString = Integer.toString(angka);
            int sum = 0;
            for (int j = 0; j < angkaString.length(); j++) {
                int x = Integer.parseInt(angkaString.substring(j, j + 1));
                int kuadrat = (int) Math.pow(x, 2);
                sum += kuadrat;
            }
            if (sum == 1) {
                System.out.println(angka + " Si Angka 1");
                flag++;
            } else if (sum>=10){
                int counter = 0;
                int simpan = sum;
                while (counter < 1) {
                    int sumTemporary = 0;
                    String temp = Integer.toString(simpan);
                    for (int i = 0; i < temp.length(); i++) {
                        int check = Integer.parseInt(temp.substring(i, i + 1));
                        int power = (int) Math.pow(check, 2);
                        sumTemporary += power;
                    }
                    if (sumTemporary == 1) {
                        System.out.println(angka + " Si Angka 1");
                        flag++;
                        counter++;
                    }else if (sumTemporary<9) {
                        counter++;
                    }
                    simpan=sumTemporary;
                }
            }
            angka += 1;
        }

    }
}
