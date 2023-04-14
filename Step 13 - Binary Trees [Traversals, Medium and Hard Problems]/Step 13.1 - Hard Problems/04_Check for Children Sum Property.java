/*

 Write a program that converts any binary tree to one that follows the children sum property.

The children sum property is defined as, For every node of the tree, the value of a node is equal to the sum of values of its children(left child and right child).

Note: 

The node values can be increased by 1 any number of times but decrement of any node value is not allowed.
A value for a NULL node can be assumed as 0.
You are not allowed to change the structure of the given binary tree.

 */

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

class Tree {
    public static void changeTree(Node root) {
        if (root == null)
            return;

        int child = 0;
        if (root.left != null)
            child += root.left.data;
        if (root.right != null)
            child += root.right.data;

        if (child > root.data)
            root.data = child;
        else {
            if (root.left != null)
                root.left.data = root.data;
            if (root.right != null)
                root.right.data = root.data;
        }

        changeTree(root.left);
        changeTree(root.right);

        int tot = 0;
        if (root.left != null)
            tot += root.left.data;
        if (root.right != null)
            tot += root.right.data;
        if (root.left != null || root.right != null)
            root.data = tot;
    }
}