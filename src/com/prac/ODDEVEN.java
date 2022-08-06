package com.prac;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ODDEVEN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1;i<=T;i++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();

            for (int j = 0; j<N; j++) {
                A[j] = sc.nextInt();
                if (A[j] % 2 == 0)
                    even.add(A[j]);
                else
                    odd.add(A[j]);
            }
            for (int k = 0; k<odd.size(); k++)
                System.out.print(odd.get(k) + " ");
            System.out.println();
            for (int k = 0; k<even.size(); k++)
                System.out.print(even.get(k) + " ");
            System.out.println();
        }

    }
}








