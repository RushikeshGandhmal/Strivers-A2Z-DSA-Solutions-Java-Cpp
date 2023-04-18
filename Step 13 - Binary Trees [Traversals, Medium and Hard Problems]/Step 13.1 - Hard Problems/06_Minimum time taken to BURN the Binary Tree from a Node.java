/*
 Input:      
          1
        /   \
      2      3
    /  \      \
   4    5      6
       / \      \
      7   8      9
                   \
                   10
Target Node = 8
Output: 7
Explanation: If leaf with the value 
8 is set on fire. 
After 1 sec: 5 is set on fire.
After 2 sec: 2, 7 are set to fire.
After 3 sec: 4, 1 are set to fire.
After 4 sec: 3 is set to fire.
After 5 sec: 6 is set to fire.
After 6 sec: 9 is set to fire.
After 7 sec: 10 is set to fire.
It takes 7s to burn the complete tree.

 */

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    public static Node bfsToMapParent(Node root, Map<Node, Node> parentMap, int tar) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node target = null;

        while (!q.isEmpty()) {
            root = q.poll();
            if (root.data == tar)
                target = root;

            if (root.left != null) {
                q.add(root.left);
                parentMap.put(root.left, root);
            }
            if (root.right != null) {
                q.add(root.right);
                parentMap.put(root.right, root);
            }
        }
        return target;
    }

    public static int minTime(Node root, int tar) {

        Map<Node, Node> parentMap = new HashMap<>();
        Node target = bfsToMapParent(root, parentMap, tar);

        Map<Node, Boolean> vis = new HashMap<>();
        vis.put(target, true);
        Queue<Node> q = new LinkedList<>();
        q.add(target);

        int maxi = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                root = q.poll();

                // parent
                if (parentMap.get(root) != null && vis.get(parentMap.get(root)) == null) {
                    q.add(parentMap.get(root));
                    vis.put(parentMap.get(root), true);
                }
                // left
                if (root.left != null && vis.get(root.left) == null) {
                    q.add(root.left);
                    vis.put(root.left, true);
                }
                // right
                if (root.right != null && vis.get(root.right) == null) {
                    q.add(root.right);
                    vis.put(root.right, true);
                }
            }
            maxi++;
        }
        return maxi - 1;
    }
}