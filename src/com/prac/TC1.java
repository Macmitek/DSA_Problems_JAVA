package com.prac;

public class TC1 {
    public static void main(String[] args) {
        int N = 10;
        //int i=0;
        int outcnt = 0;
        int inncnt = 0;
        //while (i * i <= N) {
        //  System.out.println("Most outer i :"+i);
        for (int i = 0; i <(1 << N) ; i++) {
            outcnt++;
            System.out.println("value of i in outer loop:" + i+ "outcount :"+outcnt);
            int j=i;
            while(j>0){
                j-=1;
                inncnt++;
                System.out.println("inside loop value of i:"+i+" and j:" + j+" inner coutn :"+inncnt);
            }
        }
        //i++;
        //System.out.println("value of i in most outer :"+i);
        // }
    }
}
