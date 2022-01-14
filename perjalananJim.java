package Pretest;

import java.util.Scanner;

public class perjalananJim {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input Catatan Perjalanan Jim :");
        String journey = input.nextLine().toLowerCase();

        int w = 0;
        int j = 0;
        int energi = 0;
        int lompat = 0;
        int jalan = 0;

        for (int i = 0; i < journey.length(); i++) {
            if (journey.charAt(i) == '-'){
                if (w == 0) {
                    w++;
                } else if(w != 0){
                    w++;
                }
                energi++;
            }else if (journey.charAt(i) == 'o'){
                if (j == 0) {
                    j++;
                    energi -=2;
                } else if( j != 0) {
                    j++;
                    energi -=2;
                }
            }
        }
        if (energi<=0){
            System.out.print("jim died pada lubang ke " +j);
        }else {
            System.out.println("Selamat selamat");
            System.out.println("total energy " +energi);
        }
    }
}