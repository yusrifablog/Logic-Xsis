package Pretest;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] recordPenjualan={"Apel=1", "Pisang=3", "Jeruk=1","Apel=5","Jeruk=8","Mangga=1"};
        Arrays.sort(recordPenjualan);

        System.out.print(Arrays.toString(recordPenjualan));


    }
}