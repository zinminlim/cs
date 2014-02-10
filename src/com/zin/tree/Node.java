package com.zin.tree;

import org.StructureGraphic.v1.DSTreeNode;

import java.awt.*;

/**
 * Created by zlim on 2/9/14.
 */
public class Node implements DSTreeNode {

    private int value = 0;
    private Node leftChild = null;
    private Node rightChild = null;

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public DSTreeNode[] DSgetChildren() {
        return new DSTreeNode[]{leftChild,rightChild};
    }

    public Object DSgetValue() {
        return value;
    }
    public Color DSgetColor() {
        return Color.BLACK;
    }



}
