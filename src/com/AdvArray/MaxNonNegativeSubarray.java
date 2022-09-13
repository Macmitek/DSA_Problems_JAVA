package com.AdvArray;

import java.util.Scanner;

public class MaxNonNegativeSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        int res[] = solve(a);
        System.out.println("Ans is:"+res);

    }
    public  static  int[] solve(int[] A){
        int n = A.length;
        int tmp_len= 0;
        int max_len_so_far = 0;
        int start_index =0;

        for (int i = 0; i < n; i++) {
            if (A[i]>0){
                tmp_len++;
            }
            else{
                tmp_len=0;
            }
            if(tmp_len>max_len_so_far){
                max_len_so_far=tmp_len;
                start_index=i-max_len_so_far+1;
            }
        }
        int ans[] = new int[max_len_so_far];
        int x=0;
        for(int j=start_index;j<start_index+max_len_so_far;j++){
            ans[x] = A[j];
            x++;
        }

        return ans;
    }
}
