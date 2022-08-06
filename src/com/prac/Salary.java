package com.prac;

import java.util.Arrays;

public class Salary {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};

        double result = average(salary);
        System.out.println(result);
    }
    public static double average(int[] salary) {

        Arrays.sort(salary);

        int avg =0;
        int total =0;
        for(int i=1;i<salary.length-1;i++){
            total = total + salary[i];
            System.out.println("value:"+salary[i]);
        }
        System.out.println("Total ="+total);
        avg = total/(salary.length-2);

        return avg;
    }
}
