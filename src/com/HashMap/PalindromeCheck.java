package com.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N =sc.next();
        int res = solve(N);
        System.out.println("Ans is : "+res);
    }
    public  static  int solve(String A){
        HashMap<Character,Integer> map = new HashMap<>();
        int N = A.length();
        for(int i=0;i<N;i++){
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i),map.get(A.charAt(i))+1);
            }else{
                map.put(A.charAt(i),1);
            }
        }
        int oddCount=0;

        for(int i=0;i<N;i++){
            if(map.get(A.charAt(i))%2==1){
                oddCount++;
            }
            if(oddCount>1){
                return  0;
            }
        }
        return 1;
    }
}
