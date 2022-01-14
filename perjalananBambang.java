package Pretest;

import java.util.Scanner;

public class perjalananBambang {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input perjalanan Bambang :");
        String location  = input.nextLine();

        String[] locSplit = location.split("-");
        int[] arrayOflocation = new int[locSplit.length];
        int temp = 0;
        // input split kedalam array of element
        for (int i = 0; i < locSplit.length ; i++) {
            temp = Integer.parseInt(locSplit[i]);
            arrayOflocation[i]=temp;
        }

        double jarak     = 0;
        int speed     = 30;
        int time      = 10;
        int totalLoc = 0;
        double longTime = 0;

        //perhitungan jarak
        for (int i = 0; i < arrayOflocation.length; i++) {
            totalLoc+=1;
            if(arrayOflocation[i]==1 && i == 0){
                jarak = jarak+0.5;
            }if(arrayOflocation[i]==2 && i == 0){
                jarak = jarak + 2;
            }if(arrayOflocation[i]==3 && i == 0){
                jarak = jarak + 3.5;
            }if(arrayOflocation[i]==4 && i == 0){
                jarak = jarak + 5;
            }if (i < arrayOflocation.length-1){
                jarak = jarak+1.5;
            }
        }

        longTime = (double) (((jarak*2)/speed)*60) +(totalLoc*10);
        System.out.println("Waktu yang dibutuhkan " +longTime+ " menit");
        System.out.println("Total jarak yang ditempuh "+jarak*2);
    }
}