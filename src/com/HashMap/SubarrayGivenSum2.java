package com.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayGivenSum2 {
   public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter B");
        int B = sc.nextInt();
        int res[] = solve(A,B);
        for (int i=0;i<res.length;i++){
            System.out.print(" "+res[i]);
        }

    }
    public  static int[] solve(int[] A, int B) {
        int N = A.length;
        Long currSum = 0l;
        int start=0;
        int end = -1;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            currSum+=A[i];
            if(currSum-B ==0){
                start =0;
                end = i;
                break;
            }
            if(map.containsKey(currSum-B)){
                start = map.get(currSum-B) +1;
                end = i;
                break;
            }
            map.put(currSum,i);
        }
        int[] ans = new int[end-start+1];
        if(end ==-1){
           return  new int[] {-1};
        }
        else{
            for(int i=start;i<=end;i++){
                ans[i-start] = A[i];
            }
            return ans;
        }

    }

}
