package com.company.logic04;

import java.util.Scanner;

public class CamelCase {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan Kata Yang Akan :"); //huruf awal harus huruf kecil
        String kata = input.next(); // inputan kata ditampung di variabel "kata"

        int hitung=1; //mulai dari 1 karena kata pertama, ketika ketemu huruf besar maka ditambah 1
        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);
            if (huruf >= 'A' && huruf <='Z' ){
                hitung ++;
            }
        }
        System.out.print("Jumlah Kata Pada Kalimat Tersebut Adalah : "+hitung);


    }
}
