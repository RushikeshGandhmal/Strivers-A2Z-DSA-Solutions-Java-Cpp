
/*
 Maximum Width of Binary Tree

Input: root = [1,3,2,5,3,null,9]
Output: 4
Explanation: The maximum width exists in the third level with length 4 (5,3,null,9).

 */

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Pair {
    TreeNode node;
    int num;

    Pair(TreeNode node, int num) {
        this.node = node;
        this.num = num;
    }
}

class Solution {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int width = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            int n = q.size();
            int min = q.peek().num; // to make the id starting from 0
            int first = 0, last = 0;

            for (int i = 0; i < n; i++) {
                int cur_id = q.peek().num - min; // cur_id is always zero || explanation at 21:00
                TreeNode node = q.peek().node;
                q.poll();

                if (i == 0)
                    first = cur_id;
                if (i == n - 1)
                    last = cur_id;

                if (node.left != null)
                    q.add(new Pair(node.left, 2 * cur_id + 1));
                if (node.right != null)
                    q.add(new Pair(node.right, 2 * cur_id + 2));
            }
            width = Math.max(width, last - first + 1);
        }
        return width;
    }
}
