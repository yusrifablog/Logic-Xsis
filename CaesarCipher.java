package com.company.logic04;

import java.util.Scanner;

public class CaesarCipher {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Kalimat: ");
        String kalimat = input.nextLine();
        System.out.println("jumlah huruf yang akan berpindah: ");
        int nilai = input.nextInt();

        String teks = "";
        char huruf;
        //Huruf Asli (a b c d e f g h i j k l m n o p q r s t u v w x y z)
        for (int i = 0; i < kalimat.length(); i++) {
            //untuk tampungan huruf dalam kalimat, char at = posisi huruf pada kalimat
            huruf = kalimat.charAt(i);
            //untuk huruf kecil kondisi untuk huruf < 26
            if ( huruf >='a' && huruf<='z' ){
                nilai = nilai % 26;
                //indeks huruf ditambah nilai
                huruf = (char) (huruf + nilai);
                if (huruf>'z'){
                    //dibuat 26// -1 menentukan z karena posisi 26-1
                    //(huruf-26) itu dieksekusi dulu baru dikurangi -1
                    huruf = (char) (huruf - 26 -1);
                }
                // kalimat menjadi huruf yang sudah di urutkan dari belakang.
                teks = teks + huruf;
            }
            // untuk huruf besar
            else if ( huruf >= 'A' && huruf <='Z'){
                nilai = nilai % 26;
                huruf = (char) (huruf + nilai);
                if (huruf >'Z'){
                    huruf = (char) (huruf - 26 -1);
                }
                teks = teks + huruf;
            }else {
                teks = teks +huruf;
            }
        }
        System.out.println(teks);
    }
}
