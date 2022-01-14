package com.company.logic04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah karakter :");
        int n = input.nextInt();

        System.out.print("masukkan password :");
        String password = input.next();

        /* matcher sebuah tools untuk mencocokan pada setiap karakter
        dengan di pola
        * */
        Matcher number,lower,upper,karakter;

        number = Pattern.compile("[0123456789]").matcher(password);
        lower = Pattern.compile("[abcdefghijklmnopqrstuvwxyz]").matcher(password);
        upper = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]").matcher(password);
        karakter = Pattern.compile("[!@#$%^&*()-/+]").matcher(password);

        int count = 0;

        if(!number.find())//cek ada number nggak //
            count++;
        if(!lower.find())//cek ada huruf kecil apa ngga
            count++;
        if(!upper.find())//cek ada huruf besar apa ngga
            count++;
        if(!karakter.find())//cek ada karakter apa ngga
            count++;
        if(n+count<6){//cek kurang dari 6 apa ngga, kalau kurang ini kepake
            count=count+6-n-count;
        }
        System.out.println(count);//kalau strong dia 0
    }
}
