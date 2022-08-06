package com.ModularArithmetic;

import java.util.Scanner;

public class OverLapRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        int G = sc.nextInt();
        int H = sc.nextInt();
        int res = solve(A,B,C,D,E,F,G,H);
        System.out.println("Result is:"+res);

    }
    public static int solve(int A,int B,int C, int D, int E, int F,int G, int H){
        if((A<E && E<C && B<F && F<D)||(A<G && G<C && B<H && H<D)){
            return 1;
        }
        return 0;
    }
}
//  if (G > A & H > B & D > F & C > E) {
//          return 1;
//          }
//          return 0;
