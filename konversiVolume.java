package Pretest;

import java.util.Scanner;

public class konversiVolume {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Pilih item untuk dikonversi ");
        System.out.println(" 1. Botol ");
        System.out.println(" 2. Teko ");
        System.out.println(" 3. Gelas ");
        System.out.println(" 4. Cangkir ");
        System.out.println(" input : ");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("Masukkan jumlah botol");
                int botol = input.nextInt();
                System.out.println("Konversi volume botol");
                System.out.println(botol + " botol = " +(int)(botol*2*2.5)+" Cangkir");
                System.out.println(botol + " botol = " +(botol*2)+" Gelas");
                System.out.println(botol + " botol = " +(double)(botol*2*2.5)/25+" Teko");
                break;
            case 2:
                System.out.println("Masukkan jumlah teko");
                int teko = input.nextInt();
                System.out.println("Konversi volume teko");
                System.out.println(teko + " teko = " +(teko*25)+" Cangkir");
                System.out.println(teko + " teko = " +(teko*10)+" Gelas");
                System.out.println(teko + " teko = " +(teko*5)+" Botol");
                break;
            case 3:
                System.out.println("Masukkan jumlah gelas");
                int gelas = input.nextInt();
                System.out.println("Konversi volume gelas");
                System.out.println(gelas + " gelas = " +(gelas*2.5)+" Cangkir");
                System.out.println(gelas + " gelas = " +(double)(gelas*0.5)+" Botol");
                System.out.println(gelas + " gelas = " +(double)(gelas*0.1)+" Teko");
                break;
            case 4:
                System.out.println("Masukkan jumlah cangkir");
                int cangkir = input.nextInt();
                System.out.println("Konversi volume cangkir");
                System.out.println(cangkir + " cangkir = " +(cangkir/2.5)+" Gelas");
                System.out.println(cangkir + " cangkir = " +(cangkir/5)+" Botol");
                System.out.println(cangkir + " cangkir = " +(cangkir/25)+" Teko");
                break;
        }





    }
}