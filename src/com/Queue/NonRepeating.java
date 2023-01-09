package com.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class NonRepeating {
    public static void main(String[] args) {
        String A = "abadbc";
        String res = solve(A);
        System.out.println("Ans is:"+res);
    }
    public  static  String solve(String A){

        int N = A.length();
        Deque<Character> dq = new ArrayDeque<>();
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<N;i++){

            dq.add(A.charAt(i));

           // map.put(A.charAt(i),map.getOrDefault(A.charAt(i),0)+1);

            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i),map.get(A.charAt(i))+1);
            }else{
                map.put(A.charAt(i),1);
            }

            while(!dq.isEmpty() && map.get(dq.peek())>1){
                dq.remove();
            }

            if(!dq.isEmpty()){
                ans.append(dq.peek());
            }else{
                ans.append('#');
            }
        }

        return ans.toString();
    }
}
