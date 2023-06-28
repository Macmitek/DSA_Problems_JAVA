package com.HashMap;

import java.util.HashMap;

public class PermutationAB {
    public static void main(String[] args) {
        String A = "abc";
        String B = "abcbacabc";
        int res = solve(A,B);
        System.out.println("Ans is: "+res);
    }
    public static int solve(String A, String B) {
        int n =  A.length();
        int m = B.length();
        HashMap<Character,Integer> mapA = new HashMap<>();
        HashMap<Character,Integer> mapB = new HashMap<>();
        int count = 0;
        // filling hasmap A till A size
        for(int i=0;i<n;i++){
            char value = A.charAt(i);
            if(mapA.containsKey(value)){
                mapA.put(value,mapA.get(value)+1);
            }else{
                mapA.put(value,1);
            }
        }
        System.out.println("map 1 round : "+mapA);
        // filling hash map B till first N elements
        for(int i=0;i<n;i++){
            char val =  B.charAt(i);
            if(mapB.containsKey(val)){
                mapB.put(val,mapB.get(val)+1);
            }else{
                mapB.put(val,1);
            }
        }
        System.out.println("map 2 round : "+mapB);
        // comparing both hashmap if Both have same freq
        if(mapA.equals(mapB)) count++;
        System.out.println("count on 1 round : "+count);
        for(int j=0,i=n;i<m;i++,j++){
            mapB.put(B.charAt(j),mapB.get(B.charAt(j))-1);
            System.out.println("mapA : "+mapA +" and mapB: "+mapB);
            if(mapB.get(B.charAt(j))==0){
                mapB.remove(B.charAt(j));
            }
            System.out.println(" after remove op :: mapA : "+mapA +" and mapB: "+mapB);
            if(mapB.containsKey(B.charAt(i))){
                mapB.put(B.charAt(i),mapB.get(B.charAt(i))+1);

            }
            else{
                mapB.put(B.charAt(i),1);
            }
            System.out.println("mapA1 : "+mapA +" and mapB1: "+mapB);
            if(mapA.equals(mapB)) count++;
            System.out.println(" count end "+count);
        }
        return count;
    }
}
