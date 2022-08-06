package com.array;

import java.util.Scanner;

public class Leader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        int res[] = solve(A);
        System.out.println("The Leader count is: "+res.length);
        for (int i=0;i<N;i++) {
            System.out.println(res[i]);
        }


    }

    public static int[] solve(int[]  A){

        int count_leader = 0;
        int N = A.length;
        int arr[] = new int[N];
        boolean check;
        for(int i=0;i<N;i++){
            check = true;
            for(int j=i+1;j<N;j++){
                if(A[j]>=A[i]){
                    check = false;
                    break;
                }
            }
            if(check){
                arr[i] = A[i];
                count_leader++;
            }
        }
        return arr;
    }
}
