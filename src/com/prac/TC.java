package com.prac;

public class TC {
    public static void main(String[] args) {
        int N = 1000;
        //int i=0;
        int outcnt = 0;
        int inncnt = 0;
        //while (i * i <= N) {
          //  System.out.println("Most outer i :"+i);
            for (int i = 1; i * i<= N ; i++) {
                outcnt++;
                System.out.println("value of i in outer loop:" + i+ "outcount :"+outcnt);
                for (int j = i; j*j <= i; j+=i) {
                    inncnt++;
                    System.out.println("inside loop value of i:"+i+" and j:" + j+" inner coutn :"+inncnt);
                }
            }
            //i++;
            //System.out.println("value of i in most outer :"+i);
       // }
    }
}
