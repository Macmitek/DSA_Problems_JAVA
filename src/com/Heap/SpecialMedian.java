package com.Heap;

import java.util.*;

public class SpecialMedian {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList(Arrays.asList(4,6,8,4));
        int ans =  solve(input);
        System.out.println("the ans is : "+ans);
    }
        public static int solve(ArrayList<Integer> A) {
            if (findMedian(A))
                    return  1;
            Collections.reverse(A);
            if(findMedian(A))
                    return 1;
            return 0;
        }
        public  static boolean findMedian(ArrayList<Integer> A){

            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for(int i=0;i<A.size()-1;i++){
                double median = 0;
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

               if(maxHeap.size() == minHeap.size()){
                   median =  ((double) maxHeap.peek() + (double) minHeap.peek())/2;
               }
               else{
                   median = (double) maxHeap.peek();
               }
               if(median == (double) A.get(i+1)) return true;

            }
            return  false;
        }
    }

