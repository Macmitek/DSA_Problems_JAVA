package com.Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DistinctElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter Window Size: ");
        int B = sc.nextInt();
        int res[] = solve(A,B);
        for(int ch: res){
            System.out.print(" "+ch);
        }


    }
    public static int[] solve(int[] A,int B){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = A.length;
        for(int i=0;i<B;i++){
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
            }
        }

        list.add(map.size());

        for(int i=B;i<N;i++){
            if(map.get(A[i-B])==1){
                map.remove(A[i-B]);
            }
            else{
                map.put(A[i-B],map.get(A[i-B])-1);
            }

            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
            list.add(map.size());
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;

    }
}
