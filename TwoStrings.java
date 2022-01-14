package com.company.logic04;

import java.util.Scanner;

public class TwoStrings {
    public static void Resolve() {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        while(n-- > 0){
            char[] kalimat1 = input.next().toCharArray();
            char[] kalimat2 = input.next().toCharArray();
            int[] nampung = new int[256];//ascii ada 256
            String result = "NO";
            for(int i = 0; i < kalimat1.length; i++){
                nampung[kalimat1[i]]++;
            }

            for(int i = 0; i < kalimat2.length; i++){
                if(nampung[kalimat2[i]]>0){
                    result = "YES";
                }
            }
            System.out.println(result);
        }
    }
}
