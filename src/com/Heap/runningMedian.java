package com.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class runningMedian {
    public  static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList(Arrays.asList(5,17,100,11));
        ArrayList<Integer> ans = getMedian(input);
        System.out.println("The res is :"+ans);
    }


    public static ArrayList<Integer> getMedian(ArrayList<Integer> A) {
            ArrayList<Integer> arr = new ArrayList<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for(int i=0;i<A.size();i++){
                int num =  A.get(i);
                if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
                    maxHeap.add(num);
                } else {
                    minHeap.add(num);
                }

                if (maxHeap.size() > minHeap.size() + 1) {
                    minHeap.add(maxHeap.poll());
                } else if (minHeap.size() > maxHeap.size()) {
                    maxHeap.add(minHeap.poll());
                }

                    arr.add(maxHeap.peek());
            }
        return arr;
    }
}
