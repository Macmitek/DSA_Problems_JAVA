package com.Practise;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long A= sc.nextInt();
        int B = sc.nextInt();
       // System.out.println(215&(~(1<<2)));
        long res = solve(A,B);
        System.out.println("Res:"+res);

    }
    public static long solve(long A, int B) {
        for(int i=0;i<B;i++){
            A = A&(~(1<<i));
        }
        return A;
    }

}
