package com.company.logic04;

import java.util.Scanner;

public class HackerRankInAString {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        String hackerrank ="hackerank";

//
        System.out.print("Inputkan Kalimat :");
        String kalimat = input.nextLine();

        int count =0;
        for (int i = 0; i < kalimat.length(); i++) {
            if (count < hackerrank.length() && kalimat.charAt(i) == hackerrank.charAt(count)){
                count ++;
            }
        }
        System.out.println("apakah kalimat diatas mengandung hackerRank : ");
        if (count == hackerrank.length()){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
