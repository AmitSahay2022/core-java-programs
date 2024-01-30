package com.dsa;

public class TestBST {
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        System.out.println( tree.insert(5));
        System.out.println(tree.insert(4));
        System.out.println(tree.insert(8));
        System.out.println(tree.insert(2));
        System.out.println(tree.insert(10));
        System.out.println(tree.contains(13));
    }
}
