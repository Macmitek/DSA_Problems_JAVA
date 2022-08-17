package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ISDictOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> A = new ArrayList<>();
        for(int i=0;i<N;i++){
            A.add(sc.next());
        }
        String B = "adhbcfegskjlponmirqtxwuvzy";
        int res = solve(A,B);
        System.out.println("Ans is :"+res);
    }
    public  static  int solve(ArrayList<String> A,String B){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<B.length(); i++){
            map.put(B.charAt(i), i);
        }

        for(int i=0; i< A.size()-1 ; i++){

            String first = A.get(i);
            String second = A.get(i+1);

            int check = CheckSorted(first, second , map);
            System.out.println("check value :"+check);
            if(check == 0)
                return 0;
        }
        return 1;
    }
    public static int CheckSorted(String s1, String s2,HashMap<Character,Integer> map){
        for(int i=0,j=0 ;i< s1.length() && j< s2.length(); i++,j++)
        {
            if(s1.charAt(i)!= s2.charAt(j))
            {
                if(map.get(s1.charAt(i)) > map.get(s2.charAt(j)))
                {
                    return 0;
                }
                else{
                    return 1;
                }
            }
        }
        if(s1.length()>s2.length()){
            return 0;
        }
        return 1;


    }
}

