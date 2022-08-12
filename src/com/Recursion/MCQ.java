package com.Recursion;

import java.util.Scanner;

public class MCQ {
    public static void main(String[] args) {

            int res = solve(10);
            System.out.println("Ans is: "+res);
        }
        public static int solve(int A){
            if(A==0){
                return 0;
            }else{
                return (A%10 + solve(A/10));
            }

        }
    }
