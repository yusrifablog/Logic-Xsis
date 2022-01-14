package com.company.logic04;

import java.util.Scanner;

public class SeparateTheNumbers {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("panjang n :");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai n ke "+i+" :");
            String kata = input.next();
            boolean kebenaran = false;
            int awalan =0;
            //looping sebanyak kata yg diinputin dibagi 2,dibagi 2 buat check
            for (int j = 1; j <kata.length()/2 ; j++) {//j mulai dari 1 karena yg diambil posisi mulai dri 1 , klau 0 ga bisa
                int isi = Integer.parseInt(kata.substring(0,j)); //untuk ambil karakter pertama,(0,j) itu batas awal dan akhir
                awalan = isi; //awalan berubah jdi isinya
                String check = Integer.toString(isi); //balikin lagi ke string
                while (check.length() < kata.length()){//selama tampungan check kurang dri panjang string inputan
                    isi++; //isi ditambah 1
                    check = check + isi;//udh berubah string, jdi 1+1 bukan 2 tapi 1 1
                }
                if (check.equals(kata)){ //jika check itu sama dengan kata yg kita inputin
                    kebenaran = true;//maka jdi benar
                    break;
                }
            }
            if ( kebenaran ) {
                System.out.println("YES " +awalan );
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
