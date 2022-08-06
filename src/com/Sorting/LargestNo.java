package com.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("Enter Array Elements: ");

        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        String res = largestNumber(A);
        System.out.println("Result is:"+res);

    }

    public  static String largestNumber(final int[] A) {
        int N = A.length;
        String[] strArray = new String[N];

        for (int i = 0; i < N; i++)
        {
            strArray[i] = Integer.toString(A[i]);
        }

            Arrays.sort(strArray,new Comparator<String>(){
            public int compare(String a, String b)
            {
                String o1 = a+b;
                String o2 = b+a;
                return o2.compareTo(o1);
            }
        });

        if(strArray[0].equals("0")){
            return "0";
        }

        String str="";
        for(int i =0;i<N;i++)
        {
            str = str + strArray[i];
        }

        return str;
    }
}
