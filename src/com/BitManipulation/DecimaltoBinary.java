package com.BitManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = solve(n);
        System.out.println("Res is  : "+res);


    }
    public static  int solve(int A){
        int n = A;
        ArrayList<Integer> bin = new ArrayList<Integer>();
        int i=0;
        while(n>0){
            bin.add(n%2) ;
            n=n/2;
            i++;
        }
        int cnt = 0;
        for(int j = 0 ; j<bin.size(); j++){
            if(bin.get(j)==1){
                cnt++;
            }
        }
        return cnt;
    }
}
