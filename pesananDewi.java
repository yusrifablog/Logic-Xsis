package Pretest;

import java.util.Scanner;

public class pesananDewi {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input tanggal pemesanan dewi :");
        int tanggalPesan = input.nextInt();
        System.out.println();
        System.out.println("Input hari libur : ");
        String tanggalLibur = input.next();

        String[] inputSplit = tanggalLibur.split(",");
        int temp = 0;
        int tanggalLiburArr[]= new int[inputSplit.length];

        for (int i = 0; i < inputSplit.length ; i++) {
            temp = Integer.parseInt(inputSplit[i]);
            tanggalLiburArr[i]=temp;
        }

        int jumlahLibur=0;
        for (int i = 0; i < inputSplit.length; i++) {
            if (tanggalLiburArr[i] > tanggalPesan && tanggalLiburArr[i] <= tanggalPesan+7){
                jumlahLibur++;
            }
        }

        int tanggalSampai=tanggalPesan+7+(jumlahLibur+2);

        if (tanggalSampai > 31){
            tanggalSampai=tanggalSampai-31;
            System.out.print("Sampai pada tanggal " +tanggalSampai+ " di bulan berikutnya");
        }else {
            System.out.print("Sampai pada tanggal " +tanggalSampai+ " di bulan ini");
        }
    }
}