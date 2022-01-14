package com.company.logic04;

import java.util.Scanner;

public class Asterisk {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputan :");
        String kalimat = input.nextLine();

        //spasi yang digunakan untuk batasan split per kata
        String [] arrayString = kalimat.split(" ");//split berguna untuk mengambil kata dari kalimat
        String hasil ="";

        for (int i = 0; i < arrayString.length; i++) {
            String nampung = arrayString[i];//untuk menampung kata yg sudah di split tadi

            char [] arrayChar = nampung.toCharArray();//untuk merubah kedalam bentuk huruf dalam array
            for (int j = 0; j < arrayChar.length; j++) {
                if ( j>0 && j<arrayChar.length-1){ //j>0 karena yg di bintang j ke 1 dan (length-1) itu huruf sebelum yg paling terakhir
                    arrayChar[j] = '*';
                }
            }
            hasil = hasil + String.valueOf(arrayChar) +" "; //digabungin untuk membentuk suatu kalimat, String.valueOf digunakan untuk menampilkan value string dalam arrayChar
        }
        System.out.println("outputan dari kalimat diatas adalah: " + hasil);

    }
}
