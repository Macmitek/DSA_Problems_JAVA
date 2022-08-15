package com.Recursion;

import java.util.Scanner;

public class KthSymbol {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int res = solve(A,B);
            System.out.println("Ans is: "+res);

        }
        public static int solve(int A,int B){
        if(A==1 ){
            return 0;
        }
        if(B % 2 == 0){
            return solve(A - 1, B / 2) == 0 ? 1 : 0;
        }else{
            return solve(A - 1, (B + 1) / 2);
        }
    }

}
