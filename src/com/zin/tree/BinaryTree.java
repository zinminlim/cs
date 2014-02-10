package com.zin.tree;

import org.StructureGraphic.v1.*;

/**
 * Created by zlim on 2/9/14.
 */
public class BinaryTree {
    Node binaryTree = buildBinaryTree();
    //binaryTree.

    public void printTree(){
        TreePrinter.print(binaryTree);
    }

    private static Node buildBinaryTree(){
        Node root = new Node(5);
        Node ch1 = new Node(3);
        Node ch2 = new Node(6);
        Node ch3 = new Node(1);
        Node ch4 = new Node(4);

        root.setLeftChild(ch1);
        root.setRightChild(ch2);

       // ch1.setLeftChild(ch3);
       // ch1.setRightChild(ch4);
        return root;
    }


}
