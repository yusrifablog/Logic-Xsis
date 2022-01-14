package Pretest;

import java.util.Scanner;

public class konversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input The Time :");
        String timeInput = input.nextLine();

        int hour = Integer.parseInt(timeInput.substring(0,2));

        if (hour < 0){
            System.out.println("Time Input is not valid");
        }
        if (hour > 12){
            hour-=12;
            System.out.print(hour + timeInput.substring(2,8) + "PM");

        }else if(timeInput.charAt(8)=='A'){
            if (hour == 12){
                System.out.print("00");
                System.out.println(timeInput.substring(2,8));
            }else{
                System.out.print(timeInput.substring(0,8));
            }
        }else{
            if(hour == 12 ){
                System.out.print("12");
                System.out.println(timeInput.substring(2,8));
            }else {
                hour +=12;
                System.out.print(hour);
                System.out.println(timeInput.substring(2,8));
            }
        }
    }
}
