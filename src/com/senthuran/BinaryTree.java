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
        tree.root = new Node(5);
        tree.addRecursive(tree.root, 4);
        tree.addRecursive(tree.root, 2);
        tree.addRecursive(tree.root, 7);
        tree.addRecursive(tree.root, 15);
        tree.addRecursive(tree.root, 20);
        tree.addRecursive(tree.root, 3);
        tree.addRecursive(tree.root, 17);
        tree.addRecursive(tree.root, 1);
        binaryTree.treeTraverse(tree.root);

        System.out.println("");
        System.out.println("Checking for value");
        System.out.println("Checking for 5 " + tree.containsNode(tree.root, 5));
        System.out.println("Checking for 4 " + tree.containsNode(tree.root, 4));

        System.out.println("");
        System.out.println("Finding the  Depth");
        System.out.println("Depth of 20 is : " + tree.findHeight(tree.root, 20, 0));
        System.out.println("Depth of 22 is : " + tree.findHeight(tree.root, 22, 0));
        System.out.println("Depth of 2 is : " + tree.findHeight(tree.root, 2, 0));
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
                node.right = new Node(value);
            } else {
                addRecursive(node.right, value);
            }
        }
    }

    public boolean containsNode(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        }

        return value < node.value ? containsNode(node.left, value) : containsNode(node.right, value);
    }

    public int findHeight(Node node, int value, int count) {
        int height = count + 1;
        if (node == null) {
            return -1;
        }

        if (node.value == value) {
            return height;
        }

        return value < node.value ? findHeight(node.left, value, height) : findHeight(node.right, value, height);
    }
}
