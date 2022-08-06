package com.prac;

import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for(int i =1 ;i<=N; i++){
            int  no = i;
            int sum = 0;
            while(no>0) {

                    int remainder = no % 10;
                    sum = sum + (remainder * remainder * remainder);
                    no = no / 10;
                }
            if(sum == i){
                System.out.println("sum is : "+sum);
            }
        }
    }
}
