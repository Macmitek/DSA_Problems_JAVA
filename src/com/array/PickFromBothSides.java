package com.array;

import java.util.Scanner;

public class PickFromBothSides {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Size: ");
//        int N = sc.nextInt();
//        int A[] = new int[N];
//        System.out.println("Enter Array Elements: ");
//
//        for (int i=0;i<N;i++) {
//            A[i] = sc.nextInt();
//        }
//        System.out.println("//////////////////////////////////");
//        for(int j=0;j<N;j++){
//            System.out.print(A[j]+" ");
//        }
//        System.out.println("Enter How many Elements to Pick: ");
//        int B = sc.nextInt();
        int A[] = { -584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786, -737, -687, -645, 185, -947, -88, -192, 832, -55, -687, 756, -679, 558, 646, 982, -519, -856, 196, -778, 129, -839, 535, -550, 173, -534, -956, 659, -708, -561, 253, -976, -846, 510, -255, -351, 186, -687, -526, -978, -832, -982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874, -628, -841, 833, -930, 487, -703, 518, -823, 773, -730, 763, -332, 192, 985, 102, -520, 213, 627, -198, -901, -473, -375, 543, 924, 23, 972, 61, -819, 3, 432, 505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187, -640, -587, -26, -730, 170, -765, -167, 711, 760, -104, -333
        };
        int B = 32;
        int res = solve(A,B);
        System.out.println("The Maximum sum is : "+res);


    }
    public static int solve(int[]  A,int B){
        int N = A.length;

        int PS[] = new int[N];
        PS[0] = A[0];

        for(int i=1;i<N;i++){
            PS[i] = PS[i-1] + A[i];
        }


        for(int i=1;i<N;i++){
            System.out.print(PS[i]+ " ");
        }
        System.out.println("Length of PS: "+PS.length);

        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        if(B==N){
            maxSum = PS[N-1];
        }
        else {
            for (int i = 0; i <= B; i++) {
                if(i==0){
                    sum = PS[N - 1] - PS[N - (B - i + 1)];
                }
                else {
                    sum = PS[i - 1] + PS[N - 1] - PS[N - (B - i + 1)];
                    }
                if(maxSum<sum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
