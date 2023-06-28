package com.Trie;

import com.sun.source.tree.Tree;

import java.util.HashMap;

public class SpellChecker {
    int arr[];
     class TreeNode {
        HashMap<Character, TreeNode> map;
        boolean isEndofWord;

        public TreeNode() {
            map = new HashMap<>();
            this.isEndofWord = false;
        }
    }
    public   int[] solve(String[] A, String[] B){
        TreeNode root = new TreeNode();
        arr =  new int[B.length];
        int N = A.length;
        for(int i=0;i<N;i++){
            insertInTrie(root,A[i]);
        }
        int M = B.length;
        for(int i=0;i<M;i++){
            arr[i] = SearchInTrie(root,B[i]);
        }
        return arr;
    }
    public  void insertInTrie(TreeNode curr, String word){
    for(int i=0;i<word.length();i++){
        char ch = word.charAt(i);
        if(!curr.map.containsKey(ch)){
            TreeNode node =  new TreeNode();
            curr.map.put(ch,node);
        }
        curr =  curr.map.get(ch);
    }
    curr.isEndofWord = true;
    }

    public  int SearchInTrie(TreeNode curr, String word){
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!curr.map.containsKey(ch)){
                return 0;
            }
            curr =  curr.map.get(ch);
        }
        if(curr.isEndofWord = true) return 1;
        return 0;
    }
    public  void main(String[] args) {

    }
}
