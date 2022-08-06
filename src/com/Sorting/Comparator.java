package com.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(12);
        marks.add(34);
        marks.add(6);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
    }
}
