package com.senthuran;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        // Implementing random binary tree without having correct insertion order.
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(4);
        binaryTree.root.left.left = new Node(5);

        binaryTree.treeTraverse(binaryTree.root);
        System.out.println("");
        System.out.println("======= Binary Tree =======");
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(3);
        tree.addRecursive(tree.root, 4);
        tree.addRecursive(tree.root, 2);
        tree.addRecursive(tree.root, 7);
        tree.addRecursive(tree.root, 1);
        binaryTree.treeTraverse(tree.root);
    }

    public void treeTraverse(Node node) {
        if (node != null) {
            treeTraverse(node.left);
            System.out.print(" " + node.value);
            treeTraverse(node.right);
        }
    }

    public void addRecursive(Node node, int value) {
        if (value < node.value) {
            if (null == node.left) {
                node.left = new Node(value);
            } else {
                addRecursive(node.left, value);
            }
        }
        if (value > node.value) {
            if (null == node.right) {
                node.right = new Node(value);;
            } else {
                addRecursive(node.right, value);
            }
        }

    }
}
