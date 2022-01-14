package Pretest;

import java.util.Scanner;

public class Penjumlahan2Deret {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input nilai n :");
        int n = input.nextInt();

        int[] array3 = new int[n];
        int[] array3_1 = new int[n];
        int number3_1 = 2;
        int number3 = 3;
        int arraySum[] = new int[n];

        //Bilangan 3-1
        for (int i = 0; i < n ; i++) {
            array3_1[i]  = number3_1;
            number3_1   += 3;
        }

        //Bilangan 3
        for (int i = 0; i < n ; i++) {
            array3[i] = number3;
            number3  += 3;
        }
        for (int i = 0; i < n ; i++) {
            arraySum[i] = array3[i]+array3_1[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arraySum[i] +" ");
        }




    }
}