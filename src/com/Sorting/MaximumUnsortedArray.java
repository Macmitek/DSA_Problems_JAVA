package com.Sorting;

public class MaximumUnsortedArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] res = solve(A);
        for(int i: res){
            System.out.print(" "+i);
        }

    }
    public  static  int[] solve(int[] A){
        int[] ans =  new int[2];
        int N = A.length;
        int s =0,e=0;

        for(int i=0; i<N-1;i++){
            if(A[i+1]<A[i]){
                s = i;
                break;
            }
        }

        if(s == N-1){
            return  new int[]{-1};
        }

        for(int i=N-1; i>0;i--){
            if(A[i-1]>A[i]){
                e = i;
                break;
            }
        }
        int min=A[s],max = A[s];
        for(int i= s;i<=e;i++){
            max =  Math.max(max,A[i]);
            min =  Math.min(min,A[i]);
        }
        for(int i=0;i<s;i++){
            if(A[i]>min){
                s = i;
                break;
            }
        }
        for(int i= N-1;i>=e+1;i--){
            if(A[i]<max){
                e = i;
                break;
            }
        }
        ans[0] = s;ans[1] = e;
        return ans;
    }
}
