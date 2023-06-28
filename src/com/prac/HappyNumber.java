package com.prac;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int[][] mat = {{4,13,7,2,5},{10,7,8,3,9},{6,9,7,3,1},{6,1,1,9,10},{4,5,7,13,7}};
        int res = solve(mat);
        System.out.println("the ans is :"+res);
    }
    public  static  int solve(int[][] matrix){
        int maxCount = -1;
        int[][] maxMatrix = new int[3][3];

        for(int i=1;i<4;i++){
            for(int j=1; j<4;j++){
                int count = countHappyNumbers(matrix,i,j);
                if(count>maxCount){
                    maxCount = count;
                    maxMatrix = new int[][]{
                            {matrix[i-1][j-1],matrix[i-1][j],matrix[i-1][j+1]},
                            {matrix[i][j-1],matrix[i][j],matrix[i][j+1]},
                            {matrix[i+1][j-1],matrix[i+1][j],matrix[i+1][j+1]}
                    };
                }
            }
        }
        if(maxCount ==0){
            System.out.println("No Happy numbers found");
        }
        else{
            for(int i=0;i<3;i++){
                for(int j=0; j<3;j++){
                    System.out.print(maxMatrix[i][j]+" ");
                }
                System.out.println();
            }
        }
       return  maxCount;
    }
    public static int countHappyNumbers(int[][] matrix, int row, int col){
        int count = 0;
        for(int i=row-1;i<=row+1;i++){
            for(int j=col-1;j<=col+1;j++){
                if(isHappy(matrix[i][j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isHappy(int n){
        HashSet<Integer> seen = new HashSet<Integer>();
        while(n!=1){
            int sum = 0;
            while(n!=0){
                int digit = n%10;
                sum+= digit * digit;
                n/=10;
            }
            if(seen.contains(sum)){
                return false;
            }
            seen.add(sum);
            n=sum;
        }
        return true;
    }
}
