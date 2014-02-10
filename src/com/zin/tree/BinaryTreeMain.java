package com.zin.tree;

/**
 * Created by zlim on 2/9/14.
 */
public class BinaryTreeMain {
    public static void main (String[] args){
        System.out.println("hello");
    }






    private Node buildBinaryTree(){
        Node root = new Node(5);
        Node ch1 = new Node(3);
        Node ch2 = new Node(6);
        Node ch3 = new Node(1);
        Node ch4 = new Node(4);

        root.setLeftChild(ch1);
        root.setRightChild(ch2);

        ch1.setLeftChild(ch3);
        ch1.setRightChild(ch4);
        return root;
    }
}
