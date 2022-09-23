package com.PrimeNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class CountOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer> res = solve(list);
        System.out.println("Ans is :"+res);

    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int count = 0;
        ArrayList<Integer> divisors = new ArrayList();

        for (int j=0; j<A.size(); j++){
            count=0;
            for (int i=1; i<=Math.sqrt(A.get(j)); i++){

                if(A.get(j)%i==0){
                    if (A.get(j)/i == i)
                        count++;
                    else
                        count=count+2;
                }
            }
            divisors.add(count);
        }
        return divisors;
    }

}