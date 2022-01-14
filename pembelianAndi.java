package Pretest;

import java.util.Scanner;

public class pembelianAndi {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input saldo Andi :");
        int uangAndi = input.nextInt();
        System.out.println();
        System.out.println("Harga Kacamata : ");
        String hargaKacamata = input.next();
        System.out.println("Harga Baju : ");
        String hargaBaju = input.next();
        int temp = 0;

        //harga kacamata 1 1
        String[] kacamataSplit = hargaKacamata.split(",");
        int[] hargaKacamataArr= new int [kacamataSplit.length];
        for (int i = 0; i < kacamataSplit.length ; i++) {
            temp = Integer.parseInt(kacamataSplit[i]);
            hargaKacamataArr[i]=temp;
        }

        //harga baju 1 1
        String[] bajuSplit = hargaBaju.split(",");
        int[] hargaBajuArr= new int [kacamataSplit.length];
        for (int i = 0; i < bajuSplit.length ; i++) {
            temp = Integer.parseInt(bajuSplit[i]);
            hargaBajuArr[i]=temp;
        }


        int totalBelanja=0;
        int habisBelanja=0;
            for (int i = 0; i < hargaKacamataArr.length; i++) {
                for (int j = 0; j < hargaKacamataArr.length; j++) {
                    totalBelanja = hargaKacamataArr[i] + hargaBajuArr[j];
                    if (totalBelanja <= uangAndi && totalBelanja>=habisBelanja){
                        habisBelanja = totalBelanja;
                    }
                }
            }
        System.out.println("total belanja andi "+habisBelanja);
    }
}