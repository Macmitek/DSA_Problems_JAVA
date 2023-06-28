package com.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSelfcode {
    public static   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      public TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
    }
    public static void main(String[] args) {
        int[] A = {1 ,2 ,3, -1, -1, 4, -1, -1, 5, -1, -1};
        TreeNode node = deserialise(A);
        System.out.println("is balances ans :"+isBalanced(node));
    }
    public static TreeNode deserialise(int[] A) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new  TreeNode(A[0]);
        q.add(root);

        TreeNode curr;
        for(int i=1;i<A.length;i++){
            curr = q.remove();
            if(A[i]!=-1){
                curr.left = new TreeNode(A[i]);
                q.add(curr.left);
            }
            if(A[i+1]!=-1){
                curr.right = new TreeNode(A[i+1]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static int isBalanced(TreeNode A) {
        if(checkBalanced(A) == 0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int checkBalanced(TreeNode A) {
        if(A == null)
            return 1;

        int left = checkBalanced(A.left);
        int right = checkBalanced(A.right);

        if(left == 0 || right == 0) return 0;
        if(Math.abs(left-right) > 1) return 0;

        return Math.max(left, right)+1;
    }
}
