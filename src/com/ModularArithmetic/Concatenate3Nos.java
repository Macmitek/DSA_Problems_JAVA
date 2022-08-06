package com.ModularArithmetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Concatenate3Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int res = solve(x,y,z);
        System.out.println("asn is :"+res);
    }
    public static int solve(int A,int B, int C){
        int ans = 0;
        int min=0;
        int max=0;
        int mid=0;
        if(A<=B && A<=C){
            min = A;
            if(B<=C){
                mid =B;
                max =C;
            }
            else{
                mid =C;
                max =B;
            }
        }
        else if(B<=A && B<=C){
                min = B;
                if(A<=C){
                    mid =A;
                    max =C;
                }
                else{
                    mid =C;
                    max =A;
                }
            }
        else if(C<=A && C<=B){
            min = C;
            if(A<=B){
                mid =A;
                max =B;
            }
            else{
                mid =B;
                max =A;
            }
        }

        ans = min*10000+mid*100+max;
        return  ans;
    }
}
