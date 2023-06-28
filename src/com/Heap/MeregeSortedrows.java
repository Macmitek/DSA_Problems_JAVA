package com.Heap;

import java.util.PriorityQueue;


public class MeregeSortedrows {

  static   class Pair {
        int element;
        int row;
        int index;

        Pair(int element, int row, int index) {
            this.element = element;
            this.row = row;
            this.index = index;
        }
    }
    public static int[] merge(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] result = new int[n * m];

        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> a.element - b.element);

        for (int i = 0; i < n; i++) {
            heap.add(new Pair(matrix[i][0], i, 0));
        }

        for (int i = 0; i < n * m; i++) {
            Pair min = heap.poll();
            result[i] = min.element;

            if (min.index + 1 < m) {
                heap.add(new Pair(matrix[min.row][min.index + 1], min.row, min.index + 1));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2,7,10,17,25}, {-6, 0, 1,8,11}, {3,4,6,14,21},{7,10,14,19,23}};
        int[] result = merge(matrix);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

