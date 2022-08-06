package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Leader2 {


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
        for (int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }


    }

    public static int[] solve(int[]  A){

        int N = A.length;
        boolean check;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<N;i++){
            check = true;
            for(int j=i+1;j<N;j++){
                if(A[j]>=A[i]){
                    check = false;
                    break;
                }
            }
            if(check){
                arr.add(A[i]);
            }
        }
        int ns = arr.size();
        int narr[] = new int[ns];
        for(int k =0;k < ns;k++){
            narr[k] = arr.get(k);
        }
        return narr;
    }
}
