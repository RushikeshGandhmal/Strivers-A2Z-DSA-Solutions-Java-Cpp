/* 
Input:      
          20
        /    \
      8       22 
    /   \
   4    12 
       /   \
      10    14
Target Node = 8
K = 2
Output: 10 14 22
Explanation: The three nodes at distance 2
from node 8 are 10, 14, 22.

 */

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public void markParent(TreeNode root, Map<TreeNode, TreeNode> parentMap) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.left != null) {
                q.add(node.left);
                parentMap.put(node.left, node);
            }
            if (node.right != null) {
                q.add(node.right);
                parentMap.put(node.right, node);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        markParent(root, parentMap);

        Map<TreeNode, Boolean> vis = new HashMap<>();
        vis.put(target, true);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        int cur_dis = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            if (cur_dis == k)
                break;
            cur_dis++;

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();

                // parent
                if (parentMap.get(node) != null && vis.get(parentMap.get(node)) == null) {
                    q.add(parentMap.get(node));
                    vis.put(parentMap.get(node), true);
                }
                // left
                if (node.left != null && vis.get(node.left) == null) {
                    q.add(node.left);
                    vis.put(node.left, true);
                }
                // right
                if (node.right != null && vis.get(node.right) == null) {
                    q.add(node.right);
                    vis.put(node.right, true);
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty())
            res.add(q.poll().val);

        return res;
    }
}
